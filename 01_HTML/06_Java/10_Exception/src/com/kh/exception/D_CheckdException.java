package com.kh.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * CheckdException
 * - Exception 상속하고 있는 예외들 CheckedException
 * - 컴파일 시 예외처리 코드가 있는지 검사하는 예외
 * - 예외처리(try~catch, throws)가 되어 있지 않으면 컴파일 에러
 * - 소스코드 수정으로도 해결 x
 * - 주로 외부에 매게체와 입출력이 일어날때 발생
 * */

public class D_CheckdException {

	public static void main(String[] args) {
		try {// -> I/O 
			FileInputStream fis = new FileInputStream("a.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
