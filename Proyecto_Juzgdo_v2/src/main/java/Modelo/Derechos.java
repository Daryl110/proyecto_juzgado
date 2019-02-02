/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Daryl
 */
@Entity
@Table(name = "derechos")
@NamedQueries({
    @NamedQuery(name = "Derechos.findAll", query = "SELECT d FROM Derechos d")
    , @NamedQuery(name = "Derechos.findByIdDerechos", query = "SELECT d FROM Derechos d WHERE d.idDerechos = :idDerechos")
    , @NamedQuery(name = "Derechos.findByDescripcion", query = "SELECT d FROM Derechos d WHERE d.descripcion = :descripcion")})
public class Derechos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idDerechos")
    private Integer idDerechos;
    @Column(name = "descripcion")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "derechoPrincipal")
    private List<Tutelas> tutelasList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "derechosidDerechos")
    private List<TutelasDerechos> tutelasDerechosList;

    public Derechos() {
    }

    public Derechos(Integer idDerechos) {
        this.idDerechos = idDerechos;
    }

    public Integer getIdDerechos() {
        return idDerechos;
    }

    public void setIdDerechos(Integer idDerechos) {
        this.idDerechos = idDerechos;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Tutelas> getTutelasList() {
        return tutelasList;
    }

    public void setTutelasList(List<Tutelas> tutelasList) {
        this.tutelasList = tutelasList;
    }

    public List<TutelasDerechos> getTutelasDerechosList() {
        return tutelasDerechosList;
    }

    public void setTutelasDerechosList(List<TutelasDerechos> tutelasDerechosList) {
        this.tutelasDerechosList = tutelasDerechosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDerechos != null ? idDerechos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Derechos)) {
            return false;
        }
        Derechos other = (Derechos) object;
        if ((this.idDerechos == null && other.idDerechos != null) || (this.idDerechos != null && !this.idDerechos.equals(other.idDerechos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Controlador.Derechos[ idDerechos=" + idDerechos + " ]";
    }
    
}
