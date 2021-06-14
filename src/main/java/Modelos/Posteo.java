/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.*;

/**
 *
 * @author joel
 */
@Entity
@IdClass(ClavePosteo.class)
public class Posteo {    
    //@Id private ClavePosteo clavePosteo;
    @Id private String idDocumento;
    @Id private String palabra;
    @Column private long frecuencia;
  

    public Posteo() {
        //clavePosteo
    }

    

    public String getIdDocumento() {
        return idDocumento;
    }

    public void setIdDocumento(String idDocumento) {
        this.idDocumento = idDocumento;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public long getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(long frecuencia) {
        this.frecuencia = frecuencia;
    }

   
    
    

    
}
