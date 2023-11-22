package entities;

import java.util.ArrayList;

public class Spotify {
	private  ArrayList<Usuario> usuarios;
	private  ArrayList<Artista> artistas;
	private  ArrayList<Musica> musicas;
	private  ArrayList<Playlist> playlists;
	private  ArrayList<Album> albuns;
	
	public Spotify (
			ArrayList<Usuario> usuarios,
			ArrayList<Artista> artistas,
			ArrayList<Musica> musicas,
			ArrayList<Playlist> playlists,
			ArrayList<Album> albuns){
		this.usuarios = new ArrayList<>(); 
	}
	
	public void cadastrarPessoa(String nome,String dataNascimento, String email, String senha) {	
	}
	public void deletarPessoa(String nome) {	
	}
	public void editarPessoa(String nome,String dataNascimento, String email, String senha) {	
	}
	public ArrayList<Usuario> getUsuario(){
		return usuarios;
	}
	public ArrayList<Artista> getArtista(){
		return artistas;
	}
	public ArrayList<Musica> getMusica(){
		return musicas;
	}
	public ArrayList<Playlist> getPlaylist(){
		return playlists;
	}
	public ArrayList<Album> getAlbum(){
		return albuns;
	}
	public ArrayList<Musica> pesquisaMusica() {
        return musicas;
    }	
	public ArrayList<Artista> pesquisaArtistas(){
		return artistas;
	}
	public ArrayList<Album> pesquisaAlbuns(){
		return albuns;
	}
	public ArrayList<Playlist> pesquisaPlaylists(){
		return playlists;
	}
}