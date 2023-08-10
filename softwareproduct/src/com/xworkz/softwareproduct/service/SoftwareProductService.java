package com.xworkz.softwareproduct.service;

import java.sql.SQLException;

import com.xworkz.softwareproduct.dto.SoftwareProductDto;

public interface SoftwareProductService {
	boolean onSave(SoftwareProductDto dto) throws SQLException;
	boolean onSearch(String productversion) throws SQLException;
	boolean onSearchByUserid(int userid) throws SQLException;
	boolean onSearchBySoftwareName(String softwarename) throws SQLException;
	boolean readAll() throws SQLException;
	boolean onUpdate(int id,String username,String email,long phonenumber,String softwarename,String version,String doe,String password,double price,String osversion)throws SQLException;
	 boolean onUpdatePriceByOsVersion(String osversion,double price) throws SQLException;
	 boolean onUpdatesoftwareversionByOsVersion(String osversion,String softwareversion)throws SQLException;
	 boolean onDelete(String softwarename) throws SQLException;

}







