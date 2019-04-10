package function;

import entities.Funcao;

public class Newton {
	
	public void Calc(double x, int t) {
		
		if(t >= 3) {
			return;
		}
		System.out.println("\n=============================");
		System.out.println("Calculo de raizes por Newton!");
		
		int k = 0;
		
		double nx = x; //chute inicial depois de primeira interação é usado para calcular proximo x
		boolean stop = true; 
		Funcao f = new Funcao();
		
		while(stop) {
			x = nx;
			k++;
			
			if(k > 10000) {
				System.out.println("Nao convergiu");
				stop = false;
				continue;
			}
			
			nx = x - (f.FuncaoRaiz(x) / f.Derivada(x));
			
			if((Math.abs(nx - x) / Math.abs(x)) < f.erro) {
				System.out.println("======(Newton)======");
				System.out.println("Convergiu!!");
				System.out.println("Numero de interações: " + k);
				System.out.printf("Valor com erro: %.4f\n", f.erro );
				System.out.printf("x : %.8f\n", nx);
				System.out.printf("F(x) : %.8f\n", f.FuncaoRaiz(nx) );
				System.out.println("====================================");
				stop = false;
				continue;
			}
			
		}
		
	}
	

}
