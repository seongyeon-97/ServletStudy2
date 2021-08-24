package com.sy.s1.member;

import javax.servlet.http.HttpServletRequest;

public class MemberController {
	
	public void start(HttpServletRequest request) {		
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
		}else if(path.equals("memberPage.do")) {
			System.out.println("마이페이지창");
		}else {
			System.out.println("없는 URL 입니다.");
		}
		
	}
	
}
