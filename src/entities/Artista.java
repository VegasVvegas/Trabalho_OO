package entities;
import java.util.ArrayList;
import java.util.Date;
public class Artista extends Pessoa {
	private String albuns;
	private String musicas;
	private String seguidores;
	private String sobre;
	
	
public Artista(String nome,
	   	       String dataNascimento,
	           String email,
	           String senha,
	           String albuns,
	           String musicas,
	           String seguidores,
	           String sobre) {
		super(nome, dataNascimento, email, senha);
		this.albuns = albuns;
		this.musicas = musicas;
		this.seguidores = seguidores;
		this.sobre = sobre;

	}

public String getSeguidores() {
	return seguidores;
}
public void setSeguidores(String seguidores) {
	this.seguidores = seguidores;
}
public String getSobre() {
	return sobre;
}
public void setSobre(String sobre) {
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
