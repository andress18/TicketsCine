
package modelo;

import java.util.Date;
import java.util.List;

public class Proyeccion {

    private Integer idProyeccion;

    private Date fechaHora;

    private Integer numAsientos;

    private List<Entrada> entradasList;

    private Pelicula idPelicula;

    private Sala idSalas;

    public Proyeccion() {
    }

    public Proyeccion(Integer idProyeccion) {
        this.idProyeccion = idProyeccion;
    }

    public Integer getIdProyeccion() {
        return idProyeccion;
    }

    public void setIdProyeccion(Integer idProyeccion) {
        this.idProyeccion = idProyeccion;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public Integer getNumAsientos() {
        return numAsientos;
    }

    public void setNumAsientos(Integer numAsientos) {
        this.numAsientos = numAsientos;
    }

    public List<Entrada> getEntradasList() {
        return entradasList;
    }

    public void setEntradasList(List<Entrada> entradasList) {
        this.entradasList = entradasList;
    }

    public Pelicula getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(Pelicula idPelicula) {
        this.idPelicula = idPelicula;
    }

    public Sala getIdSalas() {
        return idSalas;
    }

    public void setIdSalas(Sala idSalas) {
        this.idSalas = idSalas;
    }

    public int hashCode() {
        int hash = 0;
        hash += (idProyeccion != null ? idProyeccion.hashCode() : 0);
        return hash;
    }

    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Proyeccion)) {
            return false;
        }
        Proyeccion other = (Proyeccion) object;
        if ((this.idProyeccion == null && other.idProyeccion != null)
                || (this.idProyeccion != null && !this.idProyeccion.equals(other.idProyeccion))) {
            return false;
        }
        return true;
    }

    public String toString() {
        return "modelo.Proyecciones[ idProyeccion=" + idProyeccion + " ]";
    }

}
