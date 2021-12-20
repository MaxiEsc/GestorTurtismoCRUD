
package persistencia;

import java.util.List;
import logica.*;
import persistencia.exceptions.NonexistentEntityException;

public class ControladoraPersistencia {
    
    ClienteJpaController cliente_jpa = new ClienteJpaController();
    EmpleadoJpaController empleado_jpa = new EmpleadoJpaController();
    PaqueteTuristicoJpaController paquete_jpa = new PaqueteTuristicoJpaController();
    ServicioTuristicoJpaController servicio_jpa = new ServicioTuristicoJpaController();
    VentasJpaController ventas_jpa = new VentasJpaController();
    UsuarioJpaController usuario_jpa = new UsuarioJpaController();
    
    public void crearCliente(Cliente nuevo){
        
        cliente_jpa.create(nuevo);  
        
    }
    
    public void borrarCliente(Cliente nuevo){
        try {
            cliente_jpa.destroy(nuevo.getId_empleado());
        } catch (NonexistentEntityException e) {
            e.printStackTrace(System.out);
        }
    }
    public void borrarCliente(Integer id){
        try {
            
            cliente_jpa.destroy(id);
            
        } catch (NonexistentEntityException e) {
            e.printStackTrace(System.out);
        }
    }
    
    public void editarCliente(Cliente nuevo){
        try {
            
            cliente_jpa.edit(nuevo);
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }
    
    public List<Cliente> traerClientes(){
        
        return cliente_jpa.findClienteEntities();
    }
    
    //__________________________________________________
    
    public void crearEmpleado(Empleado nuevo,Usuario usuario){
        usuario_jpa.create(usuario); 
        empleado_jpa.create(nuevo);        
    }
    
    public void borrarEmpleado(Empleado nuevo,Usuario usuario){
        try {
            usuario_jpa.destroy(usuario.getId_Usuario());
            empleado_jpa.destroy(nuevo.getId_empleado());
        } catch (NonexistentEntityException e) {
            e.printStackTrace(System.out);
        }
    }
    
     public void borrarEmpleado(Integer id){
        try {
            empleado_jpa.destroy(id);
            usuario_jpa.destroy(id-1);
        } catch (NonexistentEntityException e) {
            e.printStackTrace(System.out);
        }
    }
    
    public void editarEmpleado(Empleado nuevo, Usuario usuario){
        try {
            usuario_jpa.edit(usuario);
            empleado_jpa.edit(nuevo);
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }
        
    public List<Empleado> traerEmpleados(){
        return empleado_jpa.findEmpleadoEntities();
    }
    
    public List<Usuario> traerUsuarios(){
        return usuario_jpa.findUsuarioEntities();
    }
    
    public Empleado buscarEmpleador(Integer id){
        return empleado_jpa.findEmpleado(id);
    }
    
    //___________________________________________________
    
    public void crearPaqueteTuristico(PaqueteTuristico nuevo){
        
        paquete_jpa.create(nuevo);        
    }
    
    public void borrarPaqueteTuristico(PaqueteTuristico nuevo){
        try {
            
            
            paquete_jpa.destroy(nuevo.getCodigo_paquete());
        } catch (NonexistentEntityException e) {
            e.printStackTrace(System.out);
        }
    }
    
     public void borrarPaqueteTuristico(Integer id){
        try {
            paquete_jpa.destroy(id);
        } catch (NonexistentEntityException e) {
            e.printStackTrace(System.out);
        }
    }
    
    public void editarPaqueteTuristico(PaqueteTuristico nuevo){
        try {
            paquete_jpa.edit(nuevo);
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }
    
    public PaqueteTuristico encontrarPaqueteTuristico(PaqueteTuristico nuevo){
        return paquete_jpa.findPaqueteTuristico(nuevo.getCodigo_paquete());
    }
    
    public List<PaqueteTuristico> traerPaqueteTuristico(){
        return paquete_jpa.findPaqueteTuristicoEntities();
    }
    
    //_________________________________________________________
            
    public void crearServicioTuristico(ServicioTuristico nuevo){
        
        servicio_jpa.create(nuevo);        
    }
    
    public void borrarServicioTuristico(ServicioTuristico nuevo){
        try {
            servicio_jpa.destroy(nuevo.getCodigo());
        } catch (NonexistentEntityException e) {
            e.printStackTrace(System.out);
        }
    }
    
     public void borrarServicioTuristico(Integer id){
        try {
            servicio_jpa.destroy(id);
        } catch (NonexistentEntityException e) {
            e.printStackTrace(System.out);
        }
    }
    
    public void editarServicioTuristico(ServicioTuristico nuevo){
        try {
            servicio_jpa.edit(nuevo);
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }
    
    public List<ServicioTuristico> traerServicioTuristico(){
        return servicio_jpa.findServicioTuristicoEntities();
    }
    
    //____________________________________________________________
    

    public void borrarUsuario(Usuario nuevo){
        try {
            usuario_jpa.destroy(nuevo.getId_Usuario());
        } catch (NonexistentEntityException e) {
            e.printStackTrace(System.out);
        }
    }
    
     public void borrarUsuario(Integer id){
        try {
            usuario_jpa.destroy(id);
        } catch (NonexistentEntityException e) {
            e.printStackTrace(System.out);
        }
    }
    
    public void editarUsuario(Usuario nuevo){
        try {
            usuario_jpa.edit(nuevo);
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }
    
    //__________________________________________________________
    
    public void crearVentas(Ventas nuevo){
        
        ventas_jpa.create(nuevo);        
    }
    
    public void borrarVentas(Ventas nuevo){
        try {
            ventas_jpa.destroy(nuevo.getNum_ventas());
        } catch (NonexistentEntityException e) {
            e.printStackTrace(System.out);
        }
    }
    
    public void borrarVentas(Integer id){
        try {
            ventas_jpa.destroy(id);
        } catch (NonexistentEntityException e) {
            e.printStackTrace(System.out);
        }
    }
    
    public void editarVentas(Ventas nuevo){
        try {
            ventas_jpa.edit(nuevo);
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }
    
    public Ventas encontrarVentas(Ventas nuevo){
        return ventas_jpa.findVentas(nuevo.getNum_ventas());
    }
    
    public List<Ventas> traerVentas(){
        return ventas_jpa.findVentasEntities();
    }
    
}
