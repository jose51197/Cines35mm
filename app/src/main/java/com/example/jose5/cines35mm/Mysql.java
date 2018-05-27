package com.example.jose5.cines35mm;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


/**
 * Created by jose5 on 5/27/2018.
 */

public class Mysql  {
    private static final String url = "jdbc:mysql://www.db4free.net/cine35mm";
    private static final String user = "josepablo";
    private static final String password ="josepablo";

    protected ResultSet ExecuteQuery(String query) {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con = DriverManager.getConnection(url, user, password);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            return rs;
        }
        catch(Exception e){
                e.printStackTrace();
        }
        return null;
    }
}