package com.sy.s1.bankbook;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BankbookController {
	private BankbookDAO bankbookDAO;
	
	public BankbookController() {
		bankbookDAO = new BankbookDAO();
	}
	
	public void start(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("BankbookController 실행");
		String uri = request.getRequestURI();
		int index = uri.lastIndexOf("/");
		String path = uri.substring(index+1);
		
		if(path.equals("bankbookList.do")) {
			System.out.println("상품목록창");
			ArrayList<BankbookDTO> ar = bankbookDAO.getList();
			for(BankbookDTO bankbookDTO : ar) {
				System.out.println("bookNumber : " + bankbookDTO.getBookNumber());
				System.out.println("bookName : " + bankbookDTO.getBookName());
				System.out.println("bookRate : " + bankbookDTO.getBookRate());
				System.out.println("bookSale : " + bankbookDTO.getBookSale());
			}
			
			RequestDispatcher view = request.getRequestDispatcher("../WEB-INF/view/bankbook/bankbookList.jsp");
			try {
				view.forward(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if(path.equals("bankbookInsert.do")) {
			System.out.println("상품등록창");
		}else if(path.equals("bankbookSelect.do")) {
			System.out.println("상품상세조회상");
			String number = request.getParameter("booknumber");
			System.out.println(number);
			long number2 = Long.parseLong(number);
			
			BankbookDTO bankbookDTO = new BankbookDTO();
			bankbookDTO.setBookNumber(number2);
			bankbookDTO = bankbookDAO.getSelect(bankbookDTO);
			System.out.println(bankbookDTO.getBookName());
			
			RequestDispatcher view = request.getRequestDispatcher("../WEB-INF/view/bankbook/bankbookSelect.jsp");
			try {
				view.forward(request, response);
			}catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			System.out.println("없는 URL 입니다");
		}
		
		
	}
	
}
