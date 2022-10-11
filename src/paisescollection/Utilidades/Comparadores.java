/*

 */
package paisescollection.Utilidades;
import java.util.Comparator;
import paisescollection.Entidades.Pais;

public class Comparadores {
    public static Comparator<Pais> ordenarPaisAlfabeticamente = new Comparator<Pais>() {
        @Override
        public int compare(Pais t, Pais t1) {
            return t.getPais().compareTo(t1.getPais());
        }
    };
}
