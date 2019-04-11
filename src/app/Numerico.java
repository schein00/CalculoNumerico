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
			
			b.Calc(-10.0 , 10.0, 0);
			n.Calc(1.0, 0);
			
		}else{
			GaussJacobi j = new GaussJacobi();
			GaussSeidel g = new GaussSeidel();
			Sassenfeld s = new Sassenfeld();
			
		//	j.Calc();
		//	g.Calc();
			
			double ma [][] = {{ 4, 1,-1, 0, 0, 0, 0, 0},
					 { 1, 6,-2, 1,-1, 0, 0, 0},
					 { 0, 1, 5, 0,-1, 0, 0, 0},
					 { 0, 2, 0, 5,-1, 1,-1,-1},
					 { 0, 0,-1,-1, 6, 0, 0,-1},
					 { 0, 0,-1, 0,-1,-1, 0, 0},
					 { 0, 0, 0,-1, 0, 5, 4,-1},
					 { 0, 0, 0,-1,-1, 0,-1, 5}};
			int l = 8, c = 8;
			
			
			boolean ss =  s.Calc(ma, l,c);
			if(ss) {
				System.out.println("converge");
			}else {
				System.out.println("Não converge2");
			}
				
		}
		
	}
	
}
