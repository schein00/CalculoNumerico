package function;

import entities.Action;
import java.util.ArrayList;

public class GaussJacobi {

    static String directoryName = "Metodo de Jacobi";
    static double[][] matriz;
    static int linhas;
    static int colunas;
    static double precisao;
    static String titulo;
    static ArrayList<String> resultado = new ArrayList<>();

    public static boolean verificaCriterioLinha(double[][] matriz, int linhas, int colunas) {
        boolean criterio = true;
        double diagonal = 0;
        double somaLinha;
        for (int i = 0; i < linhas; i++) {
            somaLinha = 0;
            for (int j = 0; j < colunas; j++) {
                if (i == j) {
                    diagonal = matriz[i][j];
                } else {
                    somaLinha += matriz[i][j];
                }
            }
            if (diagonal < somaLinha) {
                criterio = false;
            }
        }
        return criterio;
    }

    public static boolean verificaCriterioColuna(double[][] matriz, int linhas, int colunas) {
        boolean criterio = true;
        double diagonal = 0;
        double somaColuna;

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (i == j) {
                	diagonal = matriz[i][j];
                    somaColuna = 0;
                   
                    somaColuna = somaColuna(matriz, linhas, colunas, j);

                    if (diagonal <= somaColuna) {
                        criterio = false;
                    }
                }
            }
        }
        return criterio;
    }

    public static double somaColuna(double[][] matriz, int linhas, int colunas, int colunaAtual) {
        double somaColuna = 0;
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (colunaAtual == j && j != i) {
                    somaColuna += matriz[i][j];
                }
            }
        }
        return somaColuna;
    }


    public static double[] calculaJacobi(double[][] matriz, int linhas, int colunas, double[] vetEntrada) {
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
                    double m = (matriz[i][j] * vetEntrada[j]);
                    vetb = vetb - Action.arredonda(m);
                }
            }
            vectorAux[i] = Action.arredonda(vetb / divisor);
        }
        return vectorAux;
    }

    public static double[] calculaVectorInicial(double[][] matriz, int linhas, int colunas, double[] vetEntrada) {
        double[] vectorXo = new double[linhas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (i == j) {
                    vectorXo[i] = vetEntrada[i] / matriz[i][j];
                }
            }
        }
        return vectorXo;
    }

    
    public static double encontraMaiorElemento(double[] vet) {
        double maior = Math.abs(vet[0]);
        for (double d : vet) {
            if (Math.abs(d) > maior) {
                maior = Math.abs(d);
            }
        }
        return maior;
    }

    public static double[] calculaDividendo(double[] vet, double[] vet2, int linhas) {
        double[] vetAux = new double[linhas];
        for (int i = 0; i < vet.length; i++) {
            vetAux[i] = vet2[i] - vet[1];
        }
        return vetAux;
    }

    public static void printVector(double[] vector, String titulo) {
        String t = "\n" + titulo;
        String r;
        resultado.add(t);
        System.out.println("\n" + titulo);

        for (double s : vector) {
            r = "[" + s + "]";
            resultado.add(r);
            System.out.println(r);
        }
    }

    public static void printMatriz(double[][] matriz, int linhas, int colunas, String titulo) {
        String t = "\n" + titulo;
        String r;
        System.out.println(t);
        resultado.add(t);
        for (int i = 0; i < linhas; i++) {
            System.out.println("");
            resultado.add("\n");
            for (int j = 0; j < colunas; j++) {
                r = "[" + Action.arredonda(matriz[i][j]) + "]";
                resultado.add(r);
                System.out.print(r);
            }
        }
    }

}
