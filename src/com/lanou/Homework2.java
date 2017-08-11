package com.lanou;

public class Homework2 {
	public static void main(String[] args) {
		/*
		 * 交换两个int变量的值（不借助第三个int变量）
//		 */
//
//		int a = 3, b = 6;
//		// 先将a和b的值赋值给a
//		a = a + b;
//		// b的值等于所赋a的值减去b的值
//		b = a - b;
//		// a的值等于所赋a的值减去b的值
//		a = a - b;
//		// 打印
//		System.out.println("a的值为：" + a);
//		System.out.println("b的值为：" + b);

		// 题目五
		// 步骤：
		// 1：定义两个变量并赋初始值
		// 2：将变量b中的值倒入变量a中（此时变量a中的值为变量a和b的和）
		// 3：将原变量a中的值赋值给变量b（此时变量b中的值为原变量a的值）
		// 4：将原变量b中的值赋值给变量a（此时变量a中的值为原变量b的值）
		// 5：打印变量a和b的值
		

		// 1：定义两个变量并赋初始值
		int a=3,b=5;
		// 2：将变量b中的值倒入变量a中（此时变量a中的值为变量a和b的和）
		 a=a+b;
		// 3：将原变量a中的值赋值给变量b（此时变量b中的值为原变量a的值）
		  b=a-b;
		// 4：将原变量b中的值赋值给变量a（此时变量a中的值为原变量b的值）
		  a=a-b;
		  // 5：打印变量a和b的值
		  System.out.println(a);
		  System.out.println(b);
	}

}
