package repeticaoWhile;

import java.util.Scanner;

public class MainWhile {

	public static void main(String[] args) {
		/*
		Estrutura repetitiva Enquanto(While),� uma estrutura de controle que repete um bloco de comandos
		enquanto uma condi��o for verdadeira.Quando usar: quando n�o se sabe previamente a quantidade
		de repeti��es que ser� realizada.
		
		1�Exemplowhile (condicao) {   2�Exemplo  
			comando 1                V:executa e volta
			comando 2                F:pula fora       
		}*/
		
		Scanner sc = new Scanner(System.in);
		
		int x =sc.nextInt();
		
		
		int soma=0;
		while ( x != 0) { //Enquanto x for diferente de zero execulta e volta,caso colocar zero ele pula
			soma =soma + x;
			x = sc.nextInt();
		}
		
		System.out.println("A soma � " + soma);
		
		
		sc.close();
		
		
		
		

	}

}
