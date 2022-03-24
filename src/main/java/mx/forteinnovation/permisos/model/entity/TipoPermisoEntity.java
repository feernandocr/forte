package mx.forteinnovation.permisos.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "TipoPermiso")
public class TipoPermisoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idTipoPermiso", nullable = false)
    private Integer id;

    @Column(name = "descripcion", nullable = false, length = 400)
    private String descripcion;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}