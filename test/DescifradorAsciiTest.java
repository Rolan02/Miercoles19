/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rolando mamani salas
 */
public class DescifradorAsciiTest {

    public DescifradorAsciiTest() {
    }

    @Test
    public void descifrandoLaFraseTest() {
        int[] mensajeOculto = {34, 66, 105, 101, 110, 118, 101, 110, 105, 100, 111,
            115, 32, 97, 32, 108, 97, 32, 70, 117, 110, 100,
            97, 99, 105, 111, 110, 32, 74, 97, 108, 97, 32,
            58, 45, 41, 33, 34};
        DescifradorAscii codigoAscii = new DescifradorAscii(mensajeOculto);
        String mensajeEsperado = "\"Bienvenidos a la Fundacion Jala :-)!\"";
        String mensajeObtenido = codigoAscii.decifrarMensajeOculto(mensajeOculto);

        assertEquals(mensajeEsperado, mensajeObtenido);
    }

}
