/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rolando mamani salas
 */
class Convertidor {

    private int numero;

    public Convertidor(int numero) {
        this.numero = numero;
    }

    
    public String convertirDecimalABinario() {
        String valorConvertido = "";
        if(numero > 0){
            while(numero >= 2){
                valorConvertido = valorConvertido + numero % 2;
                numero = numero / 2;
            }
            valorConvertido = numero + valorConvertido;
        }
        return valorConvertido;
    }

}
