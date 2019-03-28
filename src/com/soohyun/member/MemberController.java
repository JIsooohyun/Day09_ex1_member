package com.soohyun.member;

import java.util.Scanner;

import com.soohyun.view.MemberView;

public class MemberController {

	//start()
	//1.회원가입
	//2.로그인
	//3.회원정보전체출력
	//4.프로그램종료
	private Scanner sc;
	private Member [] members;
	private MemberInput memberInput;
	private MemberView memberView;
	private MemberAdd memberAdd;

	public MemberController() {
		sc = new Scanner(System.in);
		members = new Member[0];  //객체는 있는데 칸 수는 0칸이다. 
		//System.out.println(members.length);
		memberInput = new MemberInput();
		memberAdd = new MemberAdd();
		memberView = new MemberView();
	}

	public void start() {
		boolean check = true;
		int select =0 ;
		while(check) {
			System.out.println("1.회원가입");
			System.out.println("2.로그인");
			System.out.println("3.회원정보전체출력");
			System.out.println("4.프로그램종료");
			System.out.println("----번호 입력----");
			select = sc.nextInt();

			switch(select) {
			case 1:
				System.out.println("----회원가입----");
				Member m = memberInput.memberJoin();
				members = memberAdd.add(members, m);
				break;
			case 2:
				System.out.println("----로그인----");
				Member member =memberInput.memberLogin(members);
				if(member!=null) {
					System.out.println(member.getId()+"님 환영합니다.");
				}else {
					System.out.println("로그인 실패");
				}
				break;
			case 3:
				System.out.println("----회원정보전체출력----");
				memberView.view(members);
				break;
			default:
				check =!check;
				break;
			}
		}
	}

}
