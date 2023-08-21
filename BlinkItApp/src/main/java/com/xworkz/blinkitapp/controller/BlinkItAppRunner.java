package com.xworkz.blinkitapp.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.blinkitapp.dto.BlinkItAppDto;
import com.xworkz.blinkitapp.service.BlinkItAppService;
import com.xworkz.blinkitapp.service.BlinkItAppServiceImpl;

@WebServlet(urlPatterns="/register")
public class BlinkItAppRunner extends HttpServlet {
	BlinkItAppDto dto;
	BlinkItAppService ser;

public BlinkItAppRunner() {
		System.out.println("blinkit constructor");
	}
@Override	
public void init() {
	dto=new BlinkItAppDto();
	ser=new BlinkItAppServiceImpl();
}	


     public void doPost(HttpServletRequest req,HttpServletResponse resp) throws IOException, ServletException{
			System.out.println("doPost method");
			int id=Integer.parseInt(req.getParameter("id"));
			String email=req.getParameter("email");
			long phoneNumber=Long.parseLong(req.getParameter("phoneNumber"));
			String name=req.getParameter("name");
			String address=req.getParameter("address");
			String payment=req.getParameter("payment");
			boolean deliver=Boolean.parseBoolean(req.getParameter("deliver"));
			String deliverperson=req.getParameter("deliverPerson");
			String sharedproducts=req.getParameter("sharedProducts");
			String rateblinkit=req.getParameter("rateBlinkIt");
		
		dto.setId(id);
		System.out.println(id);
		
		dto.setEmail(email);
		System.out.println(email);
		
		dto.setPhoneNumber(phoneNumber);
		System.out.println(phoneNumber);
		
		dto.setName(name);
		System.out.println(name);
		
		dto.setAddress(address);
		System.out.println(address);
		
		dto.setPayment(payment);
		System.out.println(payment);
		
		dto.setDeliver(deliver);
		System.out.println(deliver);
		
		dto.setDeliverPerson(deliverperson);
		System.out.println(deliverperson);
		
		dto.setSharedProducts(sharedproducts);
		System.out.println(sharedproducts);
		
		dto.setRateBlinkIt(rateblinkit);
		System.out.println(rateblinkit);
		
		
		try {
			ser.onSave(dto);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		req.setAttribute("d", dto);
		RequestDispatcher dispatcher=req.getRequestDispatcher("success.jsp");
		dispatcher.forward(req, resp);
		
		
	}	

}
