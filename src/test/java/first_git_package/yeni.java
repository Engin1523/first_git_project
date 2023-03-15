package first_git_package;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class yeni {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        System.out.println("basarılı");
        //1 . Adım: Driver'a kaydol
        Class.forName("org.postgresql.Driver");
        //2. Adım: Database'e bağlan
        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","15231523Ee-");
        // 3. Adım: Statement oluştur.
        Statement st = con.createStatement();

        System.out.println("merhaba");

    }

}
