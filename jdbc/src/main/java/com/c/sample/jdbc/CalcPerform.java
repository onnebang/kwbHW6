package com.c.sample.jdbc;

public class CalcPerform {
	int x,y;
	Calculator cal;
	
	public void setCal(Calculator Cal) {
		this.cal = cal;
	}
	
	public int settest(int x) {
		return x;
	}
	
	public int calResult(int op, int x, int y) {
		this.x=x;
		this.y=y;
		
		if(op==1)
			return cal.add(x,y);
		else if(op==2) 
			return cal.sub(x,y);
		else
			return cal.mul(x,y);
	}
}