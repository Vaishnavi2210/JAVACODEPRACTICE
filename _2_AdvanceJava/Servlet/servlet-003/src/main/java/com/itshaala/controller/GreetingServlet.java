package com.itshaala.controller;

import jakarta.servlet.*;

import java.io.IOException;


public class GreetingServlet implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("GreetingServlet :: init");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("GreetingServlet :: service");
        servletResponse.getWriter().println("You are Hire -> Offer Letter");
    }

    @Override
    public String getServletInfo() {
        return "";
    }

    @Override
    public void destroy() {
        System.out.println("GreetingServlet :: destroy");

    }
}
