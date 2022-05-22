package ex1;

import java.util.Scanner;

public class votacao 
{

	public static void main (String[]args) 
	{
		Scanner ler = new Scanner(System.in); //criando o metodo scanner 
		int PT = 0,PDT = 0,PL = 0,PSDB = 0,nulo = 0,branco = 0; //variaves dos partidos que vão recebe o valor da votação
		
		for(int i = 0; i<=50; i++)  //loop for pronto para repetir 50x
		{
			int escolha ; //variavel que vai receber o numero dos conditados 
			  System.out.println("escolha o numero de seu candidato ou nulo ou branco "); 
			  escolha = ler.nextInt(); //recebendo o numero dos candidatos
			
			// apos receber o numero dos canditados vai fazer a comparação e atribuir valor aos partidos  
			switch(escolha) 
			{	
				case 0:
					branco++;
					break;
				case 1:
					nulo++;
					break;
				case 12:
					PDT++;
					break;	
				case 13:
					PT++;
					break;
				case 22:
					PL++;
					break;
				case 45:
					PSDB++;
					break;
			}
		}	
			// print do resultado final das votações 
			System.out.println("O PT teve um total de:"+ PT +"votos");
			System.out.println("O PL teve um total de:"+ PL +"votos");
			System.out.println("O PSDB teve um total de:"+ PSDB +"votos");
			System.out.println("O PDT teve um total de:"+ PDT +"votos");
			System.out.println("O total de votos nulos foi de:" + nulo);
			System.out.println("O total de votos branco foi de:" + branco);
	}
}
