package com.kh._abstract.step1;

public class BasketBall extends Sports{

	public BasketBall(int numOfplayers) {
		super(numOfplayers);
		
	}
	@Override
	public void rule() {
		System.out.println("BasketBall의 선수 수는" + this.numOfplayers + "명, 공을 던저셔 링을 넣는다");
	}
	

}
