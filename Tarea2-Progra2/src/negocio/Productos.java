/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.util.ArrayList;
import datos.BDProductos;
import objetos.objProductos;

public class Productos {
    
    BDProductos BDProductos = new BDProductos();
    private final int materiaPrima = 5000;
    private int costoProduccion = 0, gastosFabricacion = 0, manoObra = 0, precioVenta = 0;

    public ArrayList<String> LeerDesdeArchivo() {
        ArrayList<String> listaUsuarios = BDProductos.LeerDesdeArchivo();
        return listaUsuarios;
    }
    
    public void InsertarProducto(ArrayList<objProductos> listaProductos) {
        String datos = "";
        for (int i = 0; i <= listaProductos.size() - 1; i++) {
            String nombre = listaProductos.get(i).getNombre();
            String clave = listaProductos.get(i).getClave();
            if(clave.equals("1")) {
                manoObra = (80*materiaPrima)/100;
                gastosFabricacion = ((28*materiaPrima)/100)+materiaPrima;
            } else if(clave.equals("2")) {
                manoObra = (85*materiaPrima)/100;
                gastosFabricacion = ((30*materiaPrima)/100)+materiaPrima;
            } else if(clave.equals("3")) {
                manoObra = (75*materiaPrima)/100;
                gastosFabricacion = ((35*materiaPrima)/100)+materiaPrima;
            } else if(clave.equals("4")) {
                manoObra = (75*materiaPrima)/100;
                gastosFabricacion = ((28*materiaPrima)/100)+materiaPrima;
            } else if(clave.equals("5")) {
                manoObra = (80*materiaPrima)/100;
                gastosFabricacion = ((30*materiaPrima)/100)+materiaPrima;
            } else if(clave.equals("6")) {
                manoObra = (85*materiaPrima)/100;
                gastosFabricacion = ((35*materiaPrima)/100)+materiaPrima;
            }
            costoProduccion = materiaPrima + manoObra + gastosFabricacion;
            precioVenta = costoProduccion+((45*costoProduccion)/100);
            datos = nombre + "," + clave + "," + costoProduccion + "," + precioVenta;
        }

        BDProductos.InsertarEnArchivo(datos);
    }
    
}