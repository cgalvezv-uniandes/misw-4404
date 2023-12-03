package restaurante;

import java.util.ArrayList;

public class Pedido {
    private ArrayList<Producto> productos;

    public Pedido(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public int calcularTotal() {
        int total = 0;
        for (Producto producto : productos) {
            total += producto.getPrecio();
        }
        return total;
    }

    public void generarReporte() {
        System.out.println("------------------------");
        System.out.println("Productos:");
        for (Producto producto : productos) {
            System.out.println(producto.getNombre() + " - " + producto.getPrecio());
        }
        System.out.println("Total: " + calcularTotal());
    }
}
