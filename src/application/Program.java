package application;

import java.util.*;
import entities.*;

public class Program {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		int op = -1;
		int aux;
		
	//Pega de dados preencidos(Spotify) 
	//d.preencherDados();


		while(op != 0) {
			System.out.print(imprimiMenu());
			op = sc.nextInt();
			 switch (op) {
			 	case 0:
			 		System.out.println("Obrigada por utilizar o melhor aplicativo de musica da UnB. Ate logo!");
			 		break;
			 	case 1:
			 		entrarUsuario();
			 		break;
			 	case 2:
			 		entrarArtista();
			 		break;
				case 3:
					cadastrarUsuario();
					break;
				case 4:
					removerUsuario();
					break;
				case 5: 
					System.out.println("Escolha um dos usuarios a seguir para editar as informacoes:\n");
					listarUsuarios();//listarAlunos();
					aux = sc.nextInt();
					Usuario u = lerDadosUsuarios();//Aluno a = lerDadosAluno();
					editar(aux, u);
					break;
				case 6: 
					listarUsuarios();
					break;
				case 7:
					cadastrarArtista();
					break;
				case 8:
					removerArtista();
					break;
				case 9: 
					System.out.println("Escolha um dos Artista a seguir para editar as informacoes:\n");
					listarArtistas();
					aux = sc.nextInt();
					Artista a = lerDadosArtista();
					editar(aux, a);
					break;
				case 10: 
					listarArtista();
					break;
				default:
					System.out.println("\nOpcao Invalida!\n");
					break;
			 }
		}
//		in.close();
	}
	public static String imprimiMenu() {
		String saida = new String("Escolha uma das opvoes a seguir:\n");
		
		saida = saida + "00 - Sair da aplicacao\n";
		saida = saida + "---------------------------------\n";
		saida = saida + "01 - Entrar como usuario\n";
		saida = saida + "02 - Entrar como artista\n";
		saida = saida + "---------------------------------\n";
		saida = saida + "03 - Cadastrar novo usuario\n";
		saida = saida + "04 - Remover usuario existente\n";
		saida = saida + "05 - Editar usuario existente\n";
		saida = saida + "06 - Listar usuarios\n";
		saida = saida + "---------------------------------\n";
		saida = saida + "07 - Cadastrar novo artista\n";
		saida = saida + "08 - Remover artista existente\n";
		saida = saida + "09 - Editar artista existente\n";
		saida = saida + "10 - Listar artistas\n";
		saida = saida + "---------------------------------\n";
		return saida;
	}
	public static boolean cadastrarUsuario() {
		Usuario u = lerDadosUsuario();
		if(d.getnUsuarios() < 100) {
			//esse d. vem da função do inicio da main
			d.setUsuario(d.getnUsuario(), u);
			d.setnUsuario(d.getnUsuarios()+1);
			System.out.println("Usuario cadastrado com sucesso!\n");
			return true;
		} else {
			System.out.println("Não foi possivel cadastrar o usuario!\n");
			return false;
		}
	}
	
	public static Usuario lerDadosUsuario() {
		String nome;
		String dtNascimento; 
		String email; 
		String senha; 

		sc.nextLine(); //esvazia dados do teclado
		System.out.println("Digite o nome do Usuario: ");
		nome = sc.nextLine();
		System.out.println("Digite a data de nascimento do usuario:");
		dtNascimento = sc.nextLine();
		System.out.println("Digite o email do usuario:");
		email = sc.nextLine();
		System.out.println("Digite o senha do usuario:");
		senha = sc.nextLine();
		Usuario a = new Usuario(nome, dtNascimento, email, senha);
		return a;	
	}
	
	public static void removerAluno() {
		System.out.println("Escolha um dos alunos a seguir para ser removido:\n");
		listarProfessores();
		int i = in.nextInt();
		if(i < d.getnAlunos() && i > 0) {
			swapListaAlunos(i);
			d.setAluno(d.getnAlunos(), null);
			d.setnAlunos(d.getnAlunos() - 1);
			System.out.println("Aluno removido com sucesso");
		} else {
			System.out.println("Voce escolheu um numero invalido!");
		}
		
	
	
	
}