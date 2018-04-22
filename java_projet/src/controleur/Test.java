/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;
import java.io.File;
import javax.swing.*;
import java.awt.event.*;
import affichage.NewJFrame;
import affichage.menu;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JTable;
import jdbcv2018.Connexion;


/**
 *
 * @author QUENTIN
 */
public class Test {
    private static NewJFrame JFrame;
    private Connexion conn;
    private String contenuText;
    private String contenuComboBox;
    
    
    
     public static void main(String[] args) throws SQLException, ClassNotFoundException {
        
           Connexion conn =  new Connexion("hopital","root","");
           JFrame = new NewJFrame();
           JFrame.setVisible(true);
            
        
     }
}
