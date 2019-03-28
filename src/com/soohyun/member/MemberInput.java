package com.soohyun.member;

import java.util.Scanner;

public class MemberInput {

	private Scanner sc;
	
	public MemberInput() { // 생성자 !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		sc = new Scanner(System.in);
	}
	//memberLogin
	//매개변수로 Member []을 받아서 
	//로그인 성공시  member을 리턴
	public Member memberLogin(Member [] members) {
		Member member = null; //reference타입은 null값을 넣어준다.
		System.out.println("ID를 입력하세요");
		String id = sc.next();
		
		System.out.println("PW을 입력하세요");
		String pw = sc.next();
		
		for(int i=0; i<members.length; i++) {
			if(id.equals(members[i].getId()) && pw.equals(members[i].getPw())) {
				member = members[i];
				break;
				//string타입은 a.equals(b)) 사용한다. 
			}
			
		}
		return member;
	}
	
	
	
	//memberjoin
	//id, pw, 나이, 이메일, 전화번호
	//member를 리턴
	
	public Member memberJoin() {
		Member member = new Member();
		
		System.out.println("ID 입력");
		member.setId(sc.next());
		
		System.out.println("PW 입력");
		member.setPw(sc.next());
		
		System.out.println("나이 입력");
		//int age = sc.nextInt();    밑에서 이 변수로 다른 일을 한다면 그냥 선언 
		member.setAge(sc.nextInt());  //but 값만 집어 넣는다면 바로 입력
		
		System.out.println("Email 입력");
		member.setEmail(sc.next());
		
		System.out.println("Phone 입력");
		member.setPhone(sc.next());
		
		return member;
	}
}
