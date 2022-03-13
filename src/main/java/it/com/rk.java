package it.com;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet("/demo1")
public class rk implements Servlet {
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("哈哈哈");
    }

    public void init(ServletConfig servletConfig) throws ServletException {

    }

    public ServletConfig getServletConfig() {
        return null;
    }


    public String getServletInfo() {
        return null;
    }

    public void destroy() {

    }
}
