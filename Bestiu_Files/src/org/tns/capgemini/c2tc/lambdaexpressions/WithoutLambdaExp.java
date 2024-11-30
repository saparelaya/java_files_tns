package org.tns.capgemini.c2tc.lambdaexpressions;

interface Drawablee{  
    public void draw();  
}  
class test implements Drawablee {
	int width =36;
	public void draw()
	{
		System.out.println("Drawing: "+width);
	}  
};  
public class WithoutLambdaExp {  
    public static void main(String[] args) {      
    	Drawablee d = new test();
        d.draw();  
    }  
} 