package cn.wanli.auth.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.redis.RedisTokenStore;

import javax.annotation.Resource;

/**
 * 开启OAuth2认证服务
 * EnableAuthorizationServer 注解为微服务运行环境提供一个基于 OAuth2 协议的授权服务
 * 会暴露一系列的端点 /oauth/authorize,/oauth/token
 *
 * @author wanli
 */
@Configuration
@EnableAuthorizationServer
public class OAuth2ServiceConfiguration extends AuthorizationServerConfigurerAdapter {

    private static final Logger logger = LoggerFactory.getLogger(OAuth2ServiceConfiguration.class);

    /**
     * 密码模式需要注入认证管理器
     */
    @Resource
    private AuthenticationManager authenticationManager;
    @Resource
    private UserDetailsService userDetailsService;
    @Resource
    private RedisConnectionFactory redisConnectionFactory;
    @Resource
    private PasswordEncoder passwordEncoder;

    @Bean
    public TokenStore tokenStore() {
        return new RedisTokenStore(redisConnectionFactory);
    }

    /**
     * 配置AuthorizationServerEndpointsConfigurer众多相关类，
     * 包括配置身份认证器，配置认证方式，TokenStore，TokenGranter，OAuth2RequestFactory
     *
     * @param endpoints
     * @throws Exception
     */
    @Override
    public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
        endpoints
                .tokenStore(this.tokenStore())
                .authenticationManager(this.authenticationManager)
                .userDetailsService(userDetailsService);
    }

    /**
     * 用来配置令牌端点(Token Endpoint)的安全约束.
     * 创建ClientCredentialsTokenEndpointFilter核心过滤器
     *
     * @param security
     * @throws Exception
     */
    @Override
    public void configure(AuthorizationServerSecurityConfigurer security) throws Exception {
        // 请求token的接口谁都可以访问
        security.tokenKeyAccess("permitAll()")
                // 检查token的接口谁都可以访问
                .checkTokenAccess("authenticated()")
                .allowFormAuthenticationForClients();
    }

    /**
     * 配置OAuth2客户端信息
     * ClientDetails 接口则包含了与安全性控制相关的多个重要方法
     *
     * @param clients
     * @throws Exception
     */
    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        clients.inMemory()
                .withClient("webclient")
                .secret(passwordEncoder.encode("secret"))
                // token访问有效期
                .accessTokenValiditySeconds(3600)
                // 刷新token有效期
                .refreshTokenValiditySeconds(3600)
                // 授权类型
                .authorizedGrantTypes("password", "refresh_token")
                // 配置申请的权限范围
                .scopes("all", "read", "write");


    }

}
