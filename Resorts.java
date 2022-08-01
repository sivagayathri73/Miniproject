import java.util.Hashtable;
import java.sql.SQLException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;
public class Resorts {
	public void Sign_up(String key,String value)
	{
		Hashtable<String,String>h1=new Hashtable<String,String>();
		Scanner sc=new Scanner(System.in);
		h1.put(key,value);
		System.out.println("Re-enter the password: ");
		String Re_passw=sc.next();
		if(Re_passw.equals(value)) {
			System.out.println("Your account is successfully created");
		}
		else {
			System.out.println("The password is mismatching....Try again");
			System.out.println("Re-enter the password: ");
			Re_passw=sc.next();
		}
	}
	public static void main(String[] args) throws SQLException,IOException{
	String p="y";
	String s = "y";
	String usern,passw;
	outer: while (p.equals("y")) {

	Scanner sc1 = new Scanner(System.in);
	System.out.println("........ WELCOME TO YASH RESORTS............"); 
	System.out.println("Choose Admin or Newuser"); 
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String A=br.readLine();
	if(A.equals("Admin"))
	{
	System.out.println("Enter admin Username");
	String Adminusern=br.readLine();
	System.out.println("Enter admin password");
	String Adminpassw=br.readLine();
	if(Adminusern.equals("Gayu")&&Adminpassw.equals("Gayu@123"))
	{
		System.out.println("Successfully logged in as admin!!!");
		System.out.println("Choose which details of the customer who stayed in:  ");
		System.out.println("Choose luxury or budjet_friendly or low_budjet");
	}
	else
	{
		System.out.println("Username or password is incorrect.Try again!!");
		System.out.println("Enter admin Username");
		Adminusern=br.readLine();
		System.out.println("Enter admin password");
		Adminpassw=br.readLine();
		System.out.println("Successfully logged in as admin");
		System.out.println("Choose which details of the customer who stayed in:  ");
		System.out.println("Choose luxury or budjet_friendly or low_budjet");
	}
	String b=br.readLine();
	if(b.equals("luxury"))
	{
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt","root","root");
	Statement stmt=con.createStatement();
	ResultSet rs=stmt.executeQuery("select * from luxury");
	while(rs.next()){
	System.out.println("These are the Detalis of the custumer who stayed in luxury:  ");
	System.out.println("name : "+rs.getString(1));
	System.out.println("Address : "+rs.getString(2));
	System.out.println("Userphone : "+rs.getString(3));
	System.out.println("id proof : "+rs.getString(4));
	System.out.println("Checkin_Date : "+rs.getString(5));
	System.out.println("Checkout_Date : "+rs.getString(6));
	
	}
	System.exit(0);
	}
	if(b.equals("budjet_friendly"))
	{
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt","root","root");
	Statement stmt=con.createStatement();
	ResultSet rs=stmt.executeQuery("select * from budjet_friendly");
	while(rs.next()){
	System.out.println("These are the Detalis of the custumer who stayed in budjet_friendly:  ");
	System.out.println("name : "+rs.getString(1));
	System.out.println("Address : "+rs.getString(2));
	System.out.println("Userphone : "+rs.getString(3));
	System.out.println("id proof : "+rs.getString(4));
	System.out.println("Checkin_Date : "+rs.getString(5));
	System.out.println("Checkout_Date : "+rs.getString(6));

	}
	System.exit(0);
	}
	
	if(b.equals("low_budjet"))
	{
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt","root","root");
	Statement stmt=con.createStatement();
	ResultSet rs=stmt.executeQuery("select * from low_budjet");
	while(rs.next()){
	System.out.println("These are the Detalis of the custumer who stayed in budjet_friendly:  ");
	System.out.println("name : "+rs.getString(1));
	System.out.println("Address : "+rs.getString(2));
	System.out.println("Userphone : "+rs.getString(3));
	System.out.println("id proof : "+rs.getString(4));
	System.out.println("Checkin_Date : "+rs.getString(5));
	System.out.println("Checkout_Date : "+rs.getString(6));
	
	}
	System.exit(0);
	}
	
	}
	
	
	if(A.equals("Newuser"));
	{
    Resorts sp=new Resorts();
    System.out.println("Create a new username: ");
	String key=sc1.next();
	System.out.println("Create a new password: ");
	String value=sc1.next();
    sp.Sign_up(key, value);
    System.out.println("Now You are ready for the login...");
    System.out.println("please enter the login details: ");
    System.out.println("Enter your username");
    usern=sc1.next();
    System.out.println("Enter your password: ");
    passw=sc1.next();
    if(usern.equals(key)&&passw.equals(value))
    {
    	System.out.println("Your authentication is successful");
    }
    else
    {
    	System.out.println("Username or password is incorrect...Try again");
    	System.out.println("Enter your username");
        usern=sc1.next();
        System.out.println("Enter your password: ");
        passw=sc1.next();
    }
	}
	
	while (s.equals("y")) {
	System.out.println("CHOOSE WHAT YOU WANT TO STAY IN");
	System.out.println("press 1 to choose LUXURY");
	System.out.println("press 2 to choose BUDJET_FRIENDLY");
	System.out.println("press 3 to choose LOW_BUDJET");
	System.out.println("press 4 to choose EXIT");

	Scanner sc = new Scanner(System.in);
	int i = sc.nextInt();

	book bb = new book();

	switch (i) {
	case 1: 
		bb.luxury();
	    break;
	case 2:
		bb.budjet_friendly();
	    break;
	case 3: 
		bb.low_budjet();
	    break;
	case 4:
		System.exit(0);
	default : 
		System.out.println("Wrong Choice");
		
	    break;
}
	
	System.out.println("Do you want to continue then press y/n");
	s = sc.next();
	if (s.equals("n"))
	{
	    
		System.out.println("******Thank You*******");

	    break outer ;
	}
	}
	}
}
}








	
