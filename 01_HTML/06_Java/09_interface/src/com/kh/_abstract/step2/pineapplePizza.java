package com.kh._abstract.step2;

public class pineapplePizza extends Pizza{

	public pineapplePizza(int price, String brand) {
		super(price, brand);
		
	}

	@Override
	public void made() {
		System.out.println("피자 반죽과 함께 도우를 빚는다.");
		System.out.println("피자를 180도 10분간 구운다.");
		System.out.println("피자를 8등분 한다.");
		System.out.println("피자를 포장한다.");
	};
	
	@Override
	public void info(){
		System.out.println( this.brand + "의 파인애플피자는 가격은" + this.price+ "원");
	};
	
	public void topping() {
		System.out.println("토핑은 파인애플 포함한다.");
	};
}
