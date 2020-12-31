package strings;

import java.math.BigInteger;

class Abc{
	String name;
	int a;
	Abc(String name,int a){
		this.name=name;
		this.a=a;
	}
	public String toString() {
		return name;
	}
	
}
class Practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*Abc a=new Abc("Abc",10);
		Abc b=new Abc("Agfhf",20);
		System.out.println(a);
		System.out.println(b);*/
		String s="1562415";
		//System.out.println(s.indexOf('6'));
		//System.out.println(sol(s));
		
		
	}

	static BigInteger sol(String s) {
		// TODO Auto-generated method stub
		BigInteger b=new BigInteger("1");
		for(int i=1;i<s.length();i++) {
			b=b.multiply(BigInteger.valueOf(Integer.parseInt(""+s.charAt(i))));
		}
		System.out.println(b.add(BigInteger.valueOf(5)));
		return b;
	}

}
