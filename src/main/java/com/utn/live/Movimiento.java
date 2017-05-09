package com.utn.live;


import java.util.Date;
/**
 * Created by pablis on 09/05/17.
 */
public class Movimiento {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Movimiento that = (Movimiento) o;

        if (Double.compare(that.monto, monto) != 0) return false;
        return !(fecha != null ? !fecha.equals(that.fecha) : that.fecha != null);

    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = fecha != null ? fecha.hashCode() : 0;
        temp = Double.doubleToLongBits(monto);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    private Date fecha;
        private double monto;
}
