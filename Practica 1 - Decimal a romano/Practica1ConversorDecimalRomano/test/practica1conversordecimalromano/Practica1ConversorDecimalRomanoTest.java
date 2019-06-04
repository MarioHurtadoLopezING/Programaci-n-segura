/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1conversordecimalromano;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mariolpz
 */
public class Practica1ConversorDecimalRomanoTest {
    /**
     * Test of convertirDecimalRomano method, of class Practica1ConversorDecimalRomano.
     */
    @Test
    public void convertirDecimalRomanoMultiplosUnoTest() {
        String numeroRomanoEsperado = Practica1ConversorDecimalRomano.convertirDecimalRomano(1);
        assertEquals("I", numeroRomanoEsperado);
    }
    @Test
    public void convertirDecimalRomanoMultiplosDiezTest() {
        String numeroRomanoEsperado = Practica1ConversorDecimalRomano.convertirDecimalRomano(10);
        assertEquals("X", numeroRomanoEsperado);
    }
    @Test
    public void convertirDecimalRomanoMultiplosCienTest() {
        String numeroRomanoEsperado = Practica1ConversorDecimalRomano.convertirDecimalRomano(100);
        assertEquals("C", numeroRomanoEsperado);
    }
    @Test
    public void convertirDecimalRomanoMultiplosMilTest() {
        String numeroRomanoEsperado = Practica1ConversorDecimalRomano.convertirDecimalRomano(1000);
        assertEquals("M", numeroRomanoEsperado);
    }
    @Test
    public void convertirDecimalRomanoMultiplosCincoTest() {
        String numeroRomanoEsperado = Practica1ConversorDecimalRomano.convertirDecimalRomano(5);
        assertEquals("V", numeroRomanoEsperado);
    }
    @Test
    public void convertirDecimalRomanoMultiplosCincuentaTest() {
        String numeroRomanoEsperado = Practica1ConversorDecimalRomano.convertirDecimalRomano(50);
        assertEquals("L", numeroRomanoEsperado);
    }
    @Test
    public void convertirDecimalRomanoMultiplosquinientosTest() {
        String numeroRomanoEsperado = Practica1ConversorDecimalRomano.convertirDecimalRomano(500);
        assertEquals("D", numeroRomanoEsperado);
    }
    @Test
    public void convertirDecimalRomanoMultiplosCuatroTest() {
        String numeroRomanoEsperado = Practica1ConversorDecimalRomano.convertirDecimalRomano(4);
        assertEquals("IV", numeroRomanoEsperado);
    }
    @Test
    public void convertirDecimalRomanoMultiplosSeisTest() {
        String numeroRomanoEsperado = Practica1ConversorDecimalRomano.convertirDecimalRomano(6);
        assertEquals("VI", numeroRomanoEsperado);
    }
    @Test
    public void convertirDecimalRomanoMultiplosNueveTest() {
        String numeroRomanoEsperado = Practica1ConversorDecimalRomano.convertirDecimalRomano(9);
        assertEquals("IX", numeroRomanoEsperado);
    }
    @Test
    public void convertirDecimalRomanoValorLimiteSuperiorVerdaderoTest() {
        String numeroRomanoEsperado = Practica1ConversorDecimalRomano.convertirDecimalRomano(3999);
        assertEquals("MMMCMXCIX", numeroRomanoEsperado);
    }
    @Test
    public void convertirDecimalRomanoValorLimiteInferiorVerdaderoTest(){
        String numeroRomanoEsperado = Practica1ConversorDecimalRomano.convertirDecimalRomano(1);
        assertEquals("I", numeroRomanoEsperado);
    }
    @Test
    public void convertirDecimalRomanoValorLimiteSuperiorFalsoTest() {
        String numeroRomanoEsperado = Practica1ConversorDecimalRomano.convertirDecimalRomano(4000);
        assertEquals("Número mayor a los valores válidos", numeroRomanoEsperado);
    }
    @Test
    public void convertirDecimalRomanoValorLimiteInferiorFalsoTest(){
        String numeroRomanoEsperado = Practica1ConversorDecimalRomano.convertirDecimalRomano(0);
        assertEquals("Número inferior a los valores válidos", numeroRomanoEsperado);
    }
    @Test
    public void convertirDecimalRomanoValoresCentralesTest(){
        String numeroRomanoEsperado = Practica1ConversorDecimalRomano.convertirDecimalRomano(1999);
        assertEquals("MCMXCIX", numeroRomanoEsperado);
    }
}
