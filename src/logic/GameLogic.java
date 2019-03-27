/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import audio.StdSound;
import figuras.Fondo;
import figuras.Marcador;
import figuras.base.Animable;
import figuras.base.Dibujable;
import figuras.base.Eliminable;
import java.awt.Graphics;
import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;

/**
 *
 * @author victor
 */
public class GameLogic {
    public static final int NUM_VIDAS = 3;
    
    private int vidas;
    private int puntos;
    
    // Dimensiones: Asume que la ventana es de 500x600
    
    private List<Dibujable> listaObjetosDibujables;

    public GameLogic() {
        listaObjetosDibujables = new LinkedList<>();
        empezar();
    }
    
    public void dibujarYActualizarTodo(Graphics g) {    
        Iterator<Dibujable> iter = listaObjetosDibujables.iterator();
        while (true) {
            if (!iter.hasNext()) { // Si no hay siguiente, salir del bucle
                break;
            }
            Dibujable objetoDelJuego = iter.next(); // Acceder al objeto
            if (objetoDelJuego instanceof Eliminable) { // Si está eliminado lo quitamos
                if (((Eliminable) objetoDelJuego).estaEliminado()) {
                    iter.remove();
                    continue;
                }
            }
            objetoDelJuego.dibujar(g); // lo dibujamos
            if (objetoDelJuego instanceof Animable) { // Y si está auto-animado, lo movemos
                ((Animable) objetoDelJuego).mover();
            }
        }
        
    }

    public List<Dibujable> getListaObjetos() {
        return listaObjetosDibujables;
    }
    
    public void empezar() {
        // TO-DO Inicia el juego!
        listaObjetosDibujables.clear();
        inicializarNivel(0);
    }
    
    public void inicializarNivel(int nivel) {
        // TO-DO
        if (nivel == 0) {
            StdSound.playMidi(("assets/audio/start_level.mid"));
            vidas = NUM_VIDAS;
            puntos = 0;
            // TODO
            listaObjetosDibujables.add(new Fondo("assets/img/fondo2.jpg"));
            listaObjetosDibujables.add(new Marcador(this));
        }
        
        // TODO 
        
    }

    public int getVidas() {
        return vidas;
    }

    public int getPuntos() {
        return puntos;
    }
    
    
    
}
