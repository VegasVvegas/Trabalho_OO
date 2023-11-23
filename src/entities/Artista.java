package entities;
import java.util.Date;
public class Artista extends Pessoa {
	private Album[]albuns;
	private Musica[]musicas;
	private String seguidores;
	private String sobre;
	private int nAlbuns = 0;
	private int nMusicas = 0;
	
	
public Artista(String nome,
	   	       String dataNascimento,
	           String email,
	           String senha,
	           String seguidores,
	           String sobre) {
		super(nome, dataNascimento, email, senha);
		albuns = new Album[50];
		musicas = new Musica[50];
		this.seguidores = seguidores;
		this.sobre = sobre;

	}

public String getSeguidores() {
	return seguidores;
}
public void setSeguidores(String seguidores) {
	this.seguidores = seguidores;
}
public String getSobre() {
	return sobre;
}
public void setSobre(String sobre) {
	this.sobre = sobre;
}

	public void deletarAlbum(String tituloAlbum, String tituloMusica, String genero) {
		for (int i = 0; i < nAlbuns; i++) {
	        if (albuns[i].getTituloAlbum().equals(tituloAlbum)) {
	            albuns[i] = null;
	            for (int j = i; j <  nAlbuns - 1; j++) {
	            	albuns[j] = albuns[j + 1];
	            }
	            albuns[ nAlbuns - 1] = null;
	            nAlbuns--;
	            break;
	        }
	    }
	}
	public void deletarMusica(String tituloAlbum, String tituloMusica, String genero) {
		for (int m = 0; m < nMusicas; m++) {
		if (musicas[m].getTituloMusica().equals(tituloMusica)) {
            musicas[m] = null;
            for (int n = m; n <  nMusicas - 1; n++) {
            	albuns[n] = albuns[n + 1];
            }
            musicas[ nMusicas - 1] = null;
            nAlbuns--;
            break;
        }
    }
}

}
