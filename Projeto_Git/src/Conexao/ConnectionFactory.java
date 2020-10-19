/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Angelo Lucas
 */
public class ConnectionFactory {
    public Connection conecta() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost/concessionaria","root","");
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
}
