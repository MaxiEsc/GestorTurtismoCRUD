package logica;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Usuario implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_Usuario")
     Integer id_Usuario;
    @Basic
     String nombre;
     String contrasenia;

    public Usuario() {
    }

    public Usuario(Integer id_Usuario, String nombre, String contrasenia) {
        this.id_Usuario = id_Usuario;
        this.nombre = nombre;
        this.contrasenia = contrasenia;
    }    

    public Usuario(String nombre, String contrasenia) {
        this.nombre = nombre;
        this.contrasenia = contrasenia;        
    }

    public Integer getId_Usuario() {
        return id_Usuario;
    }

    public void setId_Usuario(Integer id_Usuario) {
        this.id_Usuario = id_Usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id Usuario: " + id_Usuario + ", Nombre: " + nombre + ", contrasenia: " + contrasenia + '}';
    }
    
    
    
}