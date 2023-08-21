package com.xworkz.blinkitapp.service;

import java.sql.SQLException;
import com.xworkz.blinkitapp.dto.BlinkItAppDto;

public interface BlinkItAppService {
	boolean onSave(BlinkItAppDto dto) throws SQLException;

}
