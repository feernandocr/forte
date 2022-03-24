package mx.forteinnovation.permisos.model.entity;

import org.springframework.data.jpa.domain.AbstractAuditable;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;
import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "tipo_permiso")
public class TipoPermisoEntity  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo_permiso", nullable = false)
    private Integer idTipoPermiso;

    @Column(name = "descripcion", nullable = false, length = 400)
    private String descripcion;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getId1() {
        return idTipoPermiso;
    }

    public void setId1(Integer id1) {
        this.idTipoPermiso = id1;
    }
}