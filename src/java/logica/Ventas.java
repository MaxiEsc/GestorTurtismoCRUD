package logica;

import java.io.Serializable;
import java.util.*;
import javax.persistence.*;

@Entity
public class Ventas implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "num_ventas")
      Integer num_ventas;
    @Basic
      Date fecha_venta;
      String medio_pago;

    public Ventas() {
    }

    public Ventas(Date fecha_venta, String medio_pago) {
        this.fecha_venta = fecha_venta;
        this.medio_pago = medio_pago;
    }

    public Ventas(Integer num_ventas, Date fecha_venta, String medio_pago) {
        this.num_ventas = num_ventas;
        this.fecha_venta = fecha_venta;
        this.medio_pago = medio_pago;
    }
    
    
    
    public Integer getNum_ventas() {
        return num_ventas;
    }

    public void setNum_ventas(Integer num_ventas) {
        this.num_ventas = num_ventas;
    }

    public Date getFecha_venta() {
        return fecha_venta;
    }

    public void setFecha_venta(Date fecha_venta) {
        this.fecha_venta = fecha_venta;
    }

    public String getMedio_pago() {
        return medio_pago;
    }

    public void setMedio_pago(String medio_pago) {
        this.medio_pago = medio_pago;
    }

    @Override
    public String toString() {
        return "Ventas{" + "num_ventas=" + num_ventas + ", fecha_venta=" + fecha_venta + ", medio_pago=" + medio_pago + '}';
    }
    
     

}