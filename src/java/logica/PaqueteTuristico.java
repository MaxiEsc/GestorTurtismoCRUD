package logica;

import java.io.Serializable;
import java.util.*;
import javax.persistence.*;

@Entity
public class PaqueteTuristico implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "codigo_paquete")
      Integer codigo_paquete;

    @Basic
      Double costo_paquete;

    @OneToMany
      List<Ventas> ventas;

    public PaqueteTuristico() {
    }   

    public PaqueteTuristico(Double costo_paquete, List<Ventas> ventas) {
        this.costo_paquete = costo_paquete;
        this.ventas = ventas;
    }   

    public PaqueteTuristico(Integer codigo_paquete, Double costo_paquete, List<Ventas> ventas) {
        this.codigo_paquete = codigo_paquete;
        this.costo_paquete = costo_paquete;
        this.ventas = ventas;
    }
    
    public Integer getCodigo_paquete() {
        return codigo_paquete;
    }

    public void setCodigo_paquete(Integer codigo_paquete) {
        this.codigo_paquete = codigo_paquete;
    }

    public Double getCosto_paquete() {
        return costo_paquete;
    }

    public void setCosto_paquete(Double costo_paquete) {
        this.costo_paquete = costo_paquete;
    }

    public List<Ventas> getVentas() {
        return ventas;
    }

    public void setVentas(List<Ventas> ventas) {
        this.ventas = ventas;
    }
    
     @Override
    public String toString() {
        return "PaqueteTuristico{" + "codigo_paquete=" + codigo_paquete  + ", costo_paquete=" + costo_paquete + '}';
    }
}
