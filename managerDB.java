import org.jetbrains.annotations.NotNull;

import java.sql.*;

public class managerDB {

    public Connection connect_to_db() throws SQLException {

        Connection con = null;

        try{

            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/proyectojava","postgres","Admin1243_");

            if ( !(con == null) )  System.out.println("Conexion ok");

        }
        catch(SQLException e) {

            throw new RuntimeException(e);

        }
        return con;
    }

    public users buscar_cliente(@NotNull Connection conn, int id){

        users usuario = null;

        try {
            String customer = "select * from users where id = ?;";

            PreparedStatement ps = conn.prepareStatement(customer);

            ps.setInt(1,id);

            ResultSet datos = ps.executeQuery();  //metodo de mierda

            if ( datos.next() )

                usuario = new users(
                        datos.getInt("id"),
                        datos.getString("name"),
                        datos.getString("dni"),
                        datos.getString("location"),
                        datos.getString("adress"),
                        datos.getInt("type"),
                        datos.getString("password")
                );

        }

        catch (SQLException e) {

            System.out.println(e);

        }

        return usuario;

    }
}
