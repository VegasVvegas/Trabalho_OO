package entities;
public class Playlist {
	
	
	
	private String nomePlaylist;
	private String proprietario;
	private String musicas;
	private String duracaoPlaylist;
	
	public Playlist(String nomePlaylist, String proprietario,
			        String duracaoPlaylist,
			        String musicas) {
		this.nomePlaylist = nomePlaylist;
		this.proprietario = proprietario;
		this.duracaoPlaylist = duracaoPlaylist;
		this.musicas = musicas;
	}
	
	public Playlist(String nomePlaylist) {
		this.nomePlaylist = nomePlaylist;
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
	public String getDuraçãoPlaylist() {
		return duracaoPlaylist;
	}
	
	public void adicionarMusica(String tituloMusica) {
	}
	
	public void editarPlaylist(String nomePlaylist, String tituloMusica) {
	}
}
