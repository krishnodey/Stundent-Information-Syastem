/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_v1;

import static com.sun.glass.ui.Cursor.setVisible;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Krishno Dey
 */
public class Javav1 {
    public static void main(String[] args) {
       Admin_Registration rgf = new Admin_Registration();
        rgf.setVisible(true);
        getConnection();
        
    }

    static Connection getConnection()  {
         Connection con = null;
        
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;user=Admin;password=sejuti;" +
            "databaseName=Student_Info;");
            System.out.println("Connected database successfully...");
            //return con;
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return con;
        
    }
    
    
    
    
}
