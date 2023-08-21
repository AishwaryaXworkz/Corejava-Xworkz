package com.xworkz.blinkitapp.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.xworkz.blinkitapp.dto.BlinkItAppDto;
import com.xworkz.blinkitapp.utils.BlinkItAppUtil;

public class BlinkItAppRepositoryImpl implements BlinkItAppRepository {
	BlinkItAppUtil jdbc=new BlinkItAppUtil();
	@Override
	public boolean onSave(BlinkItAppDto dto) throws SQLException {
		System.out.println("Dto:" + dto);
        try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
	
			e.printStackTrace();
		}
		Connection connection = DriverManager.getConnection(jdbc.jdbcUrl, jdbc.userName, jdbc.password);

		String query = "insert into blinkit_info values(?,?,?,?,?,?,?,?,?,?)";

		PreparedStatement preparedstatement = connection.prepareStatement(query);
		System.out.println("before:" + preparedstatement);

		preparedstatement.setInt(1, dto.getId());
		preparedstatement.setString(2,dto.getEmail());
		preparedstatement.setLong(3,dto.getPhoneNumber());
		preparedstatement.setString(4,dto.getName());
		preparedstatement.setString(5,dto.getAddress());
		preparedstatement.setString(6,dto.getPayment());
		preparedstatement.setBoolean(7,dto.isDeliver());
		preparedstatement.setString(8,dto.getDeliverPerson());
		preparedstatement.setString(9,dto.getSharedProducts());
		preparedstatement.setString(10,dto.getRateBlinkIt());
		
		System.out.println("after:" + preparedstatement);

		int rows = preparedstatement.executeUpdate();
		if (rows > 0) {
			return true;
		} else {
			return false;
		}
}
	
}
