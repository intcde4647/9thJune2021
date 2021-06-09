package com.cts.demo.model;

public class EvenCheck {
private int num;

public int getNum() {
	return num;
}

public void setNum(int num) {
	this.num = num;
}

public boolean isEven()
{
	boolean even=false;
	if(num%2==0)
	{
		even=true;
	}
   return even;
}

}
