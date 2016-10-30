package hw;
/*
 * Topic: 設計一個程式，讓使用者輸入一個正整數n，判斷並輸出n的多少次方才會大於10000
 * Date: 2016/10/24
 * Author: 105021056 王家恩
 */
import java.util.Scanner;
public class hw03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int i = 1;
		double a = 0;
		double v1 = scn.nextInt();
		while(true){
			a = Math.pow(v1,i);
			if(a<=10000){
				
				i++;
			
			}
			else if(a>10000){
				break;
			}
			
		
		}
		System.out.println(i);
		

	}
}