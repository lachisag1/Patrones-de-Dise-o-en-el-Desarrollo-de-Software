/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicocomposite1;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author PC
 */
public class Pedido implements IPedido{

    private List<IPedido> pedidos = new ArrayList<>();

    public void agregarPedido(IPedido pedido) {
        pedidos.add(pedido);
    }
    
    @Override
    public String getNombre() {
        return "Pedido Completo";
    }

    @Override
    public double getPrecio() {
        double total = 0;
        for (IPedido pedido : pedidos) {
            total += pedido.getPrecio();
        }
        return total;
    }

    public void mostrarDetalle() {
        System.out.println("\n--- Detalle del Pedido ---");
        for (IPedido pedido : pedidos) {
            System.out.println(pedido.getNombre() + " + $" + pedido.getPrecio());
        }
        System.out.println("TOTAL A PAGAR: $" + getPrecio());
    }
}
