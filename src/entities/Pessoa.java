package entities;

import java.util.ArrayList;
import java.util.Date;

public class Artista extends Pessoa {
	private ArrayList<Album> albuns = new ArrayList<Album>();
	private ArrayList<Musica> musicas = new ArrayList<Musica>();
	private int seguidores;
	private String sobre;
	
	
public Artista(String nome,
			   Date dataNascimento,
			   String email,
			   String senha,
			   ArrayList<Album> albuns,
			   ArrayList<Musica> musicas, 
			   int seguidores, 
			   String sobre) {
		super(nome, dataNascimento, email, senha);
		this.albuns = albuns;
		this.musicas = musicas;
		this.seguidores = seguidores;
		this.sobre = sobre;
	}


	
	public void adicionarAlbum(String tituloAlbum, String tituloMusica, String genero) {	
	}
	public void adicionarMusica(String tituloAlbum, String tituloMusica, String genero) {	
	}
	public void deletarAlbum(String tituloAlbum, String tituloMusica, String genero) {	
	}
	public void deletarMusica(String tituloAlbum, String tituloMusica, String genero) {	
	}
	
}