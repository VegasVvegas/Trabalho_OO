package entities;

public class Musica {
	private String tituloMusica;
	private String artista;
	private int duracao;
	private String album;
	
	public Musica(String tituloMusica, String artista, int duracao, String album) {
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
	public int getDuracao() {
		return duracao;
	}
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	
	public boolean pausarMusica( String tituloMusica, int duracao) {
		return true;
	}
	public boolean avancarMusica( String tituloMusica, int duracao) {
		return true;
	}
	public boolean repetirMusica( String tituloMusica) {
		return false;
	}
}
