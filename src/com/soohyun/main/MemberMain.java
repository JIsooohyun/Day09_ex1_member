package com.soohyun.main;

import com.soohyun.member.Member;
import com.soohyun.member.MemberController;
import com.soohyun.member.MemberInput;
import com.soohyun.view.MemberView;

public class MemberMain {

	public static void main(String[] args) {
		//프로그램을 시작
		//프로그램을 테스트 하는 목적
		MemberController memberController = new MemberController();
		memberController.start();
		
		/*
		String d1 = "test";
		String d2 = "test";
		//d1과 d2를 비교
		System.out.println(d1.equals(d2));
		*/
	}

}
