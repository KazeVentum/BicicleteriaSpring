package com.Proyecto.proyecto.mantenimiento;
import com.Proyecto.proyecto.bicicleta.Bicicleta;
import com.Proyecto.proyecto.factura.Factura;
import jakarta.persistence.*;
import java.util.List;

@Entity
public class Mantenimiento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="tipo_mantenimiento", nullable = false)
    private String tipoMantenimiento;

    @JoinColumn(name = "bicicleta_id", nullable = false)
    @OneToOne(fetch = FetchType.EAGER)
    private Bicicleta bicicleta;

    @Column(name="precio", nullable = false)
    private double precio;

    @OneToMany(mappedBy = "mantenimiento", cascade = CascadeType.ALL)
    private List<Factura> facturas;


    public Mantenimiento() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipoMantenimiento() {
        return tipoMantenimiento;
    }

    public void setTipoMantenimiento(String tipoMantenimiento) {
        this.tipoMantenimiento = tipoMantenimiento;
    }

    public Bicicleta getBicicleta() {
        return bicicleta;
    }

    public void setBicicleta(Bicicleta bicicleta) {
        this.bicicleta = bicicleta;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Mantenimiento{" +
                "id=" + id +
                ", tipoMantenimiento='" + tipoMantenimiento + '\'' +
                ", bicicleta=" + bicicleta +
                ", precio=" + precio +
                '}';
    }
}
