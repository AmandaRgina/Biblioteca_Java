package br.com.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

import br.com.biblioteca.entidades.Livro;
import br.com.biblioteca.entidades.Obra;
import br.com.biblioteca.entidades.Revista;
import br.com.biblioteca.entidades.Usuario;

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
		adicionaItensBiblioteca(biblioteca);
		Long id;
		String retorno;
		
		while (true) {
			exibeMenu("********** Sistema de Gestao da Biblioteca **********");
			int opcao = obtemOpcaoMenu(sc, 1,10);
			switch (opcao) {
			case 1:
				// Listar todos os livros
				
				 biblioteca.imprimeLivros(null);
				break;
			case 2:
				// Listar todas as revistas
				
				biblioteca.imprimeRevistas(null);
				break;
			case 3:
				// Listar todos os usuarios
				
				biblioteca.imprimeUsuarios(null);
				break;
			case 4:
				
				// Consultar livros ou revistas por titulo
				
				System.out.println("Digite o título desejado: ");
				
				String titulo = sc.nextLine();
		
				ArrayList<Livro> listaPorTitulos = biblioteca.pesquisaLivros(titulo);
				
				if(listaPorTitulos == null || listaPorTitulos.isEmpty()) {
					
					System.out.println("Não foram encontrados livros com esse título");
				}
				
				else {
					
					biblioteca.imprimeLivros(listaPorTitulos);
				}
				break;
			case 5:
				// Consultar usuarios por e-mail
				
				System.out.println("Digite o e-mail do usuário desejado: ");
				String email = sc.nextLine();
				
				ArrayList<Usuario> listaPorUsuario = biblioteca.pesquisaUsuario(email);
				
				if(listaPorUsuario == null || listaPorUsuario.isEmpty()) {
					
					System.out.println("Não foram encontrados usuários com esse e-mail");
				}
				
				else {
					biblioteca.imprimeUsuarios(listaPorUsuario);
				}
			
				break;
			case 6:
				// Consultar todos os emprestimos
				
				biblioteca.imprimeEmprestimos(null);
				
				break;
			case 7:
				// Consultar se um livro ou revista esta emprestado
				
				System.out.println("Digite o id da obra: ");
				id = sc.nextLong();
				sc.nextLine();
				
				Boolean obraEmprestada = biblioteca.obraEmprestada(id);
				
				if(obraEmprestada.booleanValue()) {
					
					System.out.println("Obra emprestada");
				}
				
				else {
					
					System.out.println("Obra não emprestada");
				}
				
				break;
				
			case 8:
				// Emprestar um livro ou revista para um usuario
				
				
				System.out.println("Digite o id da obra: ");
				id = sc.nextLong();
				sc.nextLine();
				System.out.println("Digite o cpf: ");
				String cpf = sc.nextLine();
				
				retorno = biblioteca.emprestar(id,cpf);
				System.out.println(retorno);
				
				
				break;
			case 9:
				// Devolver um livro ou revista para a biblioteca
				
				System.out.println("Digite o id da obra: ");
				id = sc.nextLong();
				sc.nextLine();
				
				retorno = biblioteca.devolver(id);
				System.out.println(retorno);
				
				
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
    
    private static void adicionaItensBiblioteca(Biblioteca biblioteca) {
    	
    	Livro livro1 = new Livro(1l,"Hoje", "Ediouro", 2010, 10, "Fantasia","162737", "José de Alencar");
    	biblioteca.addLivro(livro1);
    	Livro livro2 = new Livro(2l,"Amanhã", "Ediouro", 2014, 5, "Fantasia","167575", "José de Alencar");
    	biblioteca.addLivro(livro2);
    	Livro livro3 = new Livro(3l,"Ontem", "Vale", 2016, 6, "Ficção", "123457", "José de Alencar");
    	biblioteca.addLivro(livro3);
    	
    	Revista revista1 = new Revista(4l,"Lugar de Paz", "Veja", 2020, 4, "Variedades", 26364774);
    	biblioteca.addRevista(revista1);
    	Revista revista2 = new Revista(5l,"Viver bem", "Super Interessante", 2013, 2, "Variedades", 263678);
    	biblioteca.addRevista(revista2);
    	Revista revista3 = new Revista(6l,"Bem-estar", "Viva Feliz", 2016, 4, "Variedades", 354658);
    	biblioteca.addRevista(revista3);
    	
    	Usuario usuario1 = new Usuario("Maria", "12345678912", "maria@gmail.com");
    	biblioteca.add(usuario1);
    	Usuario usuario2 = new Usuario("Joana", "12345465912", "joana@gmail.com");
    	biblioteca.add(usuario2);
    	Usuario usuario3 = new Usuario("José", "7465768686", "jose@gmail.com");
    	biblioteca.add(usuario3);
    	
    }
}
