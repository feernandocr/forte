package mx.forteinnovation.permisos.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;

import java.time.LocalDate;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PermisoRequest {

    @JsonProperty("idPermiso")
    private Integer idPermiso;

    @JsonProperty("nombreEmpleado")
    private String nombreEmpleado;

    @JsonProperty("apellidoEmpleado")
    private String apellidoEmpleado;

    @JsonProperty("tipoPermiso")
    private Integer tipoPermiso;

    @JsonProperty("fechaPermiso" )
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonSerialize(using = LocalDateSerializer.class)
    private LocalDate fechaPermiso;

    public Integer getIdPermiso() {
        return idPermiso;
    }

    public void setIdPermiso(Integer idPermiso) {
        this.idPermiso = idPermiso;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getApellidoEmpleado() {
        return apellidoEmpleado;
    }

    public void setApellidoEmpleado(String apellidoEmpleado) {
        this.apellidoEmpleado = apellidoEmpleado;
    }

    public Integer getTipoPermiso() {
        return tipoPermiso;
    }

    public void setTipoPermiso(Integer tipoPermiso) {
        this.tipoPermiso = tipoPermiso;
    }

    public LocalDate getFechaPermiso() {
        return fechaPermiso;
    }

    public void setFechaPermiso(LocalDate fechaPermiso) {
        this.fechaPermiso = fechaPermiso;
    }

    @Override
    public String toString() {
        return "PermisoRequest{" +
                "idPermiso=" + idPermiso +
                ", nombreEmpleado='" + nombreEmpleado + '\'' +
                ", apellidoEmpleado='" + apellidoEmpleado + '\'' +
                ", tipoPermiso=" + tipoPermiso +
                ", fechaPermiso=" + fechaPermiso +
                '}';
    }
}
