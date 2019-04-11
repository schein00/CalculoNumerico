package function;

import entities.Action;
import static function.GaussJacobi.encontraMaiorElemento;
import java.util.ArrayList;

public class GaussSeidel {

    static String directoryName = "Metodo de Gaus Seidel";
    static double[][] matriz;
    static int linhas;
    static int colunas;
    static double precisao;
    static String titulo;
    static ArrayList<String> resultado = new ArrayList<>();

    public static double[] isolaX(double[][] matriz, int linhas, int colunas, double[] vetEntrada) {
        double vetb = 0;
        double divisor = 0;
        double[] vectorResultadoSistema = new double[linhas];
        double[] vectorAux = new double[linhas];

        for (int i = 0; i < linhas; i++) {
            vetb = vectorResultadoSistema[i];
            for (int j = 0; j < colunas; j++) {
                if (i == j) {
                    divisor = matriz[i][j];
                } else {
                    double m;
                    if (j < i) {
                        m = (matriz[i][j] * vectorAux[j]);
                    } else {
                        m = (matriz[i][j] * vetEntrada[j]);
                    }
                    vetb = vetb - Action.arredonda(m);
                }
            }
            vectorAux[i] = Action.arredonda(vetb / divisor);
        }
        return vectorAux;
    }

   
    public static boolean verificaCriterioSassenfeld(double[][] matriz, int linhas, int colunas) { 
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
        return encontraMaiorElemento(vectorAux) < 1; 
    }

}