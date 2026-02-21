package com.itshaala.controller;

import com.itshaala.dao.StudentDao;
import com.itshaala.model.Student;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet("/students")
public class StudentTestServlet extends HttpServlet {
    private StudentDao sdao = new StudentDao();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Student> students = sdao.getAllStudent();

    resp.setContentType("text/html");
    resp.getWriter().println("<h2>Students</h2>");
    for (Student s : students){
        resp.getWriter().println(
               "<p>" + s.getId() + " - " + s.getName() + " - " + s.getEmail() + " - "+ s.getCity() + "</p>"
        );
    }
        //resp.getWriter().println("</pre>");
    }

}

// Option 1: <br> → Quickest but less reliable if spacing matters
//   resp.getWriter().println(s.getId() + " - " + s.getName() + " - " + s.getEmail() + " - " + s.getCity() + "<br>");

// Option 2: <p> → Best for simple one-line-per-record display with clean spacing
//    resp.getWriter().println("<p>" + s.getId() + " - " + s.getName() + " - " + s.getEmail() + " - " + s.getCity() + "</p>");

// Option 3: <pre> → Best for debug output or aligned columns
//    resp.getWriter().println("<pre>" + s.getId() + " - " + s.getName() + " - " + s.getEmail() + " - " + s.getCity() + "</pre>");