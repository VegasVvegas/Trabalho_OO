package entities;

public class Playlist {
	private String nomePlaylist;
	private String proprietario;
	private Arraylist musicas;
	private int duraçãoPlaylist;
	
	
	
	
	public Playlist(String nomePlaylist, String proprietario, int duraçãoPlaylist) {
		super();
		this.nomePlaylist = nomePlaylist;
		this.proprietario = proprietario;
		this.duraçãoPlaylist = duraçãoPlaylist;
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
	public int getDuraçãoPlaylist() {
		return duraçãoPlaylist;
	}
	
	public void adicionarMusica(String tituloMusica) {
	}
	public void aleatorizar() {
	}
	public void editarPlaylist(String nomePlaylist, String tituloMusica) {
	}
}
