package com.kh.practice1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Application {

	public static void main(String[] args) {
		int[] result = new int[4];
		//index: 0-2등, 1-3등, 2-4등, 3-5등

		
		// 1등 당첨 기준이 로또 번호 6개
		// 둘 다 랜덤 , 로또 번호는 1번
		// 내 번호는 맞출때 까지 1~45
		// 정렬이 맞으면 equals로 비교 가능

		Set<Integer> lotto = new HashSet<>();
		// 반복문이 로또번호가 6개 될 때까지

		// 만약 2등 당첨 , 보너스 번호 가 일치 + 5개가 같은 경우
		// 3등 당첨, 5개만 같은 경우
		// 4등 당첨, 4개만 같은 경우
		// 5등 당첨, 3개만 같은 경우

		while (lotto.size() < 7) {
			lotto.add((int) (Math.random() * 45) + 1);

		}

		List<Integer> lottoList = new ArrayList<>(lotto); // set->list
		
		List<Integer> reallotto = new ArrayList<>(lotto);
		int bonus = lottoList.get(6);

		// --------------------------
		int count = 0;

		while (true) {
			count++;
			List<Integer> Mylotto = new ArrayList<>();
			while (Mylotto.size() < 6) {
				int number = (int) (Math.random() * 45) + 1;
				if (!Mylotto.contains(number)) {
					Mylotto.add(number);

				}

			}
			Collections.sort(lottoList);
			Collections.sort(Mylotto);
			System.out.println("로또번호: " + reallotto);
			System.out.println("내 번호: " + Mylotto);

			int check = 0;
			for (Integer number : reallotto) {
				if (Mylotto.contains(number)) {
					check++;
				}
			}if (reallotto.equals(Mylotto)) {
				System.out.println("1등 당첨! 까지 걸린 횟수 : " + count);
				for(int i = 0; i< result.length; i++) {
					System.out.println((i+2) + "등 횟수 : " + result[i] + "");
				}
				break;
			} else if (check == 5 && Mylotto.contains(bonus)) { // 2등 당첨 , 5개가 같고, 보너스 번호가 일치
				System.out.println("2등 당첨! 보너스 번호 :  " + bonus + ", 횟수 : " + count);
				result[0]++;
			} else if (check == 5) {
				System.out.println("3등 당첨! 횟수 : " + count);
				result[1]++;
			} else if (check == 4) {
				System.out.println("4등 당첨! 횟수 : " + count);
				result[2]++;
			} else if (check == 3) {
				System.out.println("5등 당첨! 횟수 : " + count);
				result[3]++;

			}
		}
	}
}
