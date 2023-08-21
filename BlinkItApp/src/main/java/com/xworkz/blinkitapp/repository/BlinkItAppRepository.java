package com.xworkz.blinkitapp.repository;

import java.sql.SQLException;
import com.xworkz.blinkitapp.dto.BlinkItAppDto;

public interface BlinkItAppRepository {
	boolean onSave(BlinkItAppDto dto) throws SQLException;

}
