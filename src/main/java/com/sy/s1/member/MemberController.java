package com.sy.s1.member;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MemberController {
	
	private MemberService memberService;
	
	public MemberController() {
		memberService = new MemberService();
	}
	
	public void start(HttpServletRequest request, HttpServletResponse response) throws Exception {		
		
		System.out.println("MemberController 실행");
		String uri = request.getRequestURI();
		String path = "";
		int lastindex = uri.lastIndexOf("/");
		path = uri.substring(lastindex+1);
		
		if(path.equals("memberLogin.do")) {
			System.out.println("로그인창");
			String value = request.getParameter("id");
			System.out.println(value);
			String value2 = request.getParameter("pw");
			System.out.println(value2);
			
		}else if(path.equals("memberJoin.do")){
			System.out.println("회원가입창");

			String method = request.getMethod();
			System.out.println(method);
			
			if(method.equals("POST")) {
				
				int result = memberService.memberJoin(request, response);
				if(result>0) {
					response.sendRedirect("../index.jsp");
				}else {
					response.sendRedirect("./");
				}
				
			}else if(method.equals("GET")) {
				
				RequestDispatcher view = request.getRequestDispatcher("../WEB-INF/view/member/memberJoin.jsp");
				view.forward(request, response);				
			}

		}else if(path.equals("memberPage.do")) {
			
			System.out.println("마이페이지창");
			
		}else {
			
			System.out.println("없는 URL 입니다.");
			
		}
		
	}
	
}
