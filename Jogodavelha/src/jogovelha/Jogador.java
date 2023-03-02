package jogovelha;



public class Jogador {
	
	private String [][] jogadas = new String[2][2];

	/**
	 * @return the jogadas
	 */
	public String[][] getJogadas() {
		return jogadas;
	}

	/**
	 * @param jogadas the jogadas to set
	 */
	public void setJogadas(int x , int y) {
		this.jogadas[x][y] = "X" ;
		
	}
	
	
	

}
