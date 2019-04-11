package function;
import static function.GaussJacobi.encontraMaiorElemento;

public class Sassenfeld {

		
		
		 public boolean Calc(double[][] matriz, int linhas, int colunas) {
		        
			 System.out.println("\n=================================");
				System.out.println("Calculo de raizes por Sassenfeld!");
			 
			 
		        double divisor = 0;
		        double somaColuna;
		        double[] vectorAux = new double[linhas];

		        for (int i = 0; i < linhas; i++) {
		            somaColuna = 0;
		            for (int j = 0; j < colunas; j++) {
		                if (i == j) {
		                    divisor = matriz[i][j];
		                } else if (j > i) {

		                    double nun = matriz[i][j];
		                    somaColuna = somaColuna + nun;

		                } else if (j < i) {

		                    double nun = matriz[i][j] * vectorAux[j];
		                    somaColuna = somaColuna + nun;
		                }
		            }
		            
		            vectorAux[i] = somaColuna / divisor;
		        }

		        /*verifica se o maior beta é menor que 1 caso seja verdadeiro a função converge*/
		        return encontraMaiorElemento(vectorAux) < 1;
		        
		    }
		
}
