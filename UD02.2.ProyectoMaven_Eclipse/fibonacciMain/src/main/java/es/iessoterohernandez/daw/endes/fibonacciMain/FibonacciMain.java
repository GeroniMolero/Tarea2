package es.iessoterohernandez.daw.endes.fibonacciMain;

import es.iessoterohernandez.daw.endes.fibonacci.Fibonacci;
import java.util.Scanner;
public class FibonacciMain 
{
	public static void main( String[] args )
    {
		Scanner sca = new Scanner(System.in);
		
		System.out.print("Introduce la longitud deseada para la serie Fibonacci: ");
    	Fibonacci.fibonacci(sca.nextInt());
		
    }
}
