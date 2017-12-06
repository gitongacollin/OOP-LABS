/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Locale;

/**
 *
 * @author HP
 */
public class CrudOperations {
    private int student_no;
    private String first_name;
    private String last_name;
    private String gender;
    private String programme;
//Getters and setters
    public int getStudent_no() {
        return student_no;
    }

    public void setStudent_no(int student_no) {
        this.student_no = student_no;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getProgramme() {
        return programme;
    }

    public void setProgramme(String programme) {
        this.programme = programme;
    }
    //methods
    public int proccessgender (String g){
        if(g.equalsIgnoreCase("male")){
            return 1;
        }
        return 0;
    }
    /**
     * this method saves data entered by the user; they include student name, first name, last name, his or her ender and the programme enrolled
     * @return true if the data entered is okay
     * @return false if the data entered has an error
     */
    public boolean save(){
        PreparedStatement pst = null;        
        Connection con = new DBConnector().connector();
        try{
            pst = con.prepareStatement("INSERT INTO student_details(student_id,first_name,last_name,gender,degree_programme) VALUES(?,?,?,?,?)");
            pst.setInt(1,getStudent_no());
            pst.setString(2, getFirst_name());
            pst.setString(3, getLast_name());
            pst.setInt(4, proccessgender(getGender()));
            pst.setString(5, getProgramme());
            pst.executeUpdate();
            return true;
        }catch(SQLException e){
            System.out.println("Error" + e.getMessage());
            return false;
        }


    }
    /**
     * this method saves students number and name into the database
     * @param name this is the student's name
     * @param Student_no this is the student's admission number
     * @deprecated 
     * @return 
     */
    public boolean save(String name, int Student_no){
        return true;
    }
    public boolean removeRecord(){
        PreparedStatement pst = null;
        Connection con = new DBConnector().connector();
        try {
            pst = con.prepareStatement("DELETE FROM student_details WHERE student_id =? ");
            pst.setInt(1, getStudent_no());
            pst.executeUpdate();
            System.out.println("Record is deleted!");
            return true;
            
        } catch (SQLException f) {
            System.out.println("Error" + f.getMessage());
            return false;
        }
    }
    public boolean updateRecord(){
        return true;
    }
    public boolean ViewRecord() throws SQLException{
        PreparedStatement pst = null;
        Connection con = new DBConnector().connector();
        String query = "Select * FROM student_details";
        Statement st = con.createStatement();
        try{
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                int id = rs.getInt("student_id");
                String firstname = rs.getString("first_name");
                String lastname = rs.getString("last_name");
                int gender = rs.getInt("gender");
                String degreeprogramme= rs.getString("degree_programme");
                st.executeUpdate(query);
                
                System.out.format("%s, %s, %s, %s, %s\n", id, firstname, lastname, gender, degreeprogramme);
            }
            st.close();
            return true;
            
        } catch(SQLException q){
            System.out.println("Error" + q.getMessage());
        }
        return false;
    }
    
}
