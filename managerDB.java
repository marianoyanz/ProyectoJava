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

    public products buscar_product(@NotNull Connection conn, int id){

        products prod = null;

        try {
            String customer = "select * from products where id = ?;";

            PreparedStatement ps = conn.prepareStatement(customer);

            ps.setInt(1,id);

            ResultSet datos = ps.executeQuery();  //metodo de mierda

            if ( datos.next() ) {
                        prod = new products(
                        datos.getInt("id"),
                        datos.getString("description"),
                        datos.getInt("stock"),
                        datos.getDouble("salesprice")  );
            }

        }

        catch (SQLException e) {

            System.out.println(e);

        }

        return prod;

    }
}
