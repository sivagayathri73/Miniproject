import java.util.Scanner;
import java.sql.*;

public class book{
	public Connection getconn()
	{
	Connection con = null;
	try
	{
	String url= "jdbc:mysql://localhost:3306/prodapt";
	String username="root";
	String pass="root";
	con = DriverManager.getConnection(url,username,pass);
	}
	catch(Exception e)
	{
	e.printStackTrace();
	}
	return con;
	}


	Scanner sc1 = new Scanner(System.in);



	public void luxury() throws SQLException {
			System.out.println("***Please enter User details***");
			 Connection con = getconn();
			 String s1 = "insert into luxury(name,address,userphone,idproof,checkin_date,checkout_date) values(?,?,?,?,?,?)";
			 PreparedStatement stmt = con.prepareStatement(s1);

			             System.out.println("Enter User Name:");
			             String name =sc1.nextLine();
			             System.out.println("Enter User address:");
			             String address =sc1.nextLine();
			             System.out.println("Enter Ur userphone");
			             String up = sc1.nextLine();
			             System.out.println("Enter user idproof");
			             String id = sc1.nextLine();
			             System.out.println("Enter user checkin_date in yyyy-mm-dd format");
			             String cd = sc1.nextLine();
			             System.out.println("Enter user checkout_date in yyyy-mm-dd format");
			             String co = sc1.nextLine();
			            
			       stmt.setString(1,name);
			       stmt.setString(2,address);
			       stmt.setString(3,up);
			       stmt.setString(4,id);
			       stmt.setString(5,cd);
			       stmt.setString(6,co);
			       int a = stmt.executeUpdate();
			       System.out.println("***Room booked***");
			       System.out.println("***Hava a nice day***");
			       
		
	}

	public void budjet_friendly() throws SQLException {
		System.out.println("***Please enter your details***");
		 Connection con = getconn();
		 String s1 = "insert into budjet_friendly(name,address,userphone,idproof,checkin_date,checkout_date) values(?,?,?,?,?,?)";
		 PreparedStatement stmt = con.prepareStatement(s1);

		             System.out.println("Enter ur Name:");
		             String name =sc1.nextLine();
		             System.out.println("Enter ur address:");
		             String address =sc1.nextLine();
		             System.out.println("Enter ur userphone");
		             String up = sc1.nextLine();
		             System.out.println("Enter user idproof");
		             String id = sc1.nextLine();
		             System.out.println("Enter user Checkin_Date");
		             String cd = sc1.nextLine();
		             System.out.println("Enter user Checkout_Date");
		             String co = sc1.nextLine();
		            
		       stmt.setString(1,name);
		       stmt.setString(2,address);
		       stmt.setString(3,up);
		       stmt.setString(4,id);
		       stmt.setString(5,cd);
		       stmt.setString(6,co);
		       int a = stmt.executeUpdate();
		       System.out.println("***Room booked***");
		       System.out.println("***Have a nice day***");
		
	}

	public void low_budjet() throws SQLException {
			System.out.println("***Please enter your details***");
			 Connection con = getconn();
			 String s1 = "insert into low_budjet(name,address,userphone,idproof,checkin_date,checkout_date) values(?,?,?,?,?,?)";
			 PreparedStatement stmt = con.prepareStatement(s1);

			             System.out.println("Enter user Name:");
			             String name =sc1.nextLine();
			             System.out.println("Enter user address:");
			             String address =sc1.nextLine();
			             System.out.println("Enter ur userphone");
			             String up = sc1.nextLine();
			             System.out.println("Enter user idproof");
			             String id = sc1.nextLine();
			             System.out.println("Enter user Checkin_Date");
			             String cd = sc1.nextLine();
			             System.out.println("Enter user Checkout_Date");
			             String co = sc1.nextLine();
			            
			            
			       stmt.setString(1,name);
			       stmt.setString(2,address);
			       stmt.setString(3,up);
			       stmt.setString(4,id);
			       stmt.setString(5,cd);
			       stmt.setString(6,co);
			       int a = stmt.executeUpdate();
			       System.out.println("***Room booked***");
			       System.out.println("***Have a nice day***");
			
		}
		
	}


