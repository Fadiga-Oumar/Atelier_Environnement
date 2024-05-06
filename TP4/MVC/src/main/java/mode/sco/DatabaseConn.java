package mode.sco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConn {
    private static final String URL = "jdbc:mysql://localhost:3306/Scolarite";
    private static final String USERNAME = "root"; 
    private static final String PASSWORD = ""; 
    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (ClassNotFoundException e) {
            System.out.println("Erreur: Pilote JDBC introuvable");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Erreur: Impossible de se connecter à la base de données");
            e.printStackTrace();
        }
        return connection;
    }

    public static void closeConnection(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                System.out.println("Erreur lors de la fermeture de la connexion");
                e.printStackTrace();
            }
        }
    }
}

