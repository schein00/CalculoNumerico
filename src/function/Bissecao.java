package function;
import entities.Funcao;


public class Bissecao {
	
	public void Calc(Double a, Double b, int t) {
		
		
		if(t >= 3) {
			return;
		}
		
		 if(verificaRaiz(a, b)) {
			 System.out.println("Intervalo a: "+ a + " b: "+ b + "  não possui raiz");
//			 return;
		 }
		
		
		System.out.println("\n===============================");
		System.out.println("Calculo de raizes por bisseção!");
		
		
		boolean stop = true;
		Funcao f = new Funcao();

		int k = 0;

		double MAXA = 0, MAXB = 1000000;
		double aa = a, x = 0, bb = b, xa = a;
	
		
		while(stop){
			k++;
			x = (a + b) / 2;
	//		System.out.println("k: " + k);
	//		System.out.println(" a: "+ a + "    x: "+ x +  "     b: "+ b + "\n");
	//		System.out.println( " f(a): "+ f.FuncaoRaiz(a) +" f(x): "+ f.FuncaoRaiz(x) + " f(b): "+ f.FuncaoRaiz(b) + "\n");
			
			
			 
			
			if(k > 10000) {
				System.out.println("Nao convergiu");
				stop = false;
				continue;
			}
			
			//System.out.println( Math.abs(f.FuncaoRaiz(a) - f.FuncaoRaiz(b)));
			
			if( Math.abs(f.FuncaoRaiz(x) - f.FuncaoRaiz(xa)) < f.erro ){
				
				
				System.out.println("======(Bisseção)======");
				System.out.println("Convergiu!!");
				System.out.println("Numero de interações: " + k);
				System.out.printf("Valor com erro: %.4f\n", f.erro );
				System.out.printf("x : %.8f\n", x);
				System.out.printf("F(x) : %.8f\n", f.FuncaoRaiz(x) );
				System.out.println("====================================");
				stop = false;
				continue;
			}
			
			if(verificaSinal(aa)) {
				if(f.FuncaoRaiz(x) < 0)
					a = x;
				else
					b = x;
			} else {
				if(f.FuncaoRaiz(x) > 0)
					a = x;
				else
					b = x;
			}
		}
		
		xa = x;
		
	}	
	
	static boolean verificaSinal(double a) {
		Funcao f = new Funcao();
		if(f.FuncaoRaiz(a) < 0)
			return true;
		else
			return false;
	}
	

	static boolean verificaRaiz(double a, double b) { //Verifica se o intervalo tem uma raiz
		Funcao f = new Funcao();
		double num = f.FuncaoRaiz(a) * f.FuncaoRaiz(b);
		if(num < 0)
			return true;
		else
			return false;
	}
	
	
}
