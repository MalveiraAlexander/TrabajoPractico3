/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto4tp3;
import java.util.Scanner;

/**
 *
 * @author malve
 */
public class ListaReproduccion {
    
    private Cancion[] song;
    private int i = 1;
    
    public ListaReproduccion(){
        song = new Cancion[1];
        i++;
    }
    
    public void insertar (Cancion nuevaCancion){
        nuevaCancion = new Cancion();
//        song[]
    }
    
    
    public void reemplazarCancion (Cancion nuevaCancion, int indice){
    
    
    }
    
    public void removerEn (int indice){
    
    
    }
    
    public void insertarEn (Cancion nuevaCancion, int indice){
    
    
    }
    
    public int getCantidadCanciones (){
        return 1;
    }
    
    public int encontrarIndice (Cancion cancionRequerida){
        return 1;
    }
    
    public boolean contiene (Cancion cancionRequerida){
        return false;
    }
    
    public Cancion getCancion (int indice){
        return null;
    }


    
}
