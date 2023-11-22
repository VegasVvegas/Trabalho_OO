package entities;

import java.util.ArrayList;

public class Playlist {
	private String nomePlaylist;
	private String proprietario;
	private ArrayList<Musica> musicas = new ArrayList<Musica>();
	private int duracaoPlaylist;
	
	public Playlist(String nomePlaylist, String proprietario,
			        int duracaoPlaylist,
			        ArrayList<Musica> musicas) {
		super();
		this.nomePlaylist = nomePlaylist;
		this.proprietario = proprietario;
		this.duracaoPlaylist = duracaoPlaylist;
		this.musicas = musicas;
	}
	
	
	public String getNomePlaylist() {
		return nomePlaylist;
	}
	public void setNomePlaylist(String nomePlaylist) {
		this.nomePlaylist = nomePlaylist;
	}
	public String getProprietario() {
		return proprietario;
	}
	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}
	public int getDuracaoPlaylist() {
		return duracaoPlaylist;
	}
	
	public void adicionarMusica(String tituloMusica) {
	}
	public void aleatorizar() {
	}
	public void editarPlaylist(String nomePlaylist, String tituloMusica) {
	}
}