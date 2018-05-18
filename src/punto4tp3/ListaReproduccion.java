/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto4tp3;

import java.util.Arrays;

/**
 *
 * @author malve
 */
public class ListaReproduccion {

    private Cancion song[];
    private int i;
    
    public ListaReproduccion() {
        song = new Cancion[1];
        i = 0;
    }

    public void insertar(Cancion nuevaCancion) {

        Cancion nuevaLista[] = Arrays.copyOf(song, song.length + 1);
        song = nuevaLista;
        song[i] = nuevaCancion;
        i++;
    }

    public void reemplazarCancion(Cancion nuevaCancion, int indice) {
        if (existeIndice(indice) && indice >= 0) {
            song[indice] = nuevaCancion;
        } else {
            if (indice < 0) {
                System.out.println("Error!... Enserio? Indice " + indice + "? intetalo de nuevo -_-");
            }
            if (!existeIndice(indice) && !(indice < 0)) {
                System.out.println("Error! Indice no encontrado...");
            }

        }

    }

    public void removerEn(int indice) {
        song[indice] = null;
        Cancion nuevaLista[] = Arrays.copyOf(song, song.length - 1);
        if (existeIndice(indice)) {
            for (i = 0; i < indice - 1; i++) { //desplazar los elementos
                nuevaLista[i] = nuevaLista[i + 1];
            }
           song = nuevaLista;
            
        }
        if (indice < 0 || indice > song.length) {
            return;
        }
    }

    public void insertarEn(Cancion nuevaCancion, int indice) {
        Cancion nuevaLista[] = Arrays.copyOf(song, song.length + 1);
        if (existeIndice(indice)) {
            for (i = nuevaLista.length - 1; i > indice; i--) { //desplazar los elementos
                nuevaLista[i] = nuevaLista[i - 1];
            }
            nuevaLista[indice] = nuevaCancion;
            song = nuevaLista;
        }
        if (indice < 0 || indice > song.length) {
            song = nuevaLista;
            song[song.length - 1] = nuevaCancion;
            
        }

    }

    public int getCantidadCanciones() {
        return song.length;
    }

    public int encontrarIndice(Cancion cancionRequerida) {
        int x = 0;
        for (int j = 0; j < song.length; j++) {
            if (song[j] == cancionRequerida) {
                x = j;
            }
        }
        return x;
    }

    public boolean contiene(Cancion cancionRequerida) {
        boolean x = false;
        for (int j = 0; j < song.length; j++) {
            if (song[j] == cancionRequerida) {
                x = true;
            }
        }
        return x;
    }

    private boolean existeIndice(int indice) {
        if (indice <= song.length - 1) {
            if (indice >= 0) {
                return true;
            }
        }
        return false;
    }

    public Cancion getCancion(int indice) {
        if (existeIndice(indice)) {
            return song[indice];
        }
        return null;
    }
    
    @Override
    public String toString(){
        return Arrays.toString(song);
    }

}
