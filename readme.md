Avalia��o de Calculo numerico

Nome: Jeferson Auguso Schein 
Matricula: 1311100028

quest�o 1
	1311100028 mod 5 = 3 + 7 = 10//
	
Quest�o 2
	-> Metodo da Bisse��o n�o convergiu em nenhum dos testes para esse problema 
	-> Metodo de Newton, quando consegue uma boa aproxima��o encontra apenas 1 raiz mesmo com valores distintos de passo inicial
		-> Raiz: 0.007244
		->N intera��es: 166
		->Passo Inicial: 1

Quest�o 3
Bisse��o

	-> intervalo inicial [-100, 100]
		-> nao convergiu no numero maximo de intera��es
	->intervalo [0 , 2]
		-> convergiu para -> 1.133852
		-> numero de intera��es: 46
	
Newton

	-> Chute inicial 2
		Convergiu para -> 1.133852
		numero de intera��es: 33
		

Quest�o 4
		
		fazendo o incremento dos intervalos e do ponto inicial de newton cheguei aos seguintes valores
		
		raiz 1: 			bisse��o	- newton
			aproxima��o 	0,015707	- 0.015707
			intera��es		34			- 49
			intervalo		[0.0 a 0.1] - 0.0
			
		raiz 2: 			bisse��o	- newton
			aproxima��o 	0.141371	- 0.141371
			intera��es		34			- 44
			intervalo		[0.1 a 0.2] - 0.15
			
		raiz 3: 			bisse��o	- newton
			aproxima��o 	0.204203	- 0.204203
			intera��es		34			- 41
			intervalo		[0.2 a 0.3] - 0.2
			
			

Quest�o 5:
		Todas as matrizes foram computadas pelo algoritmo de Sassenfeld, dizendo se converge ou n�o utilizando Gauss-Seidel
		
		O Algoritmo nada mais faz, do que descobrir se a diagonal principal � dominante ou n�o, se ela for dominante a matriz aplicada a Gauss-Seidel converge
		
		a) Converge
		b) Converge
		c) nao converge

Quest�o 6:
		Aplicando as matrizes tanto no algoritmo de Gauss-Seidel e Gauss-Jacobi
		
		Ax = b
			Jacobi n�o convergiu
			Seidel -> 
				x1 = 1,25 
				x2 = -0,75
				x3 = -2,75
				Num Intera��es: 8
				
		Dx = b
			jacobi nao convergiu
			como testado na quest�o anterior seidel nao converge para esse sistema linear
		

Quest�o 7:
			
		
		
		
		
		