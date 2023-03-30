package org.example.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

@Entity
@Table(name="muestra")
public class Muestra {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idMuestra;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "codAnalisis")
    private String codAnalisis;
    @Column(name = "fechaCreacion")
    private Date fechaCreacion;
    @Column(name = "fechaModificacion")
    private Date fechaModificacion;
    @Column(name = "usuario")
    private String usuario;
    @Column(name = "resultado")
    private Boolean resultado;

    public Muestra() {
    }
    public Muestra(long idMuestra, String descripcion, String codAnalisis, String usuario) {
        this.idMuestra = idMuestra;
        this.descripcion = descripcion;
        this.codAnalisis = codAnalisis;
        this.fechaCreacion = new Date();
        this.usuario = usuario;
    }

    public long getIdMuestra() {
        return idMuestra;
    }

    public void setIdMuestra(long idMuestra) {
        this.idMuestra = idMuestra;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCodAnalisis() {
        return codAnalisis;
    }

    public void setCodAnalisis(String codAnalisis) {
        this.codAnalisis = codAnalisis;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Boolean getResultado() {
        return resultado;
    }

    public void setResultado(Boolean resultado) {
        this.resultado = resultado;
    }

    @Override
    public String toString() {
        return "Muestra{" +
                "idMuestra=" + idMuestra +
                ", descripcion='" + descripcion + '\'' +
                ", codAnalisis='" + codAnalisis + '\'' +
                ", resultado=" + resultado +
                '}';
    }
}
