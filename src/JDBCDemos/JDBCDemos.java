package JDBCDemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemos {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        //1.  Loading a driver

        Class.forName("com.mysql.cj.jdbc.Driver");

        //2.  Creating a connection

        String user = "root";
        String pass = "root";
        String url  = "jdbc:mysql://localhost:3306/ganesh";

        Connection con = DriverManager.getConnection(url,user,pass);

        //3. Creating statement

        Statement st = con.createStatement();

        //4.  Executing query (DML)

        String sql = "insert into student values(5,'usha','Comp',67)";

        // try update & delete commands as homework

        st.executeUpdate(sql);

        st.close();
        con.close();
    }
}
