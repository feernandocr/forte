package mx.forteinnovation.permisos.model.entity;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "permiso", indexes = {
        @Index(name = "tipoPermiso_idx", columnList = "tipo_permiso")
})
public class PermisoEntity  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_permiso", nullable = false)
    private Integer idPermiso;

    @Column(name = "nombre_empleado", nullable = false, length = 300)
    private String nombreEmpleado;

    @Column(name = "apellido_empleado", nullable = false, length = 300)
    private String apellidoEmpleado;

    @ManyToOne(optional = false, cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    @JoinColumn(name = "tipo_permiso", nullable = false)
    private TipoPermisoEntity tipoPermiso;

    @Column(name = "fecha_permiso", nullable = false)
    private LocalDate fechaPermiso;

    public PermisoEntity() {
    }

    public PermisoEntity(String nombreEmpleado, String apellidoEmpleado, TipoPermisoEntity tipoPermiso, LocalDate fechaPermiso) {
        this.nombreEmpleado = nombreEmpleado;
        this.apellidoEmpleado = apellidoEmpleado;
        this.tipoPermiso = tipoPermiso;
        this.fechaPermiso = fechaPermiso;
    }

    public LocalDate getFechaPermiso() {
        return fechaPermiso;
    }

    public void setFechaPermiso(LocalDate fechaPermiso) {
        this.fechaPermiso = fechaPermiso;
    }

    public TipoPermisoEntity getTipoPermiso() {

        return tipoPermiso;
    }

    public void setTipoPermiso(TipoPermisoEntity tipoPermiso) {
        this.tipoPermiso = tipoPermiso;
    }

    public String getApellidoEmpleado() {
        return apellidoEmpleado;
    }

    public void setApellidoEmpleado(String apellidoEmpleado) {
        this.apellidoEmpleado = apellidoEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public Integer getIdPermiso() {
        return idPermiso;
    }

    public void setIdPermiso(Integer idPermiso) {
        this.idPermiso = idPermiso;
    }
}