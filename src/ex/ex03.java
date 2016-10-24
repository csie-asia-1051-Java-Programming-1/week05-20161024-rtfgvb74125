package ex;
/*
 * Topic: 讓使用者輸入一正整數 n，並輸出 2^1+2^2+2^3+...+2^n 的值。
 * Date: 2016/10/24
 * Author: 105021056 王家恩
 */
import java.util.Scanner;
public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int v1 = scn.nextInt();
		
		double sum = 0;
		for(int i = 1;i<=v1;i++){
			sum  = Math.pow(2,i)+sum;
			
		}
		System.out.println(sum);

	}

}
