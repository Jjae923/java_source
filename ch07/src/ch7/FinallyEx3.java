package ch7;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FinallyEx3 {
	public static void main(String[] args) {

		try {
			Class.forName("");
			
			Connection con=DriverManager.getConnection("","","");
			PreparedStatement pstmt = con.prepareStatement("");
			ResultSet rs = pstmt.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
