



import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;
@WebServlet("/demo1")
public class ServletDemo1 implements Servlet {


    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }


    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Hello ServletDemo1");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
