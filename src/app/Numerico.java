package app;

import java.util.Scanner;

import function.Bissecao;
import function.GaussJacobi;
import function.GaussSeidel;
import function.Newton;
import function.Sassenfeld;


public class Numerico {
	public static void main(String []atgs){
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Programa de Calculo Numerico!!");
		
		System.out.println("1 - Calculo de Razes de Funcoes");
		System.out.println("2 - Calculo de funcoes lineares");
		System.out.print("EScolhe uma opção: ");
		
		int m = sc.nextInt();
		
		sc.close();
		
		if(m == 1) {
			Bissecao b = new Bissecao();
			Newton n = new Newton();
			
			b.Calc(0.0 , 2.0);
			n.Calc();
			
		}else{
			GaussJacobi j = new GaussJacobi();
			GaussSeidel g = new GaussSeidel();
			Sassenfeld s = new Sassenfeld();
			
			j.Calc();
			g.Calc();
			s.Calc();
				
		}
		
	}
	
}
