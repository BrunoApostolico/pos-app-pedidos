package br.edu.infnet.pedidos.modelo.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcUtil {
    public static Connection obterConexao() throws Exception {
        String url = "jdbc:mysql://localhost:3306/aula01?createDatabaseIfNotExist=true";
        String user = "root";
        String password = "";
        return DriverManager.getConnection(url, user, password);

    }
}
