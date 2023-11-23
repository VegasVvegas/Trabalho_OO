package application;

import java.util.*;
import entities.*;

public class Program {
	private static Spotify d = new Spotify();
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		int op = -1;
		int aux;
		
	//Pega de dados preencidos(Spotify) 
	d.preencherDados();
		

		while(op != 0) {
			System.out.print(imprimiMenu());
			op = sc.nextInt();
			 switch (op) {
			 	case 0:
			 		System.out.println("Obrigada por utilizar o melhor aplicativo de musica da UnB. Ate logo!");
			 		break;
			 	case 1:
			 		System.out.println("Escolha seu usuario:\n");
			 		listarUsuarios();
			 		aux = sc.nextInt();
			 		entrarUsuario(aux);
			 		
			 		break;
			 	case 2:
			 		System.out.println("Escolha seu usuario:\n");
			 		listarArtistas();
			 		aux = sc.nextInt();
			 		entrarArtista(aux);
			 		
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
					Usuario u = lerDadosUsuario();//Aluno a = lerDadosAluno();
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
					listarArtistas();
					break;
				default:
					System.out.println("\nOpcao Invalida!\n");
					break;
			 }
		}
		sc.close();
	}
	public static String imprimiMenu() {
		String saida = new String("Escolha uma das opcoes a seguir:\n");
		
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
		saida = saida + "\n";
		return saida;
	}
	public static boolean cadastrarUsuario() {
		Usuario u = lerDadosUsuario();
		if(d.getnUsuarios() < 100) {
			//esse d. vem da função do inicio da main
			d.setUsuario(d.getnUsuarios(), u);
			d.setnUsuarios(d.getnUsuarios()+1);
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
	
	public static void removerUsuario() {
		System.out.println("Escolha um dos usuarios a seguir para ser removido:\n");
		listarUsuarios();
		int i = sc.nextInt();
		if(i < d.getnUsuarios() && i > 0) {
			swapListaUsuarios(i);
			d.setUsuario(d.getnUsuarios(), null);
			d.setnUsuarios(d.getnUsuarios() - 1);
			System.out.println("Aluno removido com sucesso");
		} else {
			System.out.println("Voce escolheu um numero invalido!");
		}
	}
	
	public static void swapListaUsuarios(int x) {
		for(int i = x; i < d.getnUsuarios() - 1; i++) 
			d.setUsuario(i, d.getnUsuario(i+1));
	}
	
	public static void editar(int i, Usuario a) {
		if(i < d.getnUsuarios() && i >= 0) {
			d.setUsuario(i, a);
			System.out.println("Dados editados com sucesso");
		} else {
			System.out.println("Voce escolheu um numero invalido!");
		}
	}
	public static void listarUsuarios() {
		sc.nextLine(); //esvazia dados do teclado
		for(int i = 0; i < d.getnUsuarios(); i++) 
			System.out.println(i + " -> " + d.getUsuarios()[i].getNome());
		/* Descomente a linha a seguir para ver a listagem dos alunos em interface gráfica
		 * new TelaListagem(d.getNomeAlunos());
		 */
	}
	
	public static void entrarUsuario(int i) {
		if(i < d.getnUsuarios() && i >= 0) {
			d.getnUsuario(i);
			System.out.println("Dados editados com sucesso");
		} else {
			System.out.println("Voce escolheu um numero invalido!");
		}
	}
	
	public static boolean cadastrarArtista() {
		Artista p = lerDadosArtista();
		if(d.getnArtistas() < 100) {
			d.setnArtistas(d.getnArtistas(), p);
			d.setnArtistas(d.getnArtistas() + 1);
			System.out.println("Professor cadastrado com sucesso!\n");
			return true;
		} else {
			System.out.println("Não foi possivel cadastrar o Professor!\n");
			return false;
		}
	}
	public static Artista lerDadosArtista() {
		String nome;
		String dtNascimento; 
		String email; 
		String senha; 

		
		sc.nextLine(); //esvazia dados do teclado
		System.out.println("Digite o nome do artista: ");
		nome = sc.nextLine();
		System.out.println("Digite a data de nascimento do usuario:");
		dtNascimento = sc.nextLine();
		System.out.println("Digite o email do usuario:");
		email = sc.nextLine();
		System.out.println("Digite o senha do usuario:");
		senha = sc.nextLine();
		Artista a = new Artista(nome, dtNascimento, email, senha, senha, senha, senha, senha);
		return a;	
	}
	
	public static void removerArtista() {
		System.out.println("Escolha um dos artista a seguir para ser removido:\n");
		listarArtistas();
		int i = sc.nextInt();
		if(i < d.getnArtistas() && i > 0) {
			swapListaArtistas(i);
			d.setnArtistas(d.getnArtistas() - 1, null);
			System.out.println("Artista removido com sucesso");
		} else {
			System.out.println("Voce escolheu um numero invalido!");
		}
	}
	public static void swapListaArtistas(int p) {
		for(int i = p; i < d.getnArtistas() - 1; i++) 
			d.setnArtistas(i, d.getnArtista(i+1));
	}
	
	public static void editar(int i, Artista p) {
		if(i < d.getnArtistas() && i >= 0) {
			d.setnArtistas(i, p);
			System.out.println("Dados editados com sucesso");
		} else {
			System.out.println("Voce escolheu um numero invalido!");
		}
	}
	
	public static void listarArtistas() {
		for(int i = 0; i < d.getnArtistas(); i++) 
			System.out.println(i + " -> " + d.getNomeArtistas()[i].toString());
		/* Descomente a linha a seguir para ver a listagem dos professores em interface gráfica
		 * new TelaListagem(d.getNomeProfessores());
		 */
	}
	
	public static void entrarArtista(int i) {
		if(i < d.getnArtistas() && i >= 0) {
			d.getnArtista(i);
			System.out.println("Dados editados com sucesso");
			
		} else {
			System.out.println("Voce escolheu um numero invalido!");
		}
	}
}