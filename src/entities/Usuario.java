package entities;

public class Usuario extends Pessoa{
	private Playlist[] playlistsSalvas;
	private Album[] albunsFavoritados;
	private int nPlaylists = 0;
	private int nAlbuns = 0;
	
	public Usuario(String nome,
		   	   String dataNascimento,
		       String email,
		       String senha
		       ) {
	super(nome, dataNascimento, email, senha);
	playlistsSalvas = new Playlist[50];
	albunsFavoritados = new Album[50];
	}
		
	public Playlist[] getPlaylistsSalvas() {
		return playlistsSalvas;
	}

	public int getPlaylists() {
		return nPlaylists;
	}

	public void setPlaylistsSalvas(Playlist[] playlistsSalvas ) {
		this.playlistsSalvas = playlistsSalvas;
	}

	public Album[] getAlbunsFavoritados() {
		return albunsFavoritados;
	}

	public int getalbuns() {
		return nAlbuns;
	}

	public void setAlbunsFavoritados(Album[] albunsFavoritados) {
		this.albunsFavoritados = albunsFavoritados;
	}

	public void criarPlaylist(String nomePlaylist, String tituloMusica) {
		Playlist novaPlaylist = new Playlist(nomePlaylist);
		novaPlaylist.adicionarMusica(tituloMusica);
		playlistsSalvas[nPlaylists++] = novaPlaylist;
	}

	
	public void deletarPlaylist(String nomePlaylist) {
		for (int i = 0; i < nPlaylists; i++) {
			if (playlistsSalvas[i].getNomePlaylist().equals(nomePlaylist)) {
				playlistsSalvas[i] = null;
				for (int j = i; j < nPlaylists - 1; j++) {
            	playlistsSalvas[j] = playlistsSalvas[j + 1];
				}
				playlistsSalvas[nPlaylists - 1] = null;
				nPlaylists--;
				break;
			}
		}
	}

			
	public boolean reproduzirMusica(String tituloMusica) {
		return true;
	}
}
