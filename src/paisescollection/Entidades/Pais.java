/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paisescollection.Entidades;

import java.util.Objects;

public class Pais {
    private String pais;

    public Pais() {
    }

    public Pais(String pais) {
        this.pais = pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }
    //hash numerico
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 31 * hash + Objects.hashCode(this.pais);
        return hash;
    }
    // equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pais other = (Pais) obj;
        if (!Objects.equals(this.pais, other.pais)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pais{" + "pais=" + pais + '}';
    }
}
