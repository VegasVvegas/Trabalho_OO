package entities;

import java.util.ArrayList;

public class Album {
	private String anoLancamento;
	private String tituloAlbum;
	private ArrayList<Musica> musicas = new ArrayList<Musica>();
	private String artista;
	private String genero;
	
	public Album(String anoLancamento,
				String tituloAlbum,
				String artista,
				String genero,
				ArrayList<Musica> musicas) {
		this.anoLancamento = anoLancamento;
		this.tituloAlbum = tituloAlbum;
		this.artista = artista;
		this.genero = genero;
		this.musicas = musicas;
	}
	
	public String getAnoLancamento() {
		return anoLancamento;
	}
	public void setAnoLancamento(String anoLancamento) {
		this.anoLancamento = anoLancamento;
	}
	public String getTituloAlbum() {
		return tituloAlbum;
	}
	public void setTituloAlbum(String tituloAlbum) {
		this.tituloAlbum = tituloAlbum;
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public boolean reproduzirAlbum(String tituloAlbum) {
		return true;
	}
	public boolean favoritarAlbum(String tituloAlbum) {
		return true;
	}
	public void compartilharAlbum(String tituloAlbum) {
	}
	public ArrayList<Musica> vizualizarAlbum() {
		return musicas;
	}
}