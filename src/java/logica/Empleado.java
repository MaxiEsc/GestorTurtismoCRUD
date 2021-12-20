package logica;

import java.io.Serializable;
import java.util.*;
import javax.persistence.*;

@Entity
public class Empleado implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_empleado")
    Integer id_empleado;

    @Basic
    String nombre;
    String apellido;
    String direccion;
    Integer DNI;
    String nacionalidad;
    String celular;
    String email;
    String cargo;
    Double sueldo;

    @Temporal(TemporalType.DATE)
    Date fecha_nac;

    @OneToOne
    Usuario usuario;

    @OneToMany
    List<Ventas> lista_ventas;

    public Empleado() {
    }

    public Empleado(String nombre, String apellido, String direccion, Integer DNI, String nacionalidad, String celular, String email, String cargo, Double sueldo, Date fecha_nac, Usuario usuario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.DNI = DNI;
        this.nacionalidad = nacionalidad;
        this.celular = celular;
        this.email = email;
        this.cargo = cargo;
        this.sueldo = sueldo;
        this.fecha_nac = fecha_nac;
        this.usuario = usuario;
    }

    public Empleado(Integer id_empleado, String nombre, String apellido, String direccion, Integer DNI, String nacionalidad, String celular, String email, String cargo, Double sueldo, Date fecha_nac, Usuario usuario) {
        this.id_empleado = id_empleado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.DNI = DNI;
        this.nacionalidad = nacionalidad;
        this.celular = celular;
        this.email = email;
        this.cargo = cargo;
        this.sueldo = sueldo;
        this.fecha_nac = fecha_nac;
        this.usuario = usuario;
    }

    public Empleado(Integer id_empleado, String nombre, String apellido, String direccion, Integer DNI, Date fecha_nac, String nacionalidad, String celular, String email, Usuario nombreUsuario, String cargo, Double sueldo, List<Ventas> lista_ventas) {
        this.id_empleado = id_empleado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.DNI = DNI;
        this.fecha_nac = fecha_nac;
        this.nacionalidad = nacionalidad;
        this.celular = celular;
        this.email = email;
        this.usuario = nombreUsuario;
        this.cargo = cargo;
        this.sueldo = sueldo;
        this.lista_ventas = lista_ventas;
    }
    
     public Empleado(String nombre, String apellido, String direccion, Integer DNI, Date fecha_nac, String nacionalidad, String celular, String email, Usuario nombreUsuario, String cargo, Double sueldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.DNI = DNI;
        this.fecha_nac = fecha_nac;
        this.nacionalidad = nacionalidad;
        this.celular = celular;
        this.email = email;
        this.usuario = nombreUsuario;
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    public Empleado(String nombre, String apellido, String direccion, Integer DNI, Date fecha_nac, String nacionalidad, String celular, String email, Usuario nombreUsuario, String cargo, Double sueldo, List<Ventas> lista_ventas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.DNI = DNI;
        this.fecha_nac = fecha_nac;
        this.nacionalidad = nacionalidad;
        this.celular = celular;
        this.email = email;
        this.usuario = nombreUsuario;
        this.cargo = cargo;
        this.sueldo = sueldo;
        this.lista_ventas = lista_ventas;
    }  

    public Empleado(Integer id_empleado, String nombre, String apellido, String direccion, Integer DNI, String nacionalidad, String celular, String email, String cargo, Double sueldo, Date fecha_nac, Usuario usuario, List<Ventas> lista_ventas) {
        this.id_empleado = id_empleado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.DNI = DNI;
        this.nacionalidad = nacionalidad;
        this.celular = celular;
        this.email = email;
        this.cargo = cargo;
        this.sueldo = sueldo;
        this.fecha_nac = fecha_nac;
        this.usuario = usuario;
        this.lista_ventas = lista_ventas;
    }
    
     public List<Ventas> getLista_ventas() {
        return lista_ventas;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }   

    public void setLista_ventas(List<Ventas> lista_ventas) {
        this.lista_ventas = lista_ventas;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Empleado{" + "id_empleado=" + id_empleado + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion + ", DNI=" + DNI + ", fecha_nac=" + fecha_nac + ", nacionalidad=" + nacionalidad + ", celular=" + celular + ", email=" + email + ", cargo=" + cargo + ", sueldo=" + sueldo + ", lista_ventas=" + lista_ventas + '}';
    }
}
