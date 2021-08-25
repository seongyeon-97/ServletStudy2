package com.sy.s1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sy.s1.bankbook.BankbookController;
import com.sy.s1.member.MemberController;

/**
 * Servlet implementation class FrontController
 */
@WebServlet("/FrontController")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private MemberController memberController;
    private BankbookController bankbookController;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FrontController() {
        super();
        memberController = new MemberController();
        bankbookController = new BankbookController();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//System.out.println("FrontController 실행");
		String uri = request.getRequestURI();
		//String url = request.getRequestURL().toString();
		System.out.println("uri : "+uri);
		//System.out.println("url : "+url);
		
		String path = "";
		int startindex = request.getContextPath().toString().length();
		int lastindex = uri.lastIndexOf("/");
		path = uri.substring(startindex, lastindex);
		System.out.println("path : "+path);
		if(path.equals("/member")) {
			try {
				memberController.start(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if(path.equals("/bankbook")) {
			bankbookController.start(request, response);			
		}else {
			System.out.println("없는 URL 입니다.");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
