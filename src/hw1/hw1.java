package hw1;

import java.util.Scanner;


public class hw1{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		
		double x;
		x = input.nextDouble();
		
		System.out.println("f(x) = x^2 = " + x_square.f(x));
		System.out.println("f(x) = sin(x) = " + x_sin.f(x));
		System.out.println("f(x) = cos(x) = " + x_cos.f(x));
		System.out.println("f(x) = tan(x) = " + x_tan.f(x));
		System.out.println("f(x) = cos(x) + 5sin(x) = " + x_cos_5sin.f(x));
		System.out.println("f(x) = 5cos(x) + sin(x) = " + x_5cos_sin.f(x));
		System.out.println("f(x) = log(x) + x^2 = " + x_log_square.f(x));
	}
}



class x_square extends AbstractDrawFunction{
	@Override
	double f(double x){
		return x * x;
	}
}


class x_sin extends AbstractDrawFunction{
	@Override	
	double f(double x){
		return Math.sin(x);
	}	
}


class x_cos extends AbstractDrawFunction{
	@Override	
	double f(double x){
		return Math.cos(x);
	}	
}


class x_tan extends AbstractDrawFunction{
	@Override	
	double f(double x){
		return Math.tan(x);
	}	
}

class x_cos_5sin extends AbstractDrawFunction{
	@Override	
	double f(double x){
		return Math.cos(x) + 5 * Math.sin(x);
	}	
}


class x_5cos_sin extends AbstractDrawFunction{
	@Override	
	double f(double x){
		return 5 * Math.cos(x) + Math.sin(x);
	}		
}


class x_log_square extends AbstractDrawFunction{
	@Override	
	double f(double x){
		return Math.log(x) + x * x;
	}	
}