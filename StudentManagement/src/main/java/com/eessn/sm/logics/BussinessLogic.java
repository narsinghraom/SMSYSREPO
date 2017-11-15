package com.eessn.sm.logics;

import java.util.Random;

public class BussinessLogic 
{
	public static String generatedId(){
	String adimissionId="SC-";
	adimissionId=adimissionId+unqiueNumber();
	return adimissionId;

}

private  static String unqiueNumber()
{
	String unqiueNo=null;
	Random random=new Random();
	int randomNo=random.nextInt(1000);
	unqiueNo=factorial(randomNo);
	return unqiueNo;
	
}
private static String factorial(int randomNo)
{
	String factString=" ";
	int fact=1;
	for(int i=0;i<=randomNo-1;i++){
		fact=(fact*1)+randomNo;
	}
	if(fact<0){
		fact=fact*(-1);
	}
	Integer inter=new Integer(fact);
	String factstr=inter.toString();
	if(factstr.length()>4){
		for(int i=0;i<=3;i++){
			factString=factString+factstr.charAt(i);
		}
	}
	else{
		fact=fact+1000;
		Integer integer=new Integer(fact);
		factstr=integer.toString();
	}
	return factstr;
	
}

public static void main(String[] args) {
	System.out.println(BussinessLogic.generatedId());
}
}


