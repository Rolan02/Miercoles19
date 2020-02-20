/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rolando mamani salas
 */
public class DescifradorAscii {
    
    int[] mensajeOculto;

    public DescifradorAscii(int[] mensajeOculto) {
        this.mensajeOculto = mensajeOculto;
    }
    public String decifrarMensajeOculto(int[] mensajeOculto){
        String mensajeDecifrado = "";
        for(int i=0;i<mensajeOculto.length;i++){
            mensajeDecifrado +=(char)mensajeOculto[i];
        }
        return mensajeDecifrado;
    }
}
