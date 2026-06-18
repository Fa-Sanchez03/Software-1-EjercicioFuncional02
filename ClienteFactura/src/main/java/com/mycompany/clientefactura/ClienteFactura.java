package com.mycompany.clientefactura;

public class ClienteFactura {

    public static void main(String[] args) {

        Cliente cliente =
                new Cliente("0801199912345",
                        "Fabian Sanchez");

        Factura factura =
                new Factura("FAC-001",
                        "17/06/2026");

        factura.add(
                new Linea("Laptop", 25000)
        );

        factura.add(
                new Linea("Mouse", 500)
        );

        factura.add(
                new Linea("Teclado", 1200)
        );

        cliente.add(factura);

        cliente.show();
    }
}