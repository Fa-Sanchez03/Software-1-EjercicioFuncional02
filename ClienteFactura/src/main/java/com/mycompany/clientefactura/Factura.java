package com.mycompany.clientefactura;

public class Factura implements Euro {

    String mNumero;
    String mFecha;

    Linea mLineas[];

    public Factura(String n, String f) {

        mNumero = n;
        mFecha = f;

        mLineas = new Linea[10];
    }

    public void add(Linea l) {

        int i = 0;

        for (i = 0; mLineas[i] != null; i++);

        mLineas[i] = l;
    }

    public void quitar(int i) {

        mLineas[i].setArticulo(null);
        mLineas[i].setPrecio(0);
    }

    public void show() {

        double total = 0;

        System.out.println(mNumero + "; " + mFecha);

        for (int i = 0; i < mLineas.length && mLineas[i] != null; i++) {

            mLineas[i].show();

            total += mLineas[i].getPrecio();
        }

        System.out.printf("%nTotal .... %.2f Lps%n", total);

        System.out.printf(
                "₡ %.2f euros%n",
                total / kCambio
        );
    }
}