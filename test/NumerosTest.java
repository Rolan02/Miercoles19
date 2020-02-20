/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rolando mamani salas
 */
public class NumerosTest {

    public NumerosTest() {
    }

    @Test
    public void descomponerUnNumeroTest() {
        int descomponer = 4;
        Numero numero = new Numero();
        List<Elementos> listaDescompuesta = new ArrayList<>();
        listaDescompuesta.add(new Elementos(4, 0));
        List<Elementos> listaResultado = numero.descomponerNumero(descomponer);
        assertEquals(listaDescompuesta.get(0).getDigito(),
                listaResultado.get(0).getDigito());
    }

    @Test
    public void descomponerVariosNumerosTest() {
        Numero numero = new Numero();
        int descomponer = 1234;
        List<Elementos> listaDescompuesta = new ArrayList<>();
        listaDescompuesta.add(new Elementos(4, 0));
        listaDescompuesta.add(new Elementos(3, 1));
        listaDescompuesta.add(new Elementos(2, 2));
        listaDescompuesta.add(new Elementos(1, 3));
        List<Elementos> listaResultado = numero.descomponerNumero(descomponer);
        assertEquals(listaDescompuesta.get(0).getDigito(),
                listaResultado.get(0).getDigito());

    }

    @Test
    public void invertirNumerosTest() {
        Numero numero =  new Numero();
        int invertir = 123456789;
        int valorEsperado = 987654321;
        int valorInvertido = numero.digitosInvertidos(invertir);
        assertEquals(valorEsperado, valorInvertido);
    }
    
    @Test
    public void invertirNumerosConCerosTest() {
        Numero numero =  new Numero();
        int invertir = 01230;
        int valorEsperado = 03210;
        int valorInvertido = numero.digitosInvertidos(invertir);
        assertEquals(valorEsperado, valorInvertido);
    }
}
