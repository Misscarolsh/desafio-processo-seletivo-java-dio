import java.util.Scanner;

public class Contador {
	
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		try {
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException Exception) {
			System.out.println("O segundo parametro deve ser maior que o primeiro");
        }
           terminal.close();



		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();

            
        }
		int contagem = parametroDois - parametroUm;
        for(int i = 1; i <= contagem; i++) {
        System.out.println("Imprimindo o numero" + i);
	}
}
}

//Não esquecer: Estudar mais sobre o assunto;
//Treinar mais;
//Não desistir,mesmo estando com dificuldade;