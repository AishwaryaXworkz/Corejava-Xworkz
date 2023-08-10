package com.xworkz.softwareproduct.service;

import java.sql.SQLException;

import com.xworkz.softwareproduct.dto.SoftwareProductDto;
import com.xworkz.softwareproduct.repository.SoftwareProductRepository;
import com.xworkz.softwareproduct.repository.SoftwareProductRepositoryImpl;

public class SoftwareProductServiceImpl implements SoftwareProductService{
	SoftwareProductRepository repo=new SoftwareProductRepositoryImpl();
	@Override
	public boolean onSave(SoftwareProductDto dto) throws SQLException {
		if (dto != null) {
			System.out.println("dto is not null we can save the data");
			boolean save = repo.onSave(dto);
			return true;
		} else {
			System.out.println("dto is null we cannot save null values");
			return false;
		}
	
	}
	@Override
	public boolean onSearch(String productversion) throws SQLException {
		boolean search=false;
		if(productversion!=null) {
			search=repo.onSearch(productversion);
			return true;
		}
		return false;
	}
	@Override
	public boolean onSearchByUserid(int userid) throws SQLException {
		boolean search=false;
		if(userid!=0) {
			search=repo.onSearchByUserid(userid);
			return true;
		}
		return false;
	}
	@Override
	public boolean onSearchBySoftwareName(String softwarename) throws SQLException {
		boolean search=false;
		if(softwarename!=null) {
			search=repo.onSearchBySoftwareName(softwarename);
			return true;
		}
		return false;
	}
	@Override
	public boolean readAll() throws SQLException {
		boolean read=repo.readAll();
		return false;
	}
	@Override
	public boolean onUpdate(int id, String username, String email, long phonenumber, String softwarename,
			String version, String doe, String password, double price, String osversion) throws SQLException{
		boolean isUpdated = false;
		if (id != 0 && username!=null && email!=null && phonenumber!=0 && softwarename!=null && version!=null && doe!=null && password!=null && price!=0 && osversion!=null) { 
		isUpdated = repo.onUpdate(id,username,email,phonenumber,softwarename,version,doe,password,price,osversion); 
			System.out.println(isUpdated);
			return true;	
		}else {
			return false;
		}
		
	}
	@Override
	public boolean onUpdatePriceByOsVersion(String osversion, double price) throws SQLException {
		boolean isUpdated=false;
		if(osversion!=null && price!=0) {
			isUpdated=repo.onUpdatePriceByOsVersion(osversion, price);
			System.out.println(isUpdated);
			return true;
		}else {
		return false;
	}
	}
	@Override
	public boolean onUpdatesoftwareversionByOsVersion(String osversion, String softwareversion) throws SQLException {
		boolean isUpdated=false;
		if(osversion!=null && softwareversion!=null) {
			isUpdated=repo.onUpdatesoftwareversionByOsVersion(osversion, softwareversion);
			System.out.println(isUpdated);
			return true;
		}else {
		return false;
	}
}
	@Override
	public boolean onDelete(String softwarename) throws SQLException {
		boolean delete = false;
		if (softwarename != null) {
			delete = repo.onDelete(softwarename);
		}
		if (delete == true) {
			return true;
		} else {
		return false;
	}
}
}


