/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto4tp3;

/**
 *
 * @author malve
 */
public class Cancion {
    
    private String titulo;
    private String autor;
    
    
    public Cancion(){
        
    }
    
    public Cancion(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    
    @Override
    public String toString(){
        return ("El titulo de la cancion es " + getTitulo() + ", el autor es " + getAutor());
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Cancion) {
            final Cancion c = (Cancion) obj;
            return this.autor.equals(c.autor) && (this.titulo.equals(c.titulo));
        } else {
            return false;
        }
    }
    
}
