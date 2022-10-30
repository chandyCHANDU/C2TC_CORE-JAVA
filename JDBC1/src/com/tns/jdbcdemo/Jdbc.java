package com.tns.jdbcdemo;
import java.sql.Connection;// 1st step
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Jdbc {
public static void main(String[] args) throws Exception {
// TODO Auto-generated method stub

//Class.forName(&quot;com.mysql.cj.jdbc.Driver&quot;);// step 2 class loader

try {
Connection con =

DriverManager.getConnection("jdbc:mysql://localhost:3306/chandu","root","Chandana@13");

Statement st = con.createStatement();// step 4 create a statement object
String query1 = "insert into new_table values(8,'ANU')";
//String query = &quot;select * from emp1&quot;;
ResultSet rs = st.executeQuery("SELECT * from new_table");
while(rs.next())
{
System.out.println(rs.getString(1)); //First Column
System.out.println(rs.getString(2)); //Second Column
//System.out.println(rs.getString(3)); //Third Column
}
st.executeUpdate(query1);
System.out.println("Student Table created successfully");
System.out.println("Row inserted successfully");

st.close();
con.close();

} catch (SQLException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}

}

}