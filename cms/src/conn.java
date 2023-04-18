 public class conn {
     connection c:
     Statement s;
     
    conn() {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///universitymanagementsystem1", "root", "codeforinterview");
            s = c.createStatement();
        }
    }
}
