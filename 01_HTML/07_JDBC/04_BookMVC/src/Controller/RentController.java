package Controller;

import java.util.ArrayList;

import vo.Rent;

public class RentController {
	
	
	// 로그인된 경우만 접근 가능 -> view에서 조건걸어서 안보이게 하면 됨
	
	// 7. 책 대여
	public void rentBook(String id, int bookNo) {
		
		
		// 한 사람당 대여할 수 있는 책 총 5권
		
		// 중복책 대여 불가능
		
		// 나이 제한 걸리는 책도 불가능
		
		// 각 책들마다 가능한 대여가 2권까지만
		
	}

	// 8. 내가 대여한 책 조회
	public ArrayList<Rent> printRentBook(String id){
		return null;
	}
	
	//9. 대여취소
	public void deleteRent(int rentNo) {
		
	}
}
