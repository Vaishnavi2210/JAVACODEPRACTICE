import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;
import java.time.LocalDateTime;

@WebServlet("/greet")
public class GreetingServlet implements Servlet {

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("GreetingServlet :: init");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("GreetingServlet :: service");
        servletResponse.getWriter().println("Good morning !" + LocalDateTime.now());
    }

    @Override
    public void destroy() {
        System.out.println("GreetingServlet :: destroy");

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public String getServletInfo() {
        return "";
    }

}
