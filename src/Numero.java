
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rolando mamani salas
 */
public class Numero {

    public Numero() {
    }
    
    /*Mediante este metodo logramos descomponer cualquier numero ingresado
     *Con la ayuda del bucle de control logramos ingresar los objetos de tipo
    Elemento a una lista la cual nos incluye en valor del digito y la posicion
    en la que se encuentra
    
    */
    public List<Elementos> descomponerNumero(int numero) {
        List<Elementos> listaDescompuesta = new ArrayList<>();
        int posicion = 1;
        while (numero != 0) {
            listaDescompuesta.add(new Elementos(numero % 10, posicion));
            numero = numero / 10;
            posicion++;
        }
        return listaDescompuesta;
    }

    /*Metodo que te permite invertir los numeros mediante el bucle while
    
    */
    public int digitosInvertidos(int digito) {
        int resto;
        int invertido = 0;
        while (digito > 0) {
            resto = digito % 10;
            invertido = invertido * 10 + resto;
            digito /= 10;
        }
        return invertido;
    }
}
