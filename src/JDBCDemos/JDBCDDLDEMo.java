package JDBCDemos;

import java.sql.*;

public class JDBCDDLDEMo {

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

        // 4. exceuting query - DDL

        String sql = "select * from student where marks=77";

        ResultSet rs =  st.executeQuery(sql);

        while(rs.next())
        {

            System.out.print(rs.getInt("id")+" ");
            System.out.print(rs.getString("name")+" ");
            System.out.print(rs.getString("branch")+" ");
            System.out.println(rs.getInt("marks")+" ");

        }
    }
}
