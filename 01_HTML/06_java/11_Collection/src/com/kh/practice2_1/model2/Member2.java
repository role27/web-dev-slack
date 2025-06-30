package com.kh.practice2_1.model2;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class Member2 {

	private String name;
	private int age;
	private int coupon;
	private ArrayList<Book2> bookList = new ArrayList<>();
	
}
