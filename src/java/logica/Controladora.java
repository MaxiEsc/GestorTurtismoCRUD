package logica;

import java.util.*;
import persistencia.ControladoraPersistencia;

public class Controladora {

    ControladoraPersistencia ctrl = new ControladoraPersistencia();

    public List<Usuario> mostrarUsuarios() {
        return ctrl.traerUsuarios();
    }

    public boolean controlUser(String nombre, String contrasenia) {
        List<Usuario> usuarios = mostrarUsuarios();
        boolean bandera = false;
        int i = 0;
        while (i < usuarios.size() && bandera == false) {
            bandera = (usuarios.get(i).nombre.equals(nombre) && usuarios.get(i).contrasenia.equals(contrasenia));
            i++;
        }
        return bandera;
    }

    //___________________________________________________________
    public void crearVenta(Date fecha_venta, String medio_pago) {
        ctrl.crearVentas(new Ventas(fecha_venta, medio_pago));
    }

    public void actualizarVenta(Integer id, Date fecha_venta, String medio_pago) {
        ctrl.editarVentas(new Ventas(id, fecha_venta, medio_pago));
    }

    public void borrarVenta(Integer id) {
        ctrl.borrarVentas(id);
    }

    public List<Ventas> mostrarVentas() {
        return ctrl.traerVentas();
    }

    public boolean controlVentas(Integer id) {
        List<Ventas> ventas = mostrarVentas();
        boolean bandera = false;
        int i = 0;
        while (i < ventas.size() && bandera == false) {
            bandera = (ventas.get(i).num_ventas.equals(id));
            i++;
        }
        return bandera;
    }

    public Integer buscarVenta(Date fecha_venta, String medio_pago) {
        List<Ventas> venta = ctrl.traerVentas();
        boolean bandera = false;
        int i = 0;
        Integer id = -1;
        while (i < venta.size() && bandera) {

            if (venta.get(i).fecha_venta.equals(fecha_venta)
                    && venta.get(i).medio_pago.equals(medio_pago)) {
                bandera = true;
                id = venta.get(i).num_ventas;
            }
            i++;
        }
        return id;
    }

    //___________________________________________________________
    public void crearServicio(String nombre, String descripcion_breve, String destino_servicio, Double costo, Date fecha_servicio) {
        ctrl.crearServicioTuristico(new ServicioTuristico(nombre, descripcion_breve, destino_servicio, costo, fecha_servicio));
    }

    public void actualizarServicio(Integer id, String nombre, String descripcion_breve, String destino_servicio, Double costo, Date fecha_servicio) {
        ctrl.editarServicioTuristico(new ServicioTuristico(id, nombre, descripcion_breve, destino_servicio, costo, fecha_servicio));
    }

    public void borrarServicio(Integer id) {
        ctrl.borrarServicioTuristico(id);
    }

    public List<ServicioTuristico> mostrarServicios() {
        return ctrl.traerServicioTuristico();
    }

    public boolean controlServicio(Integer id) {
        List<ServicioTuristico> servicio = mostrarServicios();
        boolean bandera = false;
        int i = 0;
        while (i < servicio.size() && bandera == false) {
            bandera = (servicio.get(i).codigo.equals(id));
            i++;
        }
        return bandera;
    }

    //__________________________________________________________
    public void crearPaquete(PaqueteTuristico nuevo) {

        ctrl.crearPaqueteTuristico(nuevo);
    }

    public void actualizarPaquete(PaqueteTuristico nuevo) {

        ctrl.editarPaqueteTuristico(nuevo);
    }

    public void borrarPaquete(Integer id) {
        ctrl.borrarPaqueteTuristico(id);
    }

    public List<PaqueteTuristico> mostrarPaquete() {
        return ctrl.traerPaqueteTuristico();
    }

    public boolean controlPaquete(Integer id) {
        List<PaqueteTuristico> paquete = mostrarPaquete();
        boolean bandera = false;
        int i = 0;
        while (i < paquete.size() && bandera == false) {
            bandera = (paquete.get(i).codigo_paquete.equals(id));
            i++;
        }
        return bandera;
    }

    //__________________________________________________________
    public void crearEmpleado(Empleado nuevo, String nombreUsuario, String contrasenia) {
        Usuario aux = new Usuario(nombreUsuario, contrasenia);
        nuevo.setUsuario(aux);
        ctrl.crearEmpleado(nuevo, aux);
    }

    public void actualizarEmpleado(Empleado nuevo, Usuario aux) {

        ctrl.editarEmpleado(nuevo, aux);
    }

    public void borrarEmpleado(Integer id) {

        ctrl.borrarEmpleado(id);
    }

    public List<Empleado> mostrarEmpleados() {
        return ctrl.traerEmpleados();
    }

    public boolean existeEmpleado(Integer id) {
        List<Empleado> empleados = ctrl.traerEmpleados();
        int i = 0;
        boolean esta = false;
        while (i < empleados.size() && esta == false) {
            if (empleados.get(i).id_empleado.equals(id)) {
                esta = true;
            }
            i++;
        }
        return esta;
    }

    public Usuario existeUsuarioEmpleado(Empleado nuevo) {
        Usuario aux = nuevo.usuario;

        return aux;
    }

    public Empleado buscarEmpleadoporID(Integer id) {
        return ctrl.buscarEmpleador(id);
    }

    //________________________________________________________________________
    public void crearCliente(Cliente nuevo) {

        ctrl.crearCliente(nuevo);
    }

    public void actualizarCliente(Cliente nuevo) {

        ctrl.editarCliente(nuevo);
    }

    public void borrarCliente(Integer id) {

        ctrl.borrarCliente(id);
    }

    public boolean existeCliente(Integer id) {
        List<Cliente> clientes = ctrl.traerClientes();
        int i = 0;
        boolean esta = false;
        while (i < clientes.size() && esta == false) {
            if (clientes.get(i).id_empleado.equals(id)) {
                esta = true;
            }
            i++;
        }
        return esta;
    }

    public List<Cliente> mostrarCliente() {
        return ctrl.traerClientes();
    }

    //_________________________________________
    public boolean existeCuentaUsuario(String nombre, String contrasenia) {

        List<Usuario> usuarios = ctrl.traerUsuarios();
        int i = 0;
        boolean esta = false;
        while (i < usuarios.size() && esta == false) {
            if (usuarios.get(i).nombre.equals(nombre) && usuarios.get(i).contrasenia.equals(contrasenia)) {
                esta = true;
            }
            i++;
        }
        return esta;
    }

    public Integer existeUsuarioid(String nombre, String contrasenia) {
        List<Usuario> usuarios = ctrl.traerUsuarios();
        int i = 0;
        boolean esta = false;
        Integer pId = 1;
        while (i < usuarios.size() && esta == false) {
            if (usuarios.get(i).nombre.equals(nombre) && usuarios.get(i).contrasenia.equals(contrasenia)) {
                esta = true;
                pId = i;
            }
            i++;
        }
        return pId;
    }

}
