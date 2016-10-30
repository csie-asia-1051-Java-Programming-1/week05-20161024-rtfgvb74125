package ex;

/*
 * Topic: 某個陣列中含有所有學生的學號，但並沒有按照大小次序排列。請寫一程式依學號大小排列並將結果輸出。
 * Date: 2016/10/24
 * Author: 105021056 王家恩
 */
import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int v1 = scn.nextInt();
		int sum = 0;
		int data[] = new int[v1];
		for (int i = 0; i < v1; i++) {
			data[i] = scn.nextInt();
		}
		for (int i = 0; i < data.length-1; i++) {
			for (int j = 0; j < data.length-1; j++) {
				if(data[j+1]>data[j]){
					sum = data[j+1];
					data[j+1] = data[j];
					data[j] = sum;
					
				}
			}
			
		}
		for(int i = 0;i<data.length;i++){
			System.out.print(data[i] + "\t");
		}
		

	}

}
