import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class App {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket","root" , "Avishka");

        Statement statement = connection.createStatement();

        String sql = "SELECT * FROM customer";

       ResultSet resultSet = statement.executeQuery(sql);

       while (resultSet.next()) {
        System.out.println(resultSet.getString("CustID")+" | "+resultSet.getString("Custname"));
        
       }

    }
}
