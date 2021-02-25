package com.page;

import com.adactin.BookHotel;
import com.adactin.LoginPage;
import com.adactin.SearchHotel;
import com.adactin.SelectHotel;
import com.base.BaseClass;

public class HotelBooking extends BaseClass{
	
	public static void main(String[] args) throws InterruptedException {
		launchBrowser();
		loadUrl();
		
		LoginPage l=new LoginPage();
		fill(l.getTextUserName(), "prabhusundaram28");
		fill(l.getTextPassword(), "Prabhu@1996");
		btnClick(l.getLoginBtn());
		
		SearchHotel s=new SearchHotel();
		dropDown(s.getLocation(), "Brisbane");
		dropDown(s.getHotels(), "Hotel Sunshine");
		dropDown(s.getRooms(), "Double");
		dropDown(s.getNumberOfRooms(), "1 - One");
		dropDown(s.getAdultPerRoom(), "1 - One");
		dropDown(s.getChildPerRoom(), "1 - One");
		btnClick(s.getSubmitBtn());
		
		SelectHotel sh=new SelectHotel();
		btnClick(sh.getRadioBtn());
		btnClick(sh.getContinueBtn());
		
		BookHotel bk=new BookHotel();
		fill(bk.getFirstName(), "prabhu");
		fill(bk.getLastName(), "kalyan");
		fill(bk.getAddress(), "perungudi");
		fill(bk.getCreditCardNumber(), "1234567890123456");
		dropDown(bk.getCreditCardType(), "VISA");
		dropDown(bk.getExpireMonth(), "July");
		dropDown(bk.getExpireYear(), "2022");
		fill(bk.getCvvNumber(), "399");
		btnClick(bk.getBookNow());
		Thread.sleep(5000);
		value(bk.getOrderNo());
	}

}
