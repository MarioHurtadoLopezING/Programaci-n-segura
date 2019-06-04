/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3cifradordetexto;

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
public class Practica3CifradorDeTextoTest {
    
    public Practica3CifradorDeTextoTest() {
    }
    @Test
    public void textoValidoTest(){
        assertEquals(Practica3CifradorDeTexto.convertirTextoACaracteresCifrados("mario lopez", 3), "odulr ñrsh3");
    }
    @Test
    public void caracteresValidoTest(){
        assertEquals(Practica3CifradorDeTexto.convertirCaracteresCifradosATexto("odulr ñrsh3", 3), "mario lopez");
    }
}
