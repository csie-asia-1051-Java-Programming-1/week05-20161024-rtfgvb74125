package hw;

/*
 * Topic: 有一 n x n的矩陣(1＜n＜21)，輸入 n 後，試以程式繪出此一方陣，方陣結構如下，例如 n=5 時：
 * Date: 2016/10/24
 * Author: 105021056 王家恩
 */
import java.util.Scanner;

public class hw05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int v1 = scn.nextInt();
		int data[][] = new int[v1][v1];
		int a = 1;
	
		for (int i = 0; i < v1; i++) {
		for (int j = 0; j <=i; j++) {
			data[i-j][j] = a;
				a++;
			}
		}
		for(int k = 1;k<v1;k++){
			for(int h = 0;h<v1-k;h++){
				data[v1-h-1][k+h] = a;
				a++;
			}
		}
		for (int i = 0; i < v1; i++) {
			for (int j = 0; j < v1; j++) {
				System.out.print(data[i][j]+"\t");
				
			}
			System.out.println();
		}

	}

}
