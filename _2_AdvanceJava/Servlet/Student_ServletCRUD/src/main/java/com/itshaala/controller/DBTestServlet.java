package com.itshaala.controller;

import com.itshaala.dao.DBUtil;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.Connection;

@WebServlet("/dbtest")
public class DBTestServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        try(Connection con = DBUtil.getConnection()) {
            resp.getWriter().println("DB Connected Successfully!");
        } catch (Exception e){
            e.printStackTrace();
            resp.getWriter().println("DB Connection Failed : " + e.getMessage());
        }
    }
}
