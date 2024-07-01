/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penilaianmahasiswa;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author sad
 */
public class KonfigurasiDB {
    private String driver;
    private String database;
    private String user;
    private String password;
    private Properties configData;
    
    public KonfigurasiDB(){
        try {
            configData = new Properties();
            configData.load(new FileInputStream("./src/penilaianmahasiswa/dbconfig.properties"));
            
            driver = configData.getProperty("DB_DRIVER");
            database = configData.getProperty("DB_NAME");
            user = configData.getProperty("DB_USER");
            password = configData.getProperty("DB_PASSWORD");
            
        } catch (IOException e) {
            JFrame frame = new JFrame();
            JOptionPane.showConfirmDialog(frame, e.toString());
            //e.printStackTrace();
        }
    }
    
    public String getDriver(){
        return driver;
    }
    
    public String getDBName(){
        return database;
    }
    
    public String getDBUser(){
        return user;
    }
    
    public String getDBPassword(){
        return password;
    }
}
