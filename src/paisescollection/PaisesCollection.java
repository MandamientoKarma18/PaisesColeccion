/*
Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos 
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el 
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir, 
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer 
los servicios en la clase correspondiente)
Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar 
cómo se ordena un conjunto.
Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se 
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el 
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará 
al usuario.
 */
package paisescollection;
import java.util.Scanner;
import paisescollection.Servicios.PaisServicio;

public class PaisesCollection {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        PaisServicio ps = new PaisServicio();
        ps.agregarPaises();
        ps.mostrarPaises();
        System.out.println("-----------------Orden Alfabetico-----------------");
        ps.ordenarPaises();
        ps.mostrarPaisesOrdenados();
        boolean loop = true;
        do{
            System.out.println("Quiere remover un pais? s/n");
            switch(read.next().toLowerCase()){
                case "s":
                    System.out.println("Ingrese pais a eliminar:");
                    ps.eliminarPais(read.next());
                    loop = false;
                    break;
                case "n":
                    break;
                default:
                    System.out.println("Ingrese una opcion valida.");
                    break;
            }
        } while(loop);
        ps.ordenarPaises();
        ps.mostrarPaisesOrdenados();
    }
    
}
