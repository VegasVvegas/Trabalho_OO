package entities;

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
			String[] nome = getNomeUsuarios();
			return nome.length;
		}
	
		public void setnUsuarios(int nUsuarios) {
			this.nUsuarios = nUsuarios;
		}
	
//		public Artista[] getnArtistas() {
//			return artistas;
//		}
		
		public Artista getnArtista(int i) {
			return artistas[i];
		}
	
		public String[] getNomeArtistas() {
			String[] s = new String[nArtistas];
			for(int i = 0; i < nArtistas; i++) {
				s[i] = artistas[i].getNome();
			}
			return s;
		}
	
	
		public void setnArtista(Artista[] artistas) {
			this.artistas = artistas;
		}
		
		public void setnArtistas(int i, Artista a) {
			artistas[i] = a;
		}
	
		public int getnArtistas() {
			String[] nome = getNomeArtistas();
			return nome.length;
		}
	
	
		public void setnArtistas(int nArtistas) {
			this.nArtistas = nArtistas;
		}
	
		public Musica[] getMusica() {
			return musicas;
		}
		
		public Musica getMusicas(int i) {
			return musicas[i];
		}
		public String[] getNomeMusica() {
			String[] s = new String[nMusicas];
			for(int i = 0; i < nMusicas; i++) {
				s[i] = musicas[i].getTituloMusica();
			}
			return s;
		}
	
		public void setMusica(Musica[] musicas) {
			this.musicas = musicas;
		}
		
		public void setMusicas(int i, Musica u) {
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
	
		public int getPlaylists(int i) {
			return 0;
		}
	
		public void setPlaylist(Playlist[] playlist) {
			this.playlist = playlist;
		}
		
		public void setPlaylists(int i, Playlist p) {
			playlist[i] = p;
		}
	
	
		public String[] getNomePlaylist() {
			String[] s = new String[nPlaylist];
			for(int i = 0; i < nPlaylist; i++) {
				s[i] = playlist[i].getNomePlaylist();
			}
			return s;
		}
	
	
		public int getnPlaylist() {
			String[] nPlaylist = getNomePlaylist();
			return nPlaylist.length;
		}
	
	
		public void setnPlaylist(int nPlaylist) {
			this.nPlaylist = nPlaylist;
		}
	
		public Album[] getAlbuns() {
			return albuns;
		}
		
		public Album getnAlbuns(int i) {
			return albuns[i];
		}
	
		public String[] getNomeAlbuns() {
			String[] s = new String[nAlbuns];
			for(int i = 0; i < nAlbuns; i++) {
				s[i] = albuns[i].getTituloAlbum();
			}
			return s;
		}
		
		public void setAlbuns(Album[] albuns) {
			this.albuns = albuns;
		}
		
		public void setAlbum(int i, Album o) {
			albuns[i] = o;
		}
	
		public int getnAlbuns() {
			String[] tituloAlbum = getNomeAlbuns();
			return tituloAlbum.length;
		}
	
		public void setnAlbuns(int nAlbuns) {
			this.nAlbuns = nAlbuns;
		}

		public void preencherDados() {
			for(int i = 0; i < 10; i++) {
				String s = String.valueOf(i);
				usuario[i] = new Usuario("Usuario".concat(s), "dataNascimento".concat(s), "email".concat(s), 
						"senha".concat(s));
				artistas[i] = new Artista("Artista".concat(s), "dataNascimento".concat(s), "email".concat(s), 
						"senha".concat(s),"albuns".concat(s), "musicas".concat(s), "seguidores".concat(s),"sob".concat(s));
				musicas[i] = new Musica("Musica".concat(s), "artista".concat(s),"duracao".concat(s), "album".concat(s));
				playlist[i] = new Playlist("Playlist".concat(s), "proprietario".concat(s), 
						"musicas".concat(s),"duracaoPlaylis".concat(s));
				albuns[i] = new Album("Album".concat(s), "anoLancamento".concat(s), 
						"musicas".concat(s),"artista".concat(s), "genero".concat(s));
				artistas[i].adicionarMusica(new Album(artistas[i], "musica".concat(s), i, "tituloAlbum".concat(s) ));	
				
			nUsuarios = nArtistas = nMusicas = 10;
		}
	}
}
