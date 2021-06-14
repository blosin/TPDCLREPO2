/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author joel
 */

public class ClavePosteo implements Serializable {
    private String palabra;
    private String idDocumento;

    public ClavePosteo() {
    }

    public ClavePosteo(String palabra, String idDocumento) {
        this.palabra = palabra;
        this.idDocumento = idDocumento;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabraClave(String palabra) {
        this.palabra = palabra;
    }

    public String getIdDocumento() {
        return idDocumento;
    }

    public void setIdDocumento(String idDocumento) {
        this.idDocumento = idDocumento;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 61 * hash + Objects.hashCode(this.palabra);
        hash = 61 * hash + Objects.hashCode(this.idDocumento);
        return hash;
    }

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
        final ClavePosteo other = (ClavePosteo) obj;
        if (!Objects.equals(this.palabra, other.palabra)) {
            return false;
        }
        if (!Objects.equals(this.idDocumento, other.idDocumento)) {
            return false;
        }
        return true;
    }

   
}
