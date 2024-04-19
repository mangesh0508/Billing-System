
package electricity.billing.system;

import java.sql.*;

// for connection with database
// 5 steps of JDBC connectivity
// S1 -> Register the driver class
// s2 -> creating connection with mysql 
// s3 -> Creating a statement
// s4 -> Executing mysql queries
// s5 -> closing connection. Done by java itself
public class Conn {

    Connection c;
    Statement s;
    Conn() {
        try {
            c = DriverManager.getConnection("jdbc:mysql:///ebs", "root", "Mangesh@5");
            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}