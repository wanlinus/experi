package cn.wanli.auth.config;

import cn.wanli.common.vo.ServerResp;
import cn.wanli.common.vo.ServerRespCode;
import cn.wanli.common.utils.JSON;
import org.apache.http.entity.ContentType;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Serializable;

/**
 * 访问被禁止处理类
 *
 * @author wanli
 */
public class LocalAccessDeniedHandler implements AccessDeniedHandler {

    /**
     * 遇到禁止访问的api调用此方法返回数据
     *
     * @param request
     * @param response
     * @param accessDeniedException
     * @throws IOException
     * @throws ServletException
     */
    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response, AccessDeniedException accessDeniedException) throws IOException {
        ServerResp<Serializable> resp = new ServerResp<>();
        resp.setRespMsg(ServerRespCode.ACCESS_DENIED.getDesc());
        resp.setRespCode(ServerRespCode.ACCESS_DENIED.getValue());
        response.setContentType(ContentType.APPLICATION_JSON.getMimeType());
        response.getWriter().write(JSON.toJSONString(resp));
    }
}
