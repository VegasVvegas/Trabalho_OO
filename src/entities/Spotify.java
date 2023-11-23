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






package Spotify;

public class Spotify {
	private Usuario[] usuario;
	private int nUsuarios = 0;
	private Artista[] artistas ;
	private int nArtistas = 0;
	private Musica[] musicas;
	private int nMusicas = 0;
	private Playlist[] playlist;
	private int nPlaylist = 0;
	private Album [] albuns;
	private int nAlbuns = 0;
	
	public Spotify() {
		usuario = new Usuario[100];
		artistas = new Artista[50];
		musicas = new Musica[50];
		playlist = new Playlist[50];
		albuns = new Album[100];

	}
	
	
	public Usuario[] getUsuarios() {
		return usuario;
	}
	
	public Usuario getnUsuario(int i) {
		return usuario[i];
	}

	public String[] getNomeUsuarios() {
		String[] s = new String[nUsuarios];
		for(int i = 0; i < nUsuarios; i++) {
			s[i] = usuario[i].getNome();
		}
		return s;
	}
	
	public void setUsuarios(Usuario[] usuario) {
		this.usuario = usuario;
	}
	
	public void setUsuario(int i, Usuario r) {
		usuario[i] = r;
	}

	public int getnUsuarios() {
		return nUsuarios;
	}

	public void setnUsuarios(int nUsuarios) {
		this.nUsuarios = nUsuarios;
	}

	public Artista[] getnArtistas() {
		return artistas;
	}
	
	public Artista getnArtistas(int i) {
		return artistas[i];
	}

	public String[] getNomeArtistas() {
		String[] s = new String[nArtistas];
		for(int i = 0; i < nArtistas; i++) {
			s[i] = artistas[i].getNome();
		}
		return s;
	}


	public void setnArtistas(Artista[] artistas) {
		this.artistas = artistas;
	}
	
	public void setnArtistas(int i, Artista a) {
		artistas[i] = a;
	}

	public int getnArtistas() {
		return nArtistas;
	}



	public void setnArtistas(int nArtistas) {
		this.nArtistas = nArtistas;
	}

	public Musica[] getMusica() {
		return musicas;
	}
	
	public Musica getMusica(int i) {
		return musicas[i];
	}
	public String[] getMusica() {
		String[] s = new String[nMusicas];
		for(int i = 0; i < nMusicas; i++) {
			s[i] = musicas[i].getNome();
		}
		return s;
	}

	public void setMusica(Musica[] musicas) {
		this.musicas = musicas;
	}
	
	public void setMusica(int i, Musica u) {
		musicas[i] = u;
	}
	
	public int getnMusica() {
		return nMusicas;
	}

	public void setnMusica(int nMusicas) {
		this.nMusicas = nMusicas;
	}

	public Playlist[] getPlaylist() {
		return playlist;
	}
	
	public Playlist getPlaylist(int i) {
		return playlist[i];
	}
	public String[] getNomeUsuarios() {
		String[] s = new String[nUsuarios];
		for(int i = 0; i < nUsuarios; i++) {
			s[i] = usuario[i].getNome();
		}
		return s;

	public void setPlaylist(Playlist[] playlist) {
		this.playlist = playlist;
	}
	
	public void setPlaylist(int i, Playlist p) {
		playlist[i] = p;
	}


	public String[] getPlaylist() {
		String[] s = new String[nPlaylist];
		for(int i = 0; i < nPlaylist; i++) {
			s[i] = playlist[i].getNome();
		}
		return s;
	}


	public int getnPlaylist() {
		return nPlaylist;
	}



	public void setnPlaylist(int nPlaylist) {
		this.nPlaylist = nPlaylist;
	}

	public Usuario[] getAlbuns() {
		return albuns;
	}
	
	public Usuario getnAlbuns(int i) {
		return albuns[i];
	}

	public String[] getAlbuns() {
		String[] s = new String[nAlbuns];
		for(int i = 0; i < nAlbuns; i++) {
			s[i] = albuns[i].getNome();
		}
		return s;
	}
	
	public void setAlbuns(Usuario[] albuns) {
		this.albuns = albuns;
	}
	
	public void setAlbuns(int i, Album o) {
		albuns[i] = o;
	}

	public int getnUsuarios() {
		return nAlbuns;
	}

	public void setnUsuarios(int nAlbuns) {
		this.nAlbuns = nAlbuns;
	}


{
	public void preencherDados() 
		for(int i = 0; i < 10; i++) {
			String s = String.valueOf(i);
			usuario[i] = new Usuario("Usuario".concat(s), "dataNascimento".concat(s), "email".concat(s), 
					"senha".concat(s), "playlistSalvas".concat(s), "albunsFavoritados".concat(s));
			artistas[i] = new Artista("Artista".concat(s), "dataNascimento".concat(s), "email".concat(s), 
					"senha".concat(s),"albuns".concat(s), "musicas".concat(s), "seguidores".concat(s),"sob".concat(s));
			musicas[i] = new Musica("Musica".concat(s), "artista".concat(s),"duracao".concat(s), "album".concat(s));
			musicas[i].adicionarMusica(new Playlist(usuario[i], "hoje", i, "turma".concat(s) ));			
		}
		nUsuarios = nArtistas = nMusicas = 10;
	}

}
