package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.database.DbConnection;
import com.model.UserModel;

public class RegisterDao {

	public boolean checkUserEmail(String email) throws ClassNotFoundException, SQLException {

		Connection con = DbConnection.getCon();
		String sql = "select * from usertable where emailid='" + email + "'";
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		boolean f=rs.next()?true:false;
		return f;

	}

	public int insertUser(UserModel um) throws ClassNotFoundException, SQLException {
		Connection con = DbConnection.getCon();
		String sql = "insert into usertable values(0,?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, um.getName());
		ps.setString(2, um.getPassword());
		ps.setString(3, um.getEmailid());
		ps.setString(4, um.getAddress());

		return ps.executeUpdate();

	}

}
