
package Modelos;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity()
public class Documento {

    @Id private String idDocumento;    
    @Column private String ruta;
    
    public Documento() {
    }

    public String getIdDocumento() {
        return idDocumento;
    }

    public void setIdDocumento(String idDocumento) {
        this.idDocumento = idDocumento;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
    
   
}
