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
package paisescollection.Servicios;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import paisescollection.Entidades.Pais;
import paisescollection.Utilidades.Comparadores;

public class PaisServicio {
    private Scanner read;
    private HashSet<Pais> paises;
    private ArrayList<Pais> list;
    
    public PaisServicio(){
        this.read = new Scanner(System.in).useDelimiter("\n");
        this.paises = new HashSet();
        this.list = list; // necesito inicializar cuando ya este el hash
    }
    
    public void agregarPaises(){
        boolean loop = true; boolean loop2 = true;
        do{
            System.out.println("Ingrese Pais a agregar a la Lista:");
            paises.add(new Pais(read.next()));
            do{
                System.out.println("Desea seguir agregando paises? s/n");
                switch(read.next().toLowerCase()){
                    case "s":
                        loop2 = false;
                        break;
                    case "n":
                        loop = false;
                        break;
                    default:
                        System.out.println("Ingrese una opcion valida.");
                        break;
                }
            } while(loop2);
        } while(loop);
    }
    public void mostrarPaises(){
        for(Pais pais : paises){
            System.out.println(pais);
        }
    }
    public void ordenarPaises(){
        list = new ArrayList<Pais>(paises);
        Collections.sort(list, Comparadores.ordenarPaisAlfabeticamente);
    }
    public void mostrarPaisesOrdenados(){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
    public void eliminarPais(String name){
        boolean exito = false;
        Iterator<Pais> it = paises.iterator();
        while(it.hasNext()){
            Pais aux = it.next();
            if (aux.getPais().equals(name)) {
                it.remove();
                exito = true;
            }
        }
        if (exito) {
            System.out.println("Se ha removido exitosamente!");
        } else{
            System.out.println("No se encontro el pais en la lista");
        }
    }
}
