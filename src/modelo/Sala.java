
package modelo;

import java.util.List;

public class Sala {

    private Integer idSalas;

    private Integer aforo;

    private List<Entrada> entradasList;

    private List<Proyeccion> proyeccionesList;

    public Sala() {
    }

    public Sala(Integer idSalas) {
        this.idSalas = idSalas;
    }

    public Integer getIdSalas() {
        return idSalas;
    }

    public void setIdSalas(Integer idSalas) {
        this.idSalas = idSalas;
    }

    public Integer getAforo() {
        return aforo;
    }

    public void setAforo(Integer aforo) {
        this.aforo = aforo;
    }

    public List<Entrada> getEntradasList() {
        return entradasList;
    }

    public void setEntradasList(List<Entrada> entradasList) {
        this.entradasList = entradasList;
    }

    public List<Proyeccion> getProyeccionesList() {
        return proyeccionesList;
    }

    public void setProyeccionesList(List<Proyeccion> proyeccionesList) {
        this.proyeccionesList = proyeccionesList;
    }

    public int hashCode() {
        int hash = 0;
        hash += (idSalas != null ? idSalas.hashCode() : 0);
        return hash;
    }

    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sala)) {
            return false;
        }
        Sala other = (Sala) object;
        if ((this.idSalas == null && other.idSalas != null)
                || (this.idSalas != null && !this.idSalas.equals(other.idSalas))) {
            return false;
        }
        return true;
    }

    public String toString() {
        return "modelo.Salas[ idSalas=" + idSalas + " ]";
    }

}
