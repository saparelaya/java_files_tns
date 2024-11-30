package org.tns.capgemini.c2tc.arraydemo;

public class JaggedArray {

	public static void main(String[] args) {
		int[][] studentInGrade=new int[3][];
		
		studentInGrade[0] =new int[2];
		studentInGrade[1]=new int[3]; 
		studentInGrade[2]=new int[1]; 
		
		studentInGrade[0][0]=10; 
		studentInGrade[0][1]=20; 
	
		studentInGrade[1][0]=30; 
		studentInGrade[1][1]=40; 
		studentInGrade[1][2]=50; 
		
		studentInGrade[2][0]=60; 
		
		for (int i=0;i<studentInGrade.length;i++) 
		{
			for (int j=0;j<studentInGrade[i].length;j++)
				System.out.println("Grade " + (i+1) + " student " + (j+1)+ ":"  +studentInGrade[i][j]);
			}
		}
		
		
		
	}