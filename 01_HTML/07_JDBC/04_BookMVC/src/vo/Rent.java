package vo;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Rent {
	
	public int rentNo;
	private String id; // foreign key(client)
	private int bookNo; // foreign key(book)
	private LocalDate rentDate;
	
	
	private Member member;
	private Book book;
	
	
}
