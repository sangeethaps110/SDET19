package com.generic;

import java.util.Random;

public class Generaterandomnumber {

	public int generaterandomnum() {
		
Random r=new Random();
int randomnum=r.nextInt(1000);
return randomnum;
	}

}
