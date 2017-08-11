package com.lanou;

public class HomeWork1 {

	/*
	 * 在控制台下打印如下 *********** **Android** ***********
	 * 
	 * 主函数（入口函数）
	 */
	public static void main(String[] args) {
		// 打印
		// System.out.println("***********");
		// System.out.println("**Android**");
		// System.out.println("***********");
		// }
		/*
		 * B类作业： 1.189元如何使用最少的100元，50元，20元，10元，5元，1元组成，并输出各面值的 钱币的张数。
		 */
		// 步骤

		// 1:定义七个常规变量，一个特殊变量
		// 2：计算整张100元的张数
		// 3：计算除去整张100元所剩余的钱数
		// 4：用剩余钱数计算整张50元的张数
		// 5：计算除去整张50元所剩余的钱数
		// 6：用剩余钱数计算整张20元的张数
		// 7：计算除去整张20元所剩余的钱数
		// 8：用剩余钱数计算整张10元的张数
		// 9：计算除去整张10元所剩余的钱数
		// 10：用剩余钱数计算整张5元的张数
		// 11：计算除去整张5元所剩余的钱数
		// 12：用剩余钱数计算整张1元的张数
		// 13：打印

		// 1:定义七个常规变量，一个特殊变量
		int num = 189;
		int min100, min50, min20, min10, min5, min1;
		int remainder;

		// 2：计算整张100元的张数
		min100 = num / 100;
		// 3：计算除去整张100元所剩余的钱数
		remainder = num % 100;
		// 4：用剩余钱数计算整张50元的张数
		min50 = remainder / 50;
		// 5：计算除去整张50元所剩余的钱数
		remainder = remainder % 50;
		// 6：用剩余钱数计算整张20元的张数
		min20 = remainder / 20;
		// 7：计算除去整张20元所剩余的钱数
		remainder = remainder % 20;
		// 8：用剩余钱数计算整张10元的张数
		min10 = remainder / 10;
		// 9：计算除去整张10元所剩余的钱数
		remainder = remainder % 10;
		// 10：用剩余钱数计算整张5元的张数
		min5 = remainder / 5;
		// 11：计算除去整张5元所剩余的钱数
		remainder = remainder % 5;
		// 12：用剩余钱数计算整张1元的张数
		min1 = remainder / 1;
		// 13：打印
		System.out.println("100元的张数为：" + min100 + "," + "50元的张数为：" + min50 + "," + "20元的张数为：" + min20 + "," + "10元的张数为："
				+ min10 + "," + "5元的张数为：" + min5 + "," + "1元的张数为：" + min1);
		// 将变量a赋值
		int a = 189;
		// a除以100所得出的值为a1就等于100元的张数，取余数赋值为变量a2
		int a1 = a / 100, a2 = a % 100;
		// 通过计算得出50元的张数
		int a3 = a2 / 50;
		// 取余数赋值给变量a2
		a2 = a2 % 50;
		// 计算得出20元的张数
		int a4 = a2 / 20;
		// 取余数赋值给变量a2
		a2 = a2 % 20;
		// 计算的出10元的张数
		int a5 = a2 / 10;
		// 取余数赋值给变量a2
		a2 = a2 % 10;
		// 计算得出5元的张数
		int a6 = a2 / 5;
		// 取余数赋值给变量a2
		a2 = a2 % 5;
		// 计算的出1元的张数
		int a7 = a2 / 1;
		// 打印
		System.out.println("需要100元面值钱币的张数为：" + a1);
		System.out.println("需要50元面值钱币的张数为：" + a3);
		System.out.println("需要20元面值钱币的张数为：" + a4);
		System.out.println("需要10元面值钱币的张数为：" + a5);
		System.out.println("需要5元面值钱币的张数为：" + a6);
		System.out.println("需要1元面值钱币的张数为：" + a7);

		/*
		 * 55除以2，86除以2，56除以10 要求四舍五入后的
		 */

         //步骤
		//1:定义两个变量
		//2:求出余数并打印
		//3:主观判断（商的结果是否+1），并求出商，打印结果
		
		//1:定义两个变量
//		int n1=55;
//		int n2=2;
//		//2:求出余数并打印
//		int n=n1/n2;
//		System.out.println(n);
//		//3:主观判断（商的结果是否+1），并求出商，打印结果
//		int res=n1/n2+1;
//		System.out.println(res);
		
		//作业补充
//		int n1=55;
//		int n2=2;
//		int n=n1/n2;
//		
//		System.out.println();
		
		double d1=55;
		double d2=2;
		double d=d1/d2;
		System.out.println(Math.round(d));
	    
		
		
//		int i = 55;
//		// 求出变量i除以2所得出的余数值i1
//		int i1 = i % 2;
//		// 打印
//		System.out.println("余数为：" + i1);
//		// 余数i1能被2整除所得值大于5则进行五入
//		int i2 = i / 2 + 1;
//		// 打印
//		System.out.println("四舍五入后所得值为：" + i2);
//
//		int n = 86;
//		// 求出变量n除以2所得出的余数值n1
//		int n1 = n % 2;
//		// 打印
//		System.out.println("余数为：" + n1);
//		// 余数n2为0，则表示为n的值能被2整除则直接输出
//		int n2 = n / 2;
//		// 打印
//		System.out.println("四舍五入后所得值为：" + n2);
//
//		int s = 56;
//		// 求出变量s除以10所得出的余数s1
//		int s1 = s % 10;
//		// 打印
//		System.out.println("余数为：" + s1);
//		// 余数s1除以10所得值大于5则进行五入
//		int s2 = s / 10 + 1;
//		System.out.println("四舍五入后所得值为：" + s2);
//
	}

}
