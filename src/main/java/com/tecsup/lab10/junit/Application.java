package com.tecsup.lab10.junit;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Application app = new Application();	
		int sum = app.sumar(4,5);		
		int res = app.restar(4,5);

	}
	
	public  int restar(int i, int j) {
		// TODO Auto-generated method stub
		return i-j;
	}

	public  int sumar(int i, int j) {
		// TODO Auto-generated method stub
		return i+j;
	}


}
