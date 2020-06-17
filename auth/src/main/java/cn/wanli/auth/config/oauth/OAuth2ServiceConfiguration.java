package cn.wanli.auth.config.oauth;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

/**
 * 开启认证服务器
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
//    @Resource
//    private AuthenticationManager authenticationManager;

    @Autowired
    private PasswordEncoder passwordEncoder;
//    @Resource
//    private AuthenticationManager authenticationManager;


}
