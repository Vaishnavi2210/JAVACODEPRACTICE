package _2_AdvanceJava.Assignment.dao;

import _2_AdvanceJava.Assignment.model.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;



    public class StudentDAO {

        // CREATE
        public void createStudent(Student s) {
            String sql = "INSERT INTO students(name, email, phone) VALUES (?, ?, ?)";
            try (Connection con = DBUtil.getConnection();
                 PreparedStatement ps = con.prepareStatement(sql)) {

                ps.setString(1, s.getName());
                ps.setString(2, s.getEmail());
                ps.setString(3, s.getPhone());
                ps.executeUpdate();
                System.out.println("Student added successfully!");

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        // UPDATE
        public void updateStudent(Student s) {
            String sql = "UPDATE students SET name=?, email=?, phone=? WHERE id=?";
            try (Connection con = DBUtil.getConnection();
                 PreparedStatement ps = con.prepareStatement(sql)) {

                ps.setString(1, s.getName());
                ps.setString(2, s.getEmail());
                ps.setString(3, s.getPhone());
                ps.setInt(4, s.getId());
                ps.executeUpdate();
                System.out.println("Student updated!");

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        // DELETE
        public void deleteStudent(int id) {
            String sql = "DELETE FROM students WHERE id=?";
            try (Connection con = DBUtil.getConnection();
                 PreparedStatement ps = con.prepareStatement(sql)) {

                ps.setInt(1, id);
                ps.executeUpdate();
                System.out.println("Student deleted!");

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        // GET ALL
        public List<Student> getAllStudents() {
            List<Student> list = new ArrayList<>();
            String sql = "SELECT id, name, email, phone FROM students";

            try (Connection con = DBUtil.getConnection();
                 PreparedStatement ps = con.prepareStatement(sql);
                 ResultSet rs = ps.executeQuery()) {

                while (rs.next()) {
                    list.add(new Student(
                            rs.getInt("id"),
                            rs.getString("name"),
                            rs.getString("email"),
                            rs.getString("phone")
                    ));
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
            return list;
        }

        // GET BY ID
        public Student getStudentById(int id) {
            String sql = "SELECT id, name, email, phone FROM students WHERE id=?";
            try (Connection con = DBUtil.getConnection();
                 PreparedStatement ps = con.prepareStatement(sql)) {

                ps.setInt(1, id);
                ResultSet rs = ps.executeQuery();

                if (rs.next()) {
                    return new Student(
                            rs.getInt("id"),
                            rs.getString("name"),
                            rs.getString("email"),
                            rs.getString("phone")
                    );
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }
        // SEARCH (name / phone / email)
        public List<Student> search(String keyword) {
            List<Student> list = new ArrayList<>();
            String sql = "SELECT id, name, email, phone FROM students WHERE name LIKE ? OR phone LIKE ? OR email LIKE ?";

            try (Connection con = DBUtil.getConnection();
                 PreparedStatement ps = con.prepareStatement(sql)) {

                String key = "%" + keyword + "%";
                ps.setString(1, key);
                ps.setString(2, key);
                ps.setString(3, key);

                ResultSet rs = ps.executeQuery();

                while (rs.next()) {
                    list.add(new Student(
                            rs.getInt("id"),
                            rs.getString("name"),
                            rs.getString("email"),
                            rs.getString("phone")
                    ));
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
            return list;
        }
    }


