package com.sy.s1.test;

import java.sql.Connection;

import com.sy.s1.bankbook.BankbookDAO;
import com.sy.s1.bankbook.BankbookDTO;
import com.sy.s1.util.DBConnector;

public class DBTest {

	public static void main(String[] args) {
		//test 용도		
		DBConnector dbconnector = new DBConnector();
		Connection con = dbconnector.getConnect();
		System.out.println(con);
		
		//bankbookDAO getSelect test
		BankbookDAO bankbookDAO = new BankbookDAO();
		BankbookDTO bankbookDTO = new BankbookDTO();
		bankbookDTO.setBookNumber(2);
		bankbookDTO = bankbookDAO.getSelect(bankbookDTO);
		System.out.println(bankbookDTO.getBookName());
	

	}

}
