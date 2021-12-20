package logica;

import java.io.Serializable;
import java.util.*;
import javax.persistence.*;

@Entity
public class Cliente implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_empleado")
     Integer id_empleado;
     String nombre;
     String apellido;
     String direccion;
     Integer DNI;
    @Temporal(TemporalType.DATE)
     Date fecha_nac;
     String nacionalidad;
     String celular;
     String email;
    @OneToMany
     List<Ventas> compras;
    

    public Cliente() {
    }

    public Cliente(String nombre, String apellido, String direccion, Integer DNI, Date fecha_nac, String nacionalidad, String celular, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.DNI = DNI;
        this.fecha_nac = fecha_nac;
        this.nacionalidad = nacionalidad;
        this.celular = celular;
        this.email = email;
    }

    public Cliente(String nombre, String apellido, String direccion, Integer DNI, Date fecha_nac, String nacionalidad, String celular, String email, List<Ventas> compras) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.DNI = DNI;
        this.fecha_nac = fecha_nac;
        this.nacionalidad = nacionalidad;
        this.celular = celular;
        this.email = email;
        this.compras = compras;
    }   

    public Cliente(Integer id_empleado, String nombre, String apellido, String direccion, Integer DNI, Date fecha_nac, String nacionalidad, String celular, String email) {
        this.id_empleado = id_empleado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.DNI = DNI;
        this.fecha_nac = fecha_nac;
        this.nacionalidad = nacionalidad;
        this.celular = celular;
        this.email = email;
    }

    public Cliente(Integer id_empleado, String nombre, String apellido, String direccion, Integer DNI, Date fecha_nac, String nacionalidad, String celular, String email, List<Ventas> compras) {
        this.id_empleado = id_empleado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.DNI = DNI;
        this.fecha_nac = fecha_nac;
        this.nacionalidad = nacionalidad;
        this.celular = celular;
        this.email = email;
        this.compras = compras;
    }
    
    

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(Integer id_empleado) {
        this.id_empleado = id_empleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getDNI() {
        return DNI;
    }

    public void setDNI(Integer DNI) {
        this.DNI = DNI;
    }

    public Date getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(Date fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id_empleado=" + id_empleado + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion + ", DNI=" + DNI + ", fecha_nac=" + fecha_nac + ", nacionalidad=" + nacionalidad + ", celular=" + celular + ", email=" + email + '}';
    }
    
    
}