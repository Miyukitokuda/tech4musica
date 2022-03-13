package br.com.tech4me.tech4books.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("musica")
public class musica {
    @Id
    private String id;
    private String titulo;
    private String artista;
    private String album;
    private Integer anoLancamento;
    private String genero;
    private String compositor;
    
    

    public void setId(String id) {
        this.id = id;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getArtista() {
        return artista;
    }
    public void setArtista(String artista) {
        this.autor = autor;
    }
    public void setAlbum(String album) {
        this.album = album;
    }
    public Integer getAnoLancamento() {
        return anoLancamento;
    }
    public void setAnoLancamento(Integer anoLancamento) {
        this.anoLancamento = anoLancamento;
    }
    public String getGenero() {
        return titulo;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getCompositor() {
        return compositor;
    }
    public void setCompositot(String compositor) {
        this.compositor = compositor;
    }
   

    
    
}
