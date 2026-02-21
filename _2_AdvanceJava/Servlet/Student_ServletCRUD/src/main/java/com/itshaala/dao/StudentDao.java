package com.itshaala.dao;

import com.itshaala.model.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StudentDao {
    // I use try-with-resources in JDBC to automatically close Connection and PreparedStatement,
    // so we don’t need finally blocks.

    //CREATE
    public boolean addStudent(Student s) {
        String sql = "insert into students(name, email, city) values(?, ?, ?)";

        try (Connection con = DBUtil.getConnection();       // try-with-resources  (isse con, ps close nhi karna padta)
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, s.getName());
            ps.setString(2, s.getEmail());
            ps.setString(3, s.getCity());
            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
     }

    //UPDATE
    public boolean updateStudent(Student s) throws Exception {
        String sql = "UPDATE students SET name=?, email=?, city=? WHERE id=? ";

        try (Connection con = DBUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, s.getName());
            ps.setString(2, s.getEmail());
            ps.setString(3, s.getCity());
            ps.setInt(4, s.getId());
            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    //DELETE
    public boolean deleteStudent(int id) throws Exception {
        String sql = "DELETE FROM students WHERE id = ?";

        try (Connection con = DBUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }


    //GetById(Read)
    public Student getStudentById(int id) {
        String sql = "SELECT id, name, email, city FROM students WHERE id =?";
        try (Connection con = DBUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                Student s = new Student();
                s.setId(rs.getInt("id"));
                s.setName(rs.getString("name"));
                s.setEmail(rs.getString("email"));
                s.setCity((rs.getString("city")));
                return s;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    //GetAllStudent(Read)
    public List<Student> getAllStudent() {
      List<Student> list = new ArrayList<>();
        String sql = "SELECT id, name, email, city FROM students";
        try (Connection con = DBUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Student s = new Student();
                s.setId(rs.getInt("id"));
                s.setName(rs.getString("name"));
                s.setEmail(rs.getString("email"));
                s.setCity((rs.getString("city")));
                list.add(s);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
}