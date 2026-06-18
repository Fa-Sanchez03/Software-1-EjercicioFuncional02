package com.mycompany.clientefactura;

public class Linea {

    private String mArticulo;
    private double mPrecio;

    public Linea(String a, double p) {

        if (a == null || a.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "Error: El nombre no puede quedar vacío.");
        }

        if (p <= 0) {
            throw new IllegalArgumentException(
                    "Error: el precio debe ser positivo.");
        }

        if (p > 1000000) {
            throw new IllegalArgumentException(
                    "Error: Fuera del rango válido.");
        }

        mArticulo = a;
        mPrecio = p;
    }

    public void setArticulo(String a) {
        mArticulo = a;
    }

    public String getArticulo() {
        return mArticulo;
    }

    public void setPrecio(double p) {
        if (p < 0) {
            System.out.println("No se puede actualizar el precio a algo menor que 0");
        }
        else {
            mPrecio = p;
        }
    }

    public double getPrecio() {
        return mPrecio;
    }

    public void show() {

        System.out.printf(
                "\t%s ..... %.2f Lps%n",
                mArticulo,
                mPrecio
        );
    }
}