package principal;

import java.util.ArrayList;

import logica.Categoria;
import logica.Dulces;

public class App {
    public static void main(String[] args) throws Exception {
        Dulces bombom = new Dulces(Categoria.dulce, "bombombum ", 1, 500);
        ArrayList <Dulces> lista_dulces = new ArrayList <Dulces>();
        lista_dulces.add(bombom);
        // Imprimir el ArrayList de Dulces
        System.out.println("Lista de Dulces:");
        System.out.println(    "---------------------");
        for (int i = 0; i < lista_dulces.size(); i++) {
            System.out.println("---------------------");
            System.out.println("Categoría: " + lista_dulces.get(i).getCategoria());
            System.out.println("Nombre   : " + lista_dulces.get(i).getNombre());
            System.out.println("Código   : " + lista_dulces.get(i).getCodigo());
            System.out.println("Precio   : " + lista_dulces.get(i).getPrecio());
            System.out.println("---------------------");

        }
    }
}
