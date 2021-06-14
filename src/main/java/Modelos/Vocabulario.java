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
@Entity @Table(name="dbo.Vocabulario")
public class Vocabulario implements Serializable {
    @Id private String palabra;
    @Column private long cantDocumentos;
    @Column private long maxFrecuencia;

    public Vocabulario() {
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public long getCantDocumentos() {
        return cantDocumentos;
    }

    public void setCantDocumentos(long cantDocumentos) {
        this.cantDocumentos = cantDocumentos;
    }

    public long getMaxFrecuencia() {
        return maxFrecuencia;
    }

    public void setMaxFrecuencia(long maxFrecuencia) {
        this.maxFrecuencia = maxFrecuencia;
    }

    @Override
    public String toString() {
        return "Vocabulario{" + "palabra=" + palabra + ", cantDocumentos=" + cantDocumentos + ", maxFrecuencia=" + maxFrecuencia + '}';
    }
    
    
}
