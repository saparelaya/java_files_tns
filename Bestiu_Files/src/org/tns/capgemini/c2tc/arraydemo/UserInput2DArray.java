package org.tns.capgemini.c2tc.arraydemo;

import java.util.Scanner;

public class UserInput2DArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int rows=scan.nextInt();
		System.out.println("Enter the number of columns:");
		int col=scan.nextInt();
		
		int multidimensionarray[][]=new int[rows][col];
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<col;j++)
			{
				multidimensionarray[i][j]=(i+1)*(j+1);
			}
		}
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(multidimensionarray[i][j] + " ");
			}
			System.out.println();
		}
		scan.close();
	}

}