
package modelo;

import java.util.Date;
import java.util.List;

public class Pelicula {
    private Integer idPelicula;

    private String nombre;

    private Integer duracionMinutos;

    private Date estreno;

    private List<Proyeccion> proyeccionesList;

    private String rutaImagen;

    public String getRutaImagen() {
        return rutaImagen;
    }

    public void setRutaImagen(String rutaImagen) {
        this.rutaImagen = rutaImagen;
    }

    public Pelicula() {
    }

    public Pelicula(Integer idPelicula, String nombre, Integer duracionMinutos, Date estreno,
            List<Proyeccion> proyeccionesList) {
        this.idPelicula = idPelicula;
        this.nombre = nombre;
        this.duracionMinutos = duracionMinutos;
        this.estreno = estreno;
        this.proyeccionesList = proyeccionesList;
    }

    public Pelicula(Integer idPelicula) {
        this.idPelicula = idPelicula;
    }

    public Integer getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(Integer idPelicula) {
        this.idPelicula = idPelicula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(Integer duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    public Date getEstreno() {
        return estreno;
    }

    public void setEstreno(Date estreno) {
        this.estreno = estreno;
    }

    public List<Proyeccion> getProyeccionesList() {
        return proyeccionesList;
    }

    public void setProyeccionesList(List<Proyeccion> proyeccionesList) {
        this.proyeccionesList = proyeccionesList;
    }

    public int hashCode() {
        int hash = 0;
        hash += (idPelicula != null ? idPelicula.hashCode() : 0);
        return hash;
    }

    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pelicula)) {
            return false;
        }
        Pelicula other = (Pelicula) object;
        if ((this.idPelicula == null && other.idPelicula != null)
                || (this.idPelicula != null && !this.idPelicula.equals(other.idPelicula))) {
            return false;
        }
        return true;
    }

    public String toString() {
        return "modelo.Peliculas[ idPelicula=" + idPelicula + " ]";
    }

}
