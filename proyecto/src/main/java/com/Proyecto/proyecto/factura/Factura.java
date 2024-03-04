package com.Proyecto.proyecto.factura;

import com.Proyecto.proyecto.cliente.Cliente;
import com.Proyecto.proyecto.mantenimiento.Mantenimiento;
import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Factura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinColumn(name="cliente_id", nullable = false)
    @ManyToOne(fetch = FetchType.EAGER)
    private Cliente cliente;

    @Column(name = "fecha", nullable = false)
    private LocalDate fecha;

    @Column(name = "total_pagar", nullable = true)
    private double totalPagar;

    @JoinColumn(name="mantenimiento_id", nullable = true)
    @ManyToOne(fetch = FetchType.EAGER)
    private Mantenimiento mantenimiento;


    public Factura() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public double getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(double totalPagar) {
        this.totalPagar = totalPagar;
    }

    public Mantenimiento getMantenimiento() {
        return mantenimiento;
    }

    public void setMantenimiento(Mantenimiento mantenimiento) {
        this.mantenimiento = mantenimiento;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "id=" + id +
                ", cliente=" + cliente +
                ", fecha=" + fecha +
                ", totalPagar=" + totalPagar +
                ", mantenimiento=" + mantenimiento +
                '}';
    }
}
