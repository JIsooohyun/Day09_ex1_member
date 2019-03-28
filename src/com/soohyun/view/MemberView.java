package com.soohyun.view;

import com.soohyun.member.Member;

//view는 출력을 담당하는 메서드
public class MemberView {
	
	//member 한명의 정보를 출력하는 메서드
	//member 들의 정보를 출력하는 메서드
	
	//오버로딩을 사용하세요
	public void view(Member member) {  //정보를 가지고 있는 멤버가 오면 된다. 
		System.out.println("ID : " +member.getId());
		System.out.println("PW : "+member.getPw());
		System.out.println("Age : "+member.getAge());
		System.out.println("Emaile : " +member.getEmail());
		System.out.println("Phone : " +member.getPhone());
		System.out.println("--------------------");
		
	}
	
	public void view(Member [] members) {
		for(int i=0; i<members.length; i++) {
			Member member = members[i];
			this.view(member);
			
		}
		
	}
	

}
