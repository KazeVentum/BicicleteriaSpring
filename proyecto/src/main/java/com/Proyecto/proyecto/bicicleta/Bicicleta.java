package com.Proyecto.proyecto.bicicleta;

import com.Proyecto.proyecto.mantenimiento.Mantenimiento;
import jakarta.persistence.*;

@Entity
public class Bicicleta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "numero_Del_marco", nullable = false)
    private String numeroDelMarco;
    @Column(name = "marca", nullable = false)
    private String marca;

    @OneToOne(mappedBy ="bicicleta", cascade = CascadeType.ALL) // A cualquier MappedBy se debe colocar el Cascade para que se pueda eliminar.
    private Mantenimiento mantenimiento;

    public Bicicleta() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumeroDelMarco() {
        return numeroDelMarco;
    }

    public void setNumeroDelMarco(String numeroDelMarco) {
        this.numeroDelMarco = numeroDelMarco;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Mantenimiento getMantenimiento() {
        return mantenimiento;
    }

    public void setMantenimiento(Mantenimiento mantenimiento) {
        this.mantenimiento = mantenimiento;
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "id=" + id +
                ", numeroDelMarco='" + numeroDelMarco + '\'' +
                ", marca='" + marca + '\'' +
//                ", mantenimiento=" + mantenimiento.getId() +
                '}';
    }
}
