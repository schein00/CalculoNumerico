Avaliação de Calculo numerico

Nome: Jeferson Auguso Schein 
Matricula: 1311100028

questão 1
	1311100028 mod 5 = 3 + 7 = 10//
	
Questão 2
	-> Metodo da Bisseção não convergiu em nenhum dos testes para esse problema 
	-> Metodo de Newton, quando consegue uma boa aproximação encontra apenas 1 raiz mesmo com valores distintos de passo inicial
		-> Raiz: 0.007244
		->N interações: 166
		->Passo Inicial: 1

Questão 3
Bisseção

	-> intervalo inicial [-100, 100]
		-> nao convergiu no numero maximo de interações
	->intervalo [0 , 2]
		-> convergiu para -> 1.133852
		-> numero de interações: 46
	
Newton

	-> Chute inicial 2
		Convergiu para -> 1.133852
		numero de interações: 33
		

Questão 4
		
		fazendo o incremento dos intervalos e do ponto inicial de newton cheguei aos seguintes valores
		
		raiz 1: 			bisseção	- newton
			aproximação 	0,015707	- 0.015707
			interações		34			- 49
			intervalo		[0.0 a 0.1] - 0.0
			
		raiz 2: 			bisseção	- newton
			aproximação 	0.141371	- 0.141371
			interações		34			- 44
			intervalo		[0.1 a 0.2] - 0.15
			
		raiz 3: 			bisseção	- newton
			aproximação 	0.204203	- 0.204203
			interações		34			- 41
			intervalo		[0.2 a 0.3] - 0.2
			
			

Questão 5:
		Todas as matrizes foram computadas pelo algoritmo de Sassenfeld, dizendo se converge ou não utilizando Gauss-Seidel
		
		O Algoritmo nada mais faz, do que descobrir se a diagonal principal é dominante ou não, se ela for dominante a matriz aplicada a Gauss-Seidel converge
		
		a) Converge
		b) Converge
		c) nao converge

Questão 6:
		Aplicando as matrizes tanto no algoritmo de Gauss-Seidel e Gauss-Jacobi
		
		Ax = b
			Jacobi não convergiu
			Seidel -> 
				x1 = 1,25 
				x2 = -0,75
				x3 = -2,75
				Num Interações: 8
				
		Dx = b
			jacobi nao convergiu
			como testado na questão anterior seidel nao converge para esse sistema linear
		

Questão 7:
			
		
		
		
		
		