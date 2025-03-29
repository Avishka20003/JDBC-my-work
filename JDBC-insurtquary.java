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

       
       String sql = "INSERT INTO Customer VALUES('C036', 'Mr', 'Kamal', '1985-12-10', 100000, 'Panadura', 'Panadura', 'Western', '12600')";

       int result = statement.executeUpdate(sql);
       System.out.println(result > 0 ? "Success":"Fail");
       statement.close();

    }
}
