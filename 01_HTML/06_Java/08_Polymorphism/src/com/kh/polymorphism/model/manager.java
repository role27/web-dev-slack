package com.kh.polymorphism.model;

public class manager extends Employee {
	private String depr;

	public manager() {
	}

	public manager(String name, int salary, String depr) {
		super(name, salary);
		this.depr = depr;
	}

	public String getDepr() {
		return depr;
	}

	public void setDepr(String depr) {
		this.depr = depr;
	}

	@Override
	public String toString() {
		return "manager [depr=" + depr + ", getName()=" + getName() + ", getSalary()=" + getSalary() + "]";
	}

	
	
	

}
