/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
import java.sql.*;
public class LoginOperations {
    private int student_no;
    private String password;

    public int getStudent_no() {
        return student_no;
    }

    public void setStudent_no(int student_no) {
        this.student_no = student_no;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public static boolean validate(int student_no, String password){
        boolean status= false;
        PreparedStatement pst = null;        
        Connection con = new DBConnector().connector();
        try{
             pst = con.prepareStatement("Select * from login_details where student_id=? and password=?");
             pst.setInt(2, student_no);
             pst.setString(3, password);
             
             
             ResultSet rs = pst.executeQuery();
             status = rs.next();
        }catch(SQLException e){
            System.out.println("Error"+ e);
        }
        
            return status;
    }
    
    
}
