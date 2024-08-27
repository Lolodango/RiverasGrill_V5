package com.Riveras.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data //especificar que es una capa de datos 
@Entity //Esta clase esta enlazada a una tabla en la bd
@Table(name = "producto") //Especificar cual entidad

public class Producto implements Serializable {

    private static final long serialVersionUID = 1L; //Autoincremento en java

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")

    private Long idProducto;
    private String detalle;
    private int existencias;
    private double precio;
    private String descripcion;
    private String rutaImagen;
    private boolean activo;

    //private long idCategoria;
    @ManyToOne
    @JoinColumn(name = "id_categoria")
    Categoria categoria;

    public Producto() {
    }

    public Producto(String categoria, boolean activo) {
        this.descripcion = categoria;
        this.activo = activo;
    }

}
