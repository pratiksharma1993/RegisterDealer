package com.ondemanddeals.service;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ondemanddeals.data.Request;

@Path("api")
public class RegisterDealerService {
	
	@POST	
	@Path("/m1")
	@Produces("text/plain")
	@Consumes(MediaType.APPLICATION_JSON)
	public String registerDetails(Request request){	
	
		
		return RegisterDetailsInDB(request);
	}

public String RegisterDetailsInDB(Request request){
	//Creating the connection
    String url = "jdbc:oracle:thin:@10.20.202.183:1521:xe";
    String user = "system";
    String pass = "system";
    int categoryId = 0;
    
    ResultSet rs =null;
    PreparedStatement preparedStmt = null;
    PreparedStatement preparedStmt2 = null;
   
    String categorySql = "select categoryId from shop_category_ref where category =?";
    String InsertSql ="Insert into SHOP_DETAILS (SHOPNAME,SHOPCONTACTNUM,ALTCONTACTNUM,ADDRESSLINE1,ADDRESSLINE2,PINCODE,CITY,SHOPCATEGORYID,FIRSTNAME,LASTNAME,CONTACTNUM) values (?,?,?,?,?,?,?,?,?,?,?)";
    Connection con=null;
    try
    {
  
        Class.forName("oracle.jdbc.driver.OracleDriver");
       
        con = DriverManager.getConnection(url,user,pass);

        preparedStmt2 = con.prepareStatement(categorySql);
        preparedStmt2.setString (1, request.getShopDetails().getShopCategory());
        rs = preparedStmt2.executeQuery();
        while (rs.next())
        	categoryId = rs.getInt(1);
        
        
        preparedStmt = con.prepareStatement(InsertSql);
        preparedStmt.setString (1, request.getShopDetails().getShopName());
        preparedStmt.setLong (2, request.getShopDetails().getShopContactNum());
        preparedStmt.setLong   (3, request.getShopDetails().getAltContactNum());
        preparedStmt.setString(4, request.getShopDetails().getShopLocation().getAddressLine1());
        preparedStmt.setString (5, request.getShopDetails().getShopLocation().getAddressLine2());
        preparedStmt.setInt (6, request.getShopDetails().getShopLocation().getPinCode());
        preparedStmt.setString (7, request.getShopDetails().getShopLocation().getCity());
        preparedStmt.setInt (8, categoryId);
        preparedStmt.setString (9, request.getOwnerDetails().getFirstName());
        preparedStmt.setString (10, request.getOwnerDetails().getLastName());
        preparedStmt.setInt (11, request.getOwnerDetails().getContactNum());                 
        int i=preparedStmt.executeUpdate();    
        if( i>0){
        	
        	return "Congratulations!The Shop Details were registered sucessfully!";
        }
        
        
       
    }
    catch(Exception ex)
    {
    	System.err.println(ex);
    	return "Registration Failed!"; 
        
    }
    finally{
    	 try {
			con.close();
			rs.close();
			preparedStmt2.close();
			preparedStmt.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
			return ""; 
		}
    	 
	}
	return "Registration Failed!";
	
}
}
