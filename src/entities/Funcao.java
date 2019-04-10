package entities;

public class Funcao {
	
	public double erro = 0.000000001;
	
	
	public Double FuncaoRaiz(Double x) {
		return (x*Math.pow(Math.E, -10*x) - Math.pow(Math.E, -5));
		//return 2*Math.pow(x, 4) + 4*Math.pow(x, 3)  + 3*Math.pow(x, 2) - 10 *x - 15;
		//return Math.pow(x, 49.37) - 493.7;
		//return (Math.cos(50*x + 10) - Math.sin(50*x - 10));
	}
	
	public double Derivada(Double x) {
		return (-10 * Math.pow(Math.E, -10*x)*x + Math.pow(Math.E, -10*x));
		//return  8*Math.pow(x, 3) + 12*Math.pow(x, 2) + 6 * x -10;
		//return Math.pow(x, 49.37 - 1) * 49.37;
		//return (-50*Math.sin(50*x +10) - Math.cos(50*x+10)*50) ;
	}
	
	public Double FuncaoLinear(Double x) {
		return (Math.pow(x, 10) - x - 5);
	}
	
	
}
