package com.kh.practice2;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.practice2.controller.BookController;
import com.kh.practice2.controller.MemberController;
import com.kh.practice2.model.Book;
import com.kh.practice2.model.Member;

public class Application {

	Scanner sc = new Scanner(System.in);
	MemberController mc = new MemberController();
	BookController bc = new BookController();
	
	public static void main(String[] args) {
		//멤버들의 정보가 들어갈 공간
		ArrayList<Member> members = new ArrayList<>();

		// 대여 가능한 책 목록
		ArrayList<Book> books = new ArrayList<>();
		{
			books.add(new Book("디스 이즈 이탈리아", false, 0));
			books.add(new Book("리얼 런던", true, 0));
			books.add(new Book("집에서 즐기는 스페인 요리 여행", false, 0));
			books.add(new Book("사퀴트리 샌드위치", false, 0));
			books.add(new Book("원피스 111", true, 15));
			books.add(new Book("귀멸의 칼날 23", false, 19));
			books.add(new Book("진격의 거인 Before the fall 16", false, 19));
		}
		
		/*
		 * 이름 : 
		 * 나이 :
		 * 
		 * -> 회원가입 / 로그인 조건 : 이름과 나이가 일치한 경우 
		 * -> 기존에 회원중 이름이 있으면 "이미 존재하는 이름입니다. 다시 입력해주실래요?"
		 * 
		 * 
		 * === 메뉴 === 
		 * 1. 마이페이지 -> 본인정보 
		 * 2. 도서 대여하기 
		 * -> 1) 한 사람 당 대여할 수 있는 책은 총 3권
		 *     "더 이상 대여할 수 없습니다." 
		 * -> 2) 해당 사람이 대여한 책은 대여 불가능 
		 *     "이미 대여한 책입니다" 
		 *-> 3) 나이 제한에 걸리는 책들 대여 불가능 
		 *     "나이 제한으로 대여 불가능합니다."      
		 *-> 4) 쿠폰이 있는경우 나이 제한 걸려도 대여 가능 
		 *-> (선택사항)5) 각 책들마다 가능한 대여가 3권까지만 :HashMap -> getOrDefault(키, 초기값); 
		 *  -> 대여가 가능한경우 :"성공적으로 대여되었습니다."
		 * 
		 * 3. 로그아웃 
		 * 4. 프로그램 종료
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		
		Application app = new Application();
		app.menu();
		app.rent();
	}
	
	public void menu() {
		Member m = new Member();
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("나이 : ");
		int age = Integer.parseInt(sc.nextLine());
		
		boolean loginCheck = mc.registerAndLogin(name, age); // 아이디가 없는 경우
		
		if (loginCheck) {
			System.out.println("이미 존재하는 이름입니다. 다시 입력해주실래요?");
		}
		else {
			System.out.println(name + "님이 로그인되었습니다.");
		}
		
		 while (true) {
		        System.out.println("====메뉴====");
		        System.out.println("1. 마이페이지");
		        System.out.println("2. 도서 대여하기");
		        System.out.println("3. 로그아웃");
		        System.out.println("4. 프로그램 종료");
		        System.out.print("메뉴 번호 : ");
		        int num = Integer.parseInt(sc.nextLine());

		        switch(num){
		            case 1:
		            	menu();
		                break;
		            case 2:
		            	rent();
		                break;
		            case 3:
		                System.out.println("3. 로그아웃");
		                return; // 로그인 화면으로 돌아가기
		            case 4:
		                System.out.println("프로그램을 종료합니다.");
		                System.exit(0);
		            default:
		                System.out.println("잘못된 번호입니다.");
		        }
		 }
	}
	
	
	public void rent() {
		// 2. 도서 대여하기
		
		//1) 한 사람 당 대여할 수 있는 책은 총 3권
		if (bc.count < 3) {
	      System.out.println ("더 이상 대여할 수 없습니다.");
		}
	    // 2) 해당 사람이 대여한 책은 대여 불가능 
           System.out.println ("이미 대여한 책입니다");
	    //나이 제한에 걸리는 책들 대여 불가능 
           System.out.println ( "나이 제한으로 대여 불가능합니다.");      
	    //쿠폰이 있는경우 나이 제한 걸려도 대여 가능 
	    //(선택사항)5) 각 책들마다 가능한 대여가 3권까지만 :
		//HashMap -> getOrDefault(키, 초기값); 
	    // 대여가 가능한경우 
	      System.out.println ("성공적으로 대여되었습니다.");
	}
	

}
