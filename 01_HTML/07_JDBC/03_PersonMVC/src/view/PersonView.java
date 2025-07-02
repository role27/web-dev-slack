package view;



import java.sql.SQLException;
import controller.Personcontroller;

public class PersonView {
	
	

	public static void main(String[] args) {
		
		Personcontroller pc = new Personcontroller();

		
		
		// 테스트 용도
		
	
	    try {
			pc.addPerson();
			pc.searchAllPerson();
			pc.searchPerson();
			pc.updatePerson();
			pc.removePerson();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	
	}

}
