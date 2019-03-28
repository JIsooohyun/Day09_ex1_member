package com.soohyun.member;

public class MemberAdd {

	public Member [] add(Member [] members,Member member) {
		
		Member [] newMembers = new Member[members.length+1];
		for(int i=0;i<members.length;i++) {
			newMembers[i]=members[i];
		}
		newMembers[members.length]= member;
		
		return newMembers;
	}
}
