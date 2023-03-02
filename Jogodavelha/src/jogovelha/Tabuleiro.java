package jogovelha;

import java.util.Scanner;

public class Tabuleiro {
	private Jogador jogador1;
	private int x;
	private int y;
	
	
	
	
	public void tabuleiro() {
		
		
	}
	
	public int jogadas(String var) {
		
		System.out.println(String.format("Digite as cordenadas da sua jogada %s",var));
		Scanner teclado = new Scanner(System.in);
		teclado.close();
		return teclado.nextInt();
		
		
		
		
	}
	public void jogadas2(){
		x=jogadas("X");
		y=jogadas("Y");
		
	}

	

}
