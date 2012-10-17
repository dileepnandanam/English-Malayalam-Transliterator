import java.sql.*;
import java.io.*;
public class phoneticdict
{
		String driver;
    	String ConString;
    	String user;
    	String password;


		Connection Con;
	public phoneticdict()
	{
		driver = "com.mysql.jdbc.Driver";
    	ConString="jdbc:mysql://localhost:3306/transdict";
    	user="root";
    	password="root";
		Con=null;


		try
		{
			Class.forName(driver);
			Con=DriverManager.getConnection(ConString,user,password);
		}
		catch(Exception e)
		{
			System.out.println( e.getMessage());
		}




	}
	public void closedbc()
	{

		try
		{
			Con.close();
			Con=null;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Error in con Closing");
		}
	}
	public String phoneticeqv(String eword)
	{
		String pstring="";
		try
        {
			Statement st= Con.createStatement();
     		ResultSet rs=st.executeQuery("select phonetic from pd where word='"+eword+"'");
        	while (rs.next())
        	{
				pstring = rs.getString("phonetic");
				System.out.println(pstring + "\n");
			}

        }
        catch(Exception e)
		{
			System.out.println( e.getMessage());
		}
		return pstring;
	}
	public String gr(String phonetic)
	{
		return phonetic;
	}
}
