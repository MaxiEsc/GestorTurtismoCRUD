package logica;

import java.io.Serializable;
import java.util.*;
import javax.persistence.*;

@Entity
public class ServicioTuristico implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "codigo")
    Integer codigo;

    @Basic
    String nombre;
    String descripcion_breve;
    String destino_servicio;
    Double costo_servicio;

    @Temporal(TemporalType.DATE)
    Date fecha_servicio;

    @ManyToMany
    List<PaqueteTuristico> paquetes;

    @OneToMany
    List<Ventas> ventas;

    public ServicioTuristico() {
    }

    public ServicioTuristico(String nombre, String descripcion_breve, String destino_servicio, Double costo_servicio, Date fecha_servicio) {
        this.nombre = nombre;
        this.descripcion_breve = descripcion_breve;
        this.destino_servicio = destino_servicio;
        this.costo_servicio = costo_servicio;
        this.fecha_servicio = fecha_servicio;
    }

    public ServicioTuristico(Integer codigo, String nombre, String descripcion_breve, String destino_servicio, Double costo_servicio, Date fecha_servicio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion_breve = descripcion_breve;
        this.destino_servicio = destino_servicio;
        this.costo_servicio = costo_servicio;
        this.fecha_servicio = fecha_servicio;
    }

    public ServicioTuristico(String nombre, String descripcion_breve, String destino_servicio, Double costo_servicio, Date fecha_servicio, List<PaqueteTuristico> paquetes, List<Ventas> ventas) {
        this.nombre = nombre;
        this.descripcion_breve = descripcion_breve;
        this.destino_servicio = destino_servicio;
        this.costo_servicio = costo_servicio;
        this.fecha_servicio = fecha_servicio;
        this.paquetes = paquetes;
        this.ventas = ventas;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion_breve() {
        return descripcion_breve;
    }

    public void setDescripcion_breve(String descripcion_breve) {
        this.descripcion_breve = descripcion_breve;
    }

    public String getDestino_servicio() {
        return destino_servicio;
    }

    public void setDestino_servicio(String destino_servicio) {
        this.destino_servicio = destino_servicio;
    }

    public Double getCosto_servicio() {
        return costo_servicio;
    }

    public void setCosto_servicio(Double costo_servicio) {
        this.costo_servicio = costo_servicio;
    }

    public Date getFecha_servicio() {
        return fecha_servicio;
    }

    public void setFecha_servicio(Date fecha_servicio) {
        this.fecha_servicio = fecha_servicio;
    }

    public List<PaqueteTuristico> getPaquetes() {
        return paquetes;
    }

    public void setPaquetes(List<PaqueteTuristico> paquetes) {
        this.paquetes = paquetes;
    }

    public List<Ventas> getVentas() {
        return ventas;
    }

    public void setVentas(List<Ventas> ventas) {
        this.ventas = ventas;
    }

    @Override
    public String toString() {
        return "ServicioTuristico{" + "codigo=" + codigo + ", nombre=" + nombre + ", descripcion_breve=" + descripcion_breve + ", destino_servicio=" + destino_servicio + ", fecha_servicio=" + fecha_servicio + ", costo_servicio=" + costo_servicio + '}';
    }
}
