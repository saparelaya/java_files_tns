package org.tns.capgemini.c2tc.lambdaexpressions;

@FunctionalInterface
interface Drawable{
	public void draw();
}
public class WithLambdaExp {

	public static void main(String[] args) {
		int width=15;
		Drawable d2=()->{
			System.out.println("Drawing: "+width);
			
		};
		d2.draw();
	}

}