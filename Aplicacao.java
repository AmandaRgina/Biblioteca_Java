package br.com.biblioteca;

import java.util.Scanner;

public class Aplicacao {

	/**
	 * Executa o sistema de gestao de biblioteca.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// TODO - Deve ser usada para invocar todos os metodos conforme as opcoes do menu.
		Biblioteca biblioteca = new Biblioteca();
				
		while (true) {
			exibeMenu("********** Sistema de Gestao da Biblioteca **********");
			int opcao = obtemOpcaoMenu(sc, 1,10);
			switch (opcao) {
			case 1:
				// Listar todos os livros
				break;
			case 2:
				// Listar todas as revistas
				break;
			case 3:
				// Listar todos os usuarios
				break;
			case 4:
				// Consultar livros ou revistas por titulo
				break;
			case 5:
				// Consultar usuarios por e-mail
				break;
			case 6:
				// Consultar todos os emprestimos
				break;
			case 7:
				// Consultar se um livro ou revista esta emprestado
				break;
			case 8:
				// Emprestar um livro ou revista para um usuario
				break;
			case 9:
				// Devolver um livro ou revista para a biblioteca
				break;
			case 10:
				// Sair
				System.out.println("Encerrando a aplicacao ...");
				sc.close();
				System.exit(0);
				break;
			default:
				System.out.println("Opcao invalida. Digite uma opcao entre 1 e 10.");
			}
			System.out.println("Pressione alguma tecla para continuar ...");
			sc.nextLine();
		}
	}
	
	/**
     * Exibe o menu de funcionlidades do programa.
     * 
     * @param cabecalho Cabeçalho do programa. 
     */
    private static void exibeMenu(String cabecalho) {
        String[] opcoes = new String[] {
        		"Listar todos os livros", 
        		"Listar todas as revistas", 
        		"Listar todos os usuarios", 
        		"Consultar livros ou revistas por titulo", 
        		"Consultar usuarios por e-mail",
        		"Consultar todos os emprestimos",
        		"Consultar se um livro ou revista esta emprestado",
        		"Emprestar um livro ou revista para um usuario",
        		"Devolver um livro ou revista para a biblioteca",
        		"Sair"};
        Menu menu = new Menu(opcoes);
        System.out.println(menu.exibeMenu(cabecalho));
    }
    
    /**
     * Obtem a opcao escolhida pelo usuario.
     * 
     * @param inicio das opcoes de escolhas, deve ser maior que 0 (zero).
     * @param fim das opcoes de escolhas, tambem deve ser maior que 0 (zero).
     * 
     * @return Opcao escolhida pelo usuario.
     */
    private static int obtemOpcaoMenu(Scanner sc, int inicio, int fim) {
		int opcao = 0;
		System.out.println("");
		System.out.println("Informe o numero da opcao desejada: ");
		while (sc.hasNextLine()) {
			try {
				opcao = Integer.parseInt(sc.nextLine());
				if (opcao < inicio || opcao > fim) {
					throw new Exception();
				}
				return opcao;
			} catch (Exception e) {
				System.out.println(String.format("Opcao invalida. Digite uma opcao entre %d e %d.",
						inicio, fim));
			}
		}
		return opcao;
	}
}
