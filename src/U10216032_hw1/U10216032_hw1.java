package U10216032_hw1;

import java.util.Scanner;

public class U10216032_hw1{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		
		// allow user to input x to get f(x)
		double x;
		x = input.nextDouble();

		x_square get_a = new x_square();
		x_sin get_b = new x_sin();
		x_cos get_c = new x_cos();		
		x_tan get_d = new x_tan();		
		x_cos_5sin get_e = new x_cos_5sin();		
		x_5cos_sin get_f = new x_5cos_sin();
		x_log_square get_g = new x_log_square();
		
		// show f(x)
		System.out.println ( "f(x) = x ^ 2 = " + get_a.f(x) );
		System.out.println ( "f(x) = sin(x) = " + get_b.f(x) );
		System.out.println ( "f(x) = cos(x) = " + get_c.f(x) );
		System.out.println ( "f(x) = tan(x) = " + get_d.f(x) );		
		System.out.println ( "f(x) = cos(x) + 5sin(x) = " + get_e.f(x) );
		System.out.println ( "f(x) = 5cos(x) + sin(x) = " + get_f.f(x) );
		System.out.println ( "f(x) = log(x) + x ^ 2 = " + get_g.f(x) );		
	}
}


// override method in abstract class AbstractDrawFunction to calculate f(x)
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


