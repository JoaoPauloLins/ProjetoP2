import java.util.Scanner;

public class Partida {
	public static void main(String[] args) {
	    @SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
	    int n;

	    Jogador goleiro = new Jogador("Magr�o", 1);
	    Jogador zagueiroD = new Jogador("Ronaldo Alves", 2);
	    Jogador zagueiroE = new Jogador("Durval", 4);
	    
	    System.out.printf("Come�a o jogo!\n");
	    System.out.printf("O goleiro %s est� com a bola!\n",goleiro.getNome());
	    System.out.printf("%s vai tocar a bola para: digite 1 para %s, ou 2 para %s \n", goleiro.getNome(), zagueiroD.getNome(), zagueiroE.getNome());
	    n = ler.nextInt();
	    
	    if (n == 1){
	    	System.out.printf("%s tocou para %s", goleiro.getNome(), zagueiroD.getNome());
	    }
	    if (n == 2){
	    	System.out.printf("%s tocou para %s", goleiro.getNome(), zagueiroE.getNome());
	    }
	  }
}
