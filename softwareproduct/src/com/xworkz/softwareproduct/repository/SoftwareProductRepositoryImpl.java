package com.xworkz.softwareproduct.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.xworkz.softwareproduct.dto.SoftwareProductDto;
import com.xworkz.softwareproduct.util.SoftwareProductUtils;

public class SoftwareProductRepositoryImpl implements SoftwareProductRepository  {
	SoftwareProductUtils jdbc =new SoftwareProductUtils();
	@Override
	public boolean onSave(SoftwareProductDto dto) throws SQLException {
		System.out.println("Dto:" + dto);

		Connection connection = DriverManager.getConnection(jdbc.jdbcUrl, jdbc.userName, jdbc.password);

		String query = "insert into softwareproduct_info values(?,?,?,?,?,?,?,?,?,?)";

		PreparedStatement preparedstatement = connection.prepareStatement(query);
		System.out.println("before:" + preparedstatement);

		preparedstatement.setInt(1, dto.getId());
		preparedstatement.setString(2,dto.getUsername());
		preparedstatement.setString(3,dto.getEmail());
		preparedstatement.setLong(4,dto.getPhonenumber());
		preparedstatement.setString(5,dto.getSoftwarename());
		preparedstatement.setString(6,dto.getVersion());
		preparedstatement.setString(7,dto.getDoe());
		preparedstatement.setString(8,dto.getPassword());
		preparedstatement.setDouble(9,dto.getPrice());
		preparedstatement.setString(10,dto.getOsversion());
		System.out.println("after:" + preparedstatement);

		int rows = preparedstatement.executeUpdate();
		if (rows > 0) {
			return true;
		} else {
		
		return false;
	}

}
	@Override
	public boolean onSearch(String productversion) throws SQLException {
		Connection connection = DriverManager.getConnection(jdbc.jdbcUrl, jdbc.userName, jdbc.password);
		String query = "select * from softwareproduct_info where version=?";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1,productversion);
		
		ResultSet result=	preparedStatement.executeQuery();
		while(result.next()) {
			System.out.println("Inside While loop");
			System.out.println(" Id: "+result.getInt(1)+" username: "+result.getString(2)+ " email : " +result.getString(3)+ " phonenumber: "+result.getLong(4)+ " softwarename: " +result.getString(5)+ " version : "+result.getString(6)+ " doe: "+result.getString(7)+ " password: "+result.getString(8)+" price: "+result.getDouble(9)+" osversion: "+result.getString(10));
			
		}
		return false;
	}
	@Override
	public boolean onSearchByUserid(int userid) throws SQLException {
		Connection connection = DriverManager.getConnection(jdbc.jdbcUrl, jdbc.userName, jdbc.password);
		String query = "select * from softwareproduct_info where id=?";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setInt(1,userid);
		
		ResultSet result=	preparedStatement.executeQuery();
		while(result.next()) {
			System.out.println("Inside While loop");
			System.out.println(" Id: "+result.getInt(1)+" username: "+result.getString(2)+ " email : " +result.getString(3)+ " phonenumber: "+result.getLong(4)+ " softwarename: " +result.getString(5)+ " version : "+result.getString(6)+ " doe: "+result.getString(7)+ " password: "+result.getString(8)+" price: "+result.getDouble(9)+" osversion: "+result.getString(10));
			
		}
		return false;
	}
	@Override
	public boolean onSearchBySoftwareName(String softwarename) throws SQLException {
		Connection connection = DriverManager.getConnection(jdbc.jdbcUrl, jdbc.userName, jdbc.password);
		String query = "select * from softwareproduct_info where softwarename=?";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1,softwarename);
		
		ResultSet result=	preparedStatement.executeQuery();
		while(result.next()) {
			System.out.println("Inside While loop");
			System.out.println(" Id: "+result.getInt(1)+" username: "+result.getString(2)+ " email : " +result.getString(3)+ " phonenumber: "+result.getLong(4)+ " softwarename: " +result.getString(5)+ " version : "+result.getString(6)+ " doe: "+result.getString(7)+ " password: "+result.getString(8)+" price: "+result.getDouble(9)+" osversion: "+result.getString(10));
			
		}
		return false;
	}
	@Override
	public boolean readAll() throws SQLException {
		Connection connection = DriverManager.getConnection(jdbc.jdbcUrl, jdbc.userName, jdbc.password);
		String query = "select * from  softwareproduct_info";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		ResultSet result = preparedStatement.executeQuery();
		while(result.next()) {
			System.out.println(" Id: "+result.getInt(1)+" username: "+result.getString(2)+ " email : " +result.getString(3)+ " phonenumber: "+result.getLong(4)+ " softwarename: " +result.getString(5)+ " version : "+result.getString(6)+ " doe: "+result.getString(7)+ " password: "+result.getString(8)+" price: "+result.getDouble(9)+" osversion: "+result.getString(10));
			
		}
		return false;
		
	}
	@Override
	public boolean onUpdate(int id, String username, String email, long phonenumber, String softwarename,
			String version, String doe, String password, double price, String osversion) throws SQLException {
		
			Connection connection = DriverManager.getConnection(jdbc.jdbcUrl, jdbc.userName, jdbc.password);

			String query = "update softwareproduct_info set username=?,email=?,phonenumber=?,softwarename=?,version=?,doe=?,password=?,price=?,osversion=? where id=?";

			PreparedStatement preparedstatement = connection.prepareStatement(query);
			System.out.println("before:" + preparedstatement);
			preparedstatement.setString(1,username);
			preparedstatement.setString(2,email);
			preparedstatement.setLong(3,phonenumber);
			preparedstatement.setString(4,softwarename);
			preparedstatement.setString(5,version);
			preparedstatement.setString(6,doe);
			preparedstatement.setString(7,password);
			preparedstatement.setDouble(8,price);
			preparedstatement.setString(9,osversion);
			preparedstatement.setInt(10,id);
			System.out.println("after:" + preparedstatement);

			preparedstatement.executeUpdate();
			return true;
		
	}
	@Override
	public boolean onUpdatePriceByOsVersion(String osversion, double price) throws SQLException {
		Connection connection = DriverManager.getConnection(jdbc.jdbcUrl, jdbc.userName, jdbc.password);

		String query = "update softwareproduct_info set price=? where osversion=?";

		PreparedStatement preparedstatement = connection.prepareStatement(query);
		System.out.println("before:" + preparedstatement);
		preparedstatement.setDouble(1, price);
		preparedstatement.setString(2, osversion);
		System.out.println("after:" + preparedstatement);
		preparedstatement.executeUpdate();
		return true;
	}
	@Override
	public boolean onUpdatesoftwareversionByOsVersion(String osversion, String softwareversion) throws SQLException {
		Connection connection = DriverManager.getConnection(jdbc.jdbcUrl, jdbc.userName, jdbc.password);

		String query = "update softwareproduct_info set version=? where osversion=?";

		PreparedStatement preparedstatement = connection.prepareStatement(query);
		System.out.println("before:" + preparedstatement);
		preparedstatement.setString(1, softwareversion);
		preparedstatement.setString(2, osversion);
		System.out.println("after:" + preparedstatement);
		preparedstatement.executeUpdate();
		return true;
	}
	@Override
	public boolean onDelete(String softwarename) throws SQLException {
		Connection connection = DriverManager.getConnection(jdbc.jdbcUrl, jdbc.userName, jdbc.password);
		String query = "delete from softwareproduct_info where softwarename=?";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1,softwarename);

		int rows = preparedStatement.executeUpdate();
		if (rows > 0) {
			return true;
		} else {
		return false;
	}
}
}
