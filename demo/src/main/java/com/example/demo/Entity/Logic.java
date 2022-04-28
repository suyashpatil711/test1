package com.example.demo.Entity;

import java.util.Arrays;

public class Logic {
	private String d[];
	private int num[];
	private char alphabets[];
	private int countnum;
	private int countchar;

	public Logic() {
		super();
	}

	public Logic(String[] d, int[] num, char[] alphabets) {
		super();
		this.d = d;
		this.num = num;
		this.alphabets = alphabets;
	}

	public Logic(String[] d) {
		super();
		this.d = d;
	}

	public String[] getD() {
		return d;
	}

	public int[] getNum() {
		return num;
	}

	public void setNum(int[] num) {
		this.num = num;
	}

	public char[] getAlphabets() {
		return alphabets;
	}

	public void setAlphabets(char[] alphabets) {
		this.alphabets = alphabets;
	}

	public void setD(String[] d) {
//		String dd=",";
//		this.d=d.split(dd);
		this.d=d;
	}
	public void setLogic() {
		for (int i=0; i<d.length;i++) {
			
			String ss=d[i];
			char t=ss.charAt(0);
			if(Character.isDigit(t)) {
				countnum++;
			}
			else
				countchar++;
		}
		System.out.println(countnum+"cnum");
		System.out.println(d.length+"dddd");
		int num1[]=new int[countnum];
		int cc=0;
		int cnum=0;
		char alphabets1[]=new char[countchar];
		for (int i=0; i<d.length;i++) {
			String ss= d[i];
			char t=ss.charAt(0);
			//System.out.println(t);
			if(Character.isDigit(t)) {
				num1[cc]=Character.getNumericValue(t);
				cc++;
			}
			else
			{
				alphabets1[cnum]=t;
				cnum++;
			}
			
		}
		this.num=num1;
		this.alphabets=alphabets1;
	}
	

	@Override
	public String toString() {
		return "Logic [d=" + Arrays.toString(d) + ", num=" + Arrays.toString(num) + ", alphabets="
				+ Arrays.toString(alphabets) + ", countnum=" + countnum + ", countchar=" + countchar + "]";
	}
	
}
