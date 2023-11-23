package entities;

public class Musica {
	private String tituloMusica;
	private String artista;
	private String duracao;
	private String album;
	
	public Musica(String tituloMusica, String artista, String duracao, String album) {
		this.tituloMusica = tituloMusica;
		this.artista = artista;
		this.duracao = duracao;
		this.album = album;
	}
	public String getTituloMusica() {
		return tituloMusica;
	}
	public void setTituloMusica(String tituloMusica) {
		this.tituloMusica = tituloMusica;
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public String getDuracao() {
		return duracao;
	}
	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	
	public boolean pausarMusica( String tituloMusica, String duracao) {
		return true;
	}
	public boolean avancarMusica( String tituloMusica, String duracao) {
		return true;
	}
	public boolean repetirMusica( String tituloMusica) {
		return false;
	}
}
