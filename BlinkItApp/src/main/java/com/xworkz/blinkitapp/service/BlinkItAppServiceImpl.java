package com.xworkz.blinkitapp.service;

import java.sql.SQLException;

import com.xworkz.blinkitapp.dto.BlinkItAppDto;
import com.xworkz.blinkitapp.repository.BlinkItAppRepository;
import com.xworkz.blinkitapp.repository.BlinkItAppRepositoryImpl;

public class BlinkItAppServiceImpl implements BlinkItAppService {
	BlinkItAppRepository repo=new BlinkItAppRepositoryImpl();

	@Override
	public boolean onSave(BlinkItAppDto dto) throws SQLException {
		if (dto != null) {
			System.out.println("dto is not null we can save the data");
			boolean save = repo.onSave(dto);
			return true;
		} else {
			System.out.println("dto is null we cannot save null values");
			return false;
		}
		
	}
}
