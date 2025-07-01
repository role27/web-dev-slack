package com.kh.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 문자 기반 스트림
 * - 문자 데이터를 읽고 출력할때 사용
 * -Reader, Writer : 문자 기반 입출력 스트림의 최상위 클래스
 * 
 * */
public class FileReadingTest {
	
	String fileName = "src/test.txt";
	String resultName = "src/result.txt";

	public static void main(String[] args) {
		
		FileReadingTest  f = new FileReadingTest();
		//f.fileSave();
		f.fileRead();
		

	}

	public void fileSave() {
		//FileWriter : 파일을 생성하고 데이터 문자 단위 저장
		// try = with - resource 문 : 사용한 리소스를 자동으로 close()
		try (FileWriter fw = new FileWriter(fileName, true)){
			//true - 이어서 쓰기, false -새롭게 쓰기
			fw.write("IO/n");
			fw.write("Thread/n");
			fw.write("Network/n");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
		
		public void fileRead() {
			//FileReader : 파일에서 데이터를 문자 단위로 읽어온다.
			try(FileReader fr = new FileReader(fileName)){
				int data = 0;
				while((data = fr.read()) != -1) {
					System.out.println((char)data);
				} catch( IOException e) {
					e.printStackTrace();
				}
			
		}
			//
			public void fileReadToSave() {
				/*
				 * 
				 * 
				 * 
				 * printWriter : 프린터와 유사하게 출력하는 print(), Println()에서도 가지고 있는 보조 스트림
				 * */
				
			}
				try {
					FileReader fr = new FileReader(fileName);
					BufferedReader br = new BufferedReader(fr);
					BufferedWriter bw = new BufferedWriter(fr);
					){
						String line = "";
						While ((line = br.readLine())!=null){
							System.out.println(line);
							
						
						}
						
				
						} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
				
				}
			
			


}