package com.utn.live;

import java.util.List;

/**
 * Created by pablis on 09/05/17.
 */
public class Cuenta {

    private String numero;




    public double getSaldo() {
        double saldo = 0;
        for (Movimiento m : this.getMovimientos() ) {
            saldo = saldo + m.getMonto();
        }

        return saldo;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cuenta cuenta = (Cuenta) o;

        if (numero != null ? !numero.equals(cuenta.numero) : cuenta.numero != null) return false;
        if (sucursal != null ? !sucursal.equals(cuenta.sucursal) : cuenta.sucursal != null) return false;
        return !(movimientos != null ? !movimientos.equals(cuenta.movimientos) : cuenta.movimientos != null);

    }

    @Override
    public int hashCode() {
        int result = numero != null ? numero.hashCode() : 0;
        result = 31 * result + (sucursal != null ? sucursal.hashCode() : 0);
        result = 31 * result + (movimientos != null ? movimientos.hashCode() : 0);
        return result;
    }

    public String getNumero() {
        return numero;

    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public List<Movimiento> getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(List<Movimiento> movimientos) {
        this.movimientos = movimientos;
    }

    private String sucursal;
    private List<Movimiento> movimientos;

}
