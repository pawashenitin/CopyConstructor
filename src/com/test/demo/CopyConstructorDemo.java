package com.test.demo;

class CopyConstructor{
	
	public CopyConstructor() {
		System.out.println("Basic Constructor");
	}
	
	public CopyConstructor(int a, int b) {
		this();
		System.out.println("Parameterized Constructor");
	}
	
	public CopyConstructor(CopyConstructor c) { // Copy Constructor, need to provide explicit implementation
		System.out.println("Copy Constructor");
	}

	@Override
	public String toString() {
		return "CopyConstructor [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
}

class CopyConstructorDemo{
	public static void main(String [] args){
		CopyConstructor c = new CopyConstructor(5, 7);
		
		CopyConstructor c1= new CopyConstructor(c);
		
		System.out.println(c1);
	}
	
}