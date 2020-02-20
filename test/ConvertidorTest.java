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
public class ConvertidorTest {
    
    public ConvertidorTest() {
    }
        
    @Test
    public void convertidorDecimalABinarioTest(){
        Convertidor numeroDecimal = new Convertidor(56);
        String valorEsperado = "111000";
        String valorConvertido = numeroDecimal.convertirDecimalABinario();
        assertEquals(valorEsperado, valorConvertido);
    
    }
}
