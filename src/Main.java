import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


            String dburl= "jdbc:mysql://localhost:3306/coursejdbc";
            String password = "112233";
            String user = "developer";



            try (Connection conn = DriverManager.getConnection(dburl, user, password)) {
                System.out.println("✅ Conexão bem-sucedida!");
            } catch (SQLException e) {
                System.out.println(" Erro na conexão!");
                e.printStackTrace();
            }
    }
}