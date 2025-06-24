package com.kh._abstract.step1;


//추상클래스
public abstract class Sports {
	
	protected int numOfplayers; // 참여 사람 수

	public Sports(int numOfplayers) {
		this.numOfplayers = numOfplayers;
	}

	// 추상메서드! 즉, 미완성된 메서드! 구현부가 x -> 자식클래스에서 강제구현
	public abstract void rule();
	}
	


