import java.util.Random;
import java.util.Scanner;

public class projetoFinal {
public static void main (String[] args) {
		
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		
		int dificuldade;
		int numeroAleatorio = 0;
		int chances = 3;
		int tentativa;
		int numeroMaximo = 0;
		
		System.out.println("===================");
		System.out.println("Jogo da Adivinhação");
		System.out.println("===================");
		System.out.println("Selecione o nível de dificuldade do jogo:");
		System.out.println("0 - Fácil - Você deve acertar um número aleatório entre 0 e 9.");
		System.out.println("1 - Médio - Você deve acertar um número aleatório entre 0 e 49.");
		System.out.println("2 - Difícil - Você deve acertar um número aleatório entre 0 e 99.");
		dificuldade = scan.nextInt();
		
		while(dificuldade < 0 || dificuldade > 3) {
		
			System.out.println("Selecione o nível de dificuldade do jogo:");
			System.out.println("0 - Fácil - Você deve acertar um número aleatório entre 0 e 9.");
			System.out.println("1 - Médio - Você deve acertar um número aleatório entre 0 e 49.");
			System.out.println("2 - Difícil - Você deve acertar um número aleatório entre 0 e 99.");
			dificuldade = scan.nextInt();
			
		}
		
		switch(dificuldade) {
		case 0: 
			numeroAleatorio = random.nextInt(10);
			numeroMaximo = 9;
			break;
		case 1:
			numeroAleatorio = random.nextInt(50);
			numeroMaximo = 49;
			break;
		case 2:
			numeroAleatorio = random.nextInt(100);
			numeroMaximo = 99;
			break;
		}
		
		while(chances > 0) {
			System.out.println("Adivinhe o número: ");
			tentativa = scan.nextInt();
			if(tentativa < 0 || tentativa > numeroMaximo) {
				System.out.println("Número inválido. Tente novamente.");
			} else {
				if(tentativa == numeroAleatorio) {
					System.out.println("Você venceu!");
					return;
				} else if(tentativa > numeroAleatorio) {
					System.out.println("O número secreto é menor do que " + tentativa);
					chances--;
					System.out.println("Você ainda tem " + chances + " chances.");
				} else {
					System.out.println("O número secreto é maior do que " + tentativa);
					chances--;
					System.out.println("Você ainda tem " + chances + " chances.");
				}
			}
			if(chances == 0) {
				System.out.println("Você perdeu. O número secreto era: " + numeroAleatorio);
			}
				
		}
		
		scan.close();
		
	}

}
