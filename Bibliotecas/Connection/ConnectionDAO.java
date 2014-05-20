/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Fatinha de Sousa
 */
public class ConnectionDAO {
    private final String url = "jdbc:postgresql://localhost:5432/TESTE";
    private final String username = "postgres";
    private final String password = "12345";
       
    public Connection createConnection() throws SQLException{
        Connection conn = DriverManager.getConnection(url, username, password); 
        return conn;
    }
}
