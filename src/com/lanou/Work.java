package com.lanou;

public class Work {
	/*
	 * 主函数（入口函数）
	 */
   
	public static void main(String[] args) {
		//1:调换两个数的值（int a=3;int b=5）
		/*
		 * 步骤
		 * 1：定义一个变量c（中间量）
		 * 2：将变量a中的值赋值给变量c
		 * 3：将变量b中的值赋值给变量a
		 * 4：将变量c中的值赋值给变量b
		 */
//		int a=3;
//		int b=5;
//		//定义一个变量c
//		int c;
//		//将变量a中的值赋值给变量c
//		c=a;
//		//将变量b中的值赋值给变量a
//		a=b;
//		//将变量c中的值赋值给变量b
//		b=c;
//		System.out.println("a="+a+","+"b="+b);
		
		/*
		 * 步骤
		 * 1、定义一个变量c（c=a+b）
		 * 2、将变量c和a的差赋值给b
		 * 3、将变量c和a的差赋值给a
		 */
		int a=3;
		int b=5;
		int c=a+b;
		a=c-a;
	    b=c-b;
	    System.out.println(b);
	    System.out.println(a);
		
	}
}
