
package modelo;

public class Entrada {

    private Integer idEntrada;

    private String asiento;

    private String codigoBarras;

    private Proyeccion idProyeccion;

    private Sala idSalas;

    public Entrada() {

    }

    public Entrada(Integer idEntrada) {
        this.idEntrada = idEntrada;
    }

    public Integer getIdEntrada() {
        return idEntrada;
    }

    public void setIdEntrada(Integer idEntrada) {
        this.idEntrada = idEntrada;
    }

    public String getAsiento() {
        return asiento;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public Proyeccion getIdProyeccion() {
        return idProyeccion;
    }

    public void setIdProyeccion(Proyeccion idProyeccion) {
        this.idProyeccion = idProyeccion;
    }

    public Sala getIdSalas() {
        return idSalas;
    }

    public void setIdSalas(Sala idSalas) {
        this.idSalas = idSalas;
    }

    public int hashCode() {
        int hash = 0;
        hash += (idEntrada != null ? idEntrada.hashCode() : 0);
        return hash;
    }

    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Entrada)) {
            return false;
        }
        Entrada other = (Entrada) object;
        if ((this.idEntrada == null && other.idEntrada != null)
                || (this.idEntrada != null && !this.idEntrada.equals(other.idEntrada))) {
            return false;
        }
        return true;
    }

    public String toString() {
        return "modelo.Entradas[ idEntrada=" + idEntrada + " ]";
    }

}
