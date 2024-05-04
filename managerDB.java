import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class managerDB {

    Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/proyectojava","postgres","admin123");

    public managerDB() throws SQLException {
    }
}
