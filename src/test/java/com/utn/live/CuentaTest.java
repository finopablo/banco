package com.utn.live;

import junit.framework.TestCase;

import java.util.ArrayList;

/**
 * Created by pablis on 09/05/17.
 */
public class CuentaTest extends TestCase {


    public void testSetData() {
        Cuenta c = new Cuenta();
        c.setNumero("10");
        c.setSucursal("MDQ");
        c.setMovimientos(new ArrayList<Movimiento>());
        assertNotNull(c.getMovimientos());
        assertEquals(c.getNumero(), "10");
        assertEquals(c.getSucursal(), "MDQ");
        assertEquals(c.getSaldo(), 0.0 );
    }

}
