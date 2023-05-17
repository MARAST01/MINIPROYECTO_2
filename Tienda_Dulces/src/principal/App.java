package principal;

import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import logica.Categoria;
import logica.Dulces;
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Dulces bombom = new Dulces(Categoria.dulce, "bombombum ", 1, 500);
        ArrayList <Dulces> lista_dulces = new ArrayList <Dulces>();
        lista_dulces.add(bombom);
        //boton 1
        System.out.println("Seleccione el dulce que desea actualizar:");
        for (int i = 0; i < lista_dulces.size(); i++) {
            System.out.println(i + 1 + " - " + lista_dulces.get(i).getNombre());
        }
        //leer indice del dulce a modificar (cambiar esta parte)
        Scanner leer = new Scanner(System.in);
        int opcionDulce = leer.nextInt();
        Dulces dulce = lista_dulces.get(opcionDulce - 1);

        //ingrese la categoria del dulce
        //seleccione la nueva vacuna de la mascota
        Categoria categorias = null;
        boolean categoriaValida = false;
        do {
            System.out.println("Seleccione la nueva vacuna de la mascota:");
            System.out.println("1 - dulce");
            System.out.println("2 - acido");
            System.out.println("3 - sin azucar");
            int opcionVacuna = leer.nextInt();
            switch (opcionVacuna) {
                case 1:
                    categorias = Categoria.dulce;
                    categoriaValida = true;
                    break;
                case 2:
                    categorias = Categoria.acido;
                    categoriaValida = true;
                    break;
                case 3:
                    categorias = Categoria.sin_azucar;
                    categoriaValida = true;
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
        } while (!categoriaValida);
        //ingrese el nuevo nombre del dulce
        System.out.println("Ingrese el nombre del dulce");
        String nuevonombre = leer.next();
        dulce.setNombre(nuevonombre);
        //ingrese el nuevo codigo del dulce
        System.out.println("Ingrese el nombre del dulce");
        int nuevocodigo = leer.nextInt();
        dulce.setCodigo(nuevocodigo);
        //ingrese el nuevo precio del dulce
        System.out.println("Ingrese el nombre del dulce");
        int nuevoprecio = leer.nextInt();
        dulce.setPrecio(nuevoprecio);




        //boton 2
         //elminas el dulce del indice digitado

         // imprime los dulces
         System.out.println("Seleccione el dulce que desea actualizar:");
        for (int i = 0; i < lista_dulces.size(); i++) {
            System.out.println(i + 1 + " - " + lista_dulces.get(i).getNombre());
        }
        // eliga el dulce que desee eliminar
        System.out.println("Seleccione la mascota que desea eliminar:");
        int opcionDulce2 = leer.nextInt();
        Dulces dulceEliminar = lista_dulces.get(opcionDulce2 - 1);
        
        // dulce eliminada :,D
        lista_dulces.remove(dulceEliminar);
        System.out.println("Dulce eliminada correctamente.");
    
        //boton 4
        System.out.println("Ingrese el nombre de la mascota a buscar:");
            String nombreBuscar = leer.nextLine();
            boolean encontrado = false;
            for (Dulces dulces : lista_dulces) {
                if (dulce.getNombre().equalsIgnoreCase(nombreBuscar)) {
                    System.out.println("dulces encontrada:");
                    System.out.println(dulces);
                    encontrado = true;

                }
            }    
            if (!encontrado) {
                System.out.println("No hay dulce con ese nombre.");
            }
        
        //boton 5
        // Imprimir el ArrayList de Dulces con un boton
        button.addActionListener(new ActionListener() {}
            for (int i = 0; i < lista_dulces.size(); i++) {
                System.out.println("Categoría: " + lista_dulces.get(i).getCategoria());
                System.out.println("Nombre   : " + lista_dulces.get(i).getNombre());
                System.out.println("Código   : " + lista_dulces.get(i).getCodigo());
                System.out.println("Precio   : " + lista_dulces.get(i).getPrecio());

            }
    }
}
