package br.com.oncast;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Esta classe é responsável pela execução do programa.
 * Ela foi criada de forma a realizar uma implementação
 * básica das funções necessárias ao programa.
 * @author Cássio
 *
 */
public class Main {

	/**
	 * Executa o programa, criando um menu textual e realizando as funções de listar, adicionar elemento à lista e ordenar lista.
	 * @param args
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException {
		int menu;
		String auxiliar;
		int aux;
		ArrayList<Book> books = new ArrayList<Book>();
		Scanner s = new Scanner(System.in);
		System.out.println("Bem vindo ao sistema de ordenamento de livros!\n\n");
		System.out.println("Escolha uma das opções a seguir:\n");
		System.out.println("[1]Mostrar lista.");
		System.out.println("[2]Adicionar elemento.");
		System.out.println("[3]Ordenar lista");
		System.out.println("[4]Sair");
		menu = s.nextInt();
		while(menu != 4){
			switch (menu) {
			case 1:
				for(Book b : books){
					System.out.println("Livro: " + b.getTitle() + " | " + b.getAuthorName() + " | " + b.getEditionYear());
				}
				System.out.println("\nPressione enter para voltar ao menu");
				s.nextLine();
				s.nextLine();
				break;
				
			case 2:
				Book livro = new Book();
				s.nextLine();
				System.out.println("Digite o título do livro:");
				auxiliar = s.nextLine();
				livro.setTitle(auxiliar);
				auxiliar = "";
				System.out.println("Digite o nome do autor do livro:");
				auxiliar = s.nextLine();
				livro.setAuthorName(auxiliar);
				auxiliar = "";
				System.out.println("Digite o ano da edição do livro:");
				aux = s.nextInt();
				livro.setEditionYear(aux);
				aux = 0;
				books.add(livro);
				break;
				
			case 3:
				Sort ordenador = new Sort(new ConfigManager().carregarConfig());
				ordenador.order(books);
				System.out.println("\nLista provavelmente ordenada com sucesso.");
				break;

			default:
				break;
			}
			System.out.println("\n\n\n");
			System.out.println("Escolha uma das opções a seguir:\n");
			System.out.println("[1]Mostrar lista.");
			System.out.println("[2]Adicionar elemento.");
			System.out.println("[3]Ordenar lista");
			System.out.println("[4]Sair");
			menu = s.nextInt();
			
		}
		s.close();
	}

}
