package com.training.jdbc;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class Jdbc_Test {

	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		String url="jdbc:sqlserver://localhost:1433;" + "databaseName=mars_may;" + "encrypt=true;trustServerCertificate=true";
        String user="sa";
        String password="sujatha";
        Connection con=DriverManager.getConnection(url,user,password);
        if(con!=null)
        {
        	System.out.println("connection established sucessfully");
        }
        else
        {
        	System.out.println("connection  refused");
        }
        String query="select * from products where prod_name = ? and price > ?";
        PreparedStatement pstmt=con.prepareStatement(query);
        pstmt.setString(1, "pc");
        pstmt.setInt(2, 300);
        ResultSet rs=pstmt.executeQuery();
        List<Product> prodList=new ArrayList<>();
        while(rs.next())
        {
        	Product p1=new Product(rs.getString("prod_name"),rs.getInt("price"),rs.getString("prod_desc"));
        	
        	prodList.add(p1);
        	/*System.out.println("product-name:"+rs.getString("prod_name"));
        	System.out.println("product-price:"+rs.getString("price"));
        	System.out.println("product-price:"+rs.getString("prod_desc"));*/
        }
        Collections.sort(prodList);
        for(Product prod:prodList)
    	{
    		System.out.println(prod.getName());
    		System.out.println(prod.getPrice());
    		System.out.println(prod.getDesc());
    	}
    	
	}

}
