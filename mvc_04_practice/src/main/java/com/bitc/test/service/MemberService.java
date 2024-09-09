package com.bitc.test.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bitc.test.model.LoginDTO;
import com.bitc.test.model.MemberVO;



public interface MemberService {
	
	/**
	 * @implNote - 회원가입 요청 처리
	 * @param 회원가입에 필요한 데이터를 MemberVO 타입으로 전달 
	 * 					id - 회원아이디
	 * 					pass - 비밀번호
	 * 					name - 회원 이름
     *
	 * @return boolean - 회원 가입 성공 여부
	 * 					 true : 회원가입 성공
	 *                   false : 회원가입 실패
	 */
	boolean memberJoin(MemberVO member);
	
	/**
	 * @implNote - 로그인 요청 처리
	 * @param request - 로그인 요청 처리에 필요한 parameter 정보,
	 *          id : 로그인 요청 사용자 아이디
	 *          pass : 로그인 요청 사용자 비밀번호
	 *          check : 로그인정보 저장 체크박스
	 *          
	 * @param response - 로그인 요청 처리에 필요한 응답 정보 - 쿠키 처리
	 * 
	 * @return boolean - 로그인 성공 여부 :  true = 로그인 성공 , false 로그인 실패
	 */
	boolean memberLogin(LoginDTO dto,
			HttpServletResponse response);
	
	/**
	 * @param request - 로그아웃 요청 처리에 필요한 Session 정보
	 * @param response - 쿠키 정보 삭제를 위한 정보
	 */
	void logOut(HttpServletRequest request, HttpServletResponse response);
	
}













