package it.com;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/req1")
public class Demo2 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取请求方式： GET
        String method = req.getMethod();
        System.out.println(method);
        //获取虚拟目录(项目访问路径)
        String contextPath = req.getContextPath();
        System.out.println(contextPath);
        //获取URL(统一资源定位符)
        StringBuffer requestURL = req.getRequestURL();
        System.out.println(requestURL);
        //获取URI(统一资源标识符)
        String requestURI = req.getRequestURI();
        System.out.println(requestURI);
        //获取请求参数（GET方式）
        String queryString = req.getQueryString();
        System.out.println(queryString);


        //获取请求头: user-agent: 浏览器的版本信息
        String agent = req.getHeader("user-agent");
        System.out.println(agent);
    }
}
