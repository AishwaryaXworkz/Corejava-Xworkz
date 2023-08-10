package com.xworkz.softwareproduct.controller;

import java.sql.SQLException;

import com.xworkz.softwareproduct.dto.SoftwareProductDto;
import com.xworkz.softwareproduct.service.SoftwareProductService;
import com.xworkz.softwareproduct.service.SoftwareProductServiceImpl;

public class SoftwareProductRunner {

	public static void main(String[] args) throws SQLException {
		SoftwareProductDto dto=new SoftwareProductDto();
		dto.setId(4);
		dto.setUsername("sush");
		dto.setEmail("aishumallesh069@gmail.com");
		dto.setPhonenumber(9740322295l);
        dto.setSoftwarename("antivirus");
        dto.setVersion("1.6 version");
        dto.setDoe("3 march 2024");
        dto.setPassword("aishu@1");
        dto.setPrice(10000.00);
        dto.setOsversion("windows 10");
		
        SoftwareProductService service=new SoftwareProductServiceImpl();
       //service.onSave(dto);
        //service.onSearch("1.8 version");
        //service.onSearchByUserid(3);
       //service.onSearchBySoftwareName("jre");
        //service.readAll();
        //service.onUpdate(1, "mahadev", "mahadev@gmail.com", 9986968578l, "lombok", "1.4 version", "5 april 2025", "mahadev@1", 2000.00,"windows 12");
	//service.onUpdatePriceByOsVersion("windows 10",30000.00);
	//service.onUpdatesoftwareversionByOsVersion("windows 10", " 2.0 version");
      service.onDelete("lombok");  
	}

}

