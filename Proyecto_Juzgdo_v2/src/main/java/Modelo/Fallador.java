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
@Table(name = "fallador")
@NamedQueries({
    @NamedQuery(name = "Fallador.findAll", query = "SELECT f FROM Fallador f")
    , @NamedQuery(name = "Fallador.findByIdFallador", query = "SELECT f FROM Fallador f WHERE f.idFallador = :idFallador")
    , @NamedQuery(name = "Fallador.findByDescripcion", query = "SELECT f FROM Fallador f WHERE f.descripcion = :descripcion")})
public class Fallador implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idFallador")
    private Integer idFallador;
    @Column(name = "descripcion")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fallador1")
    private List<Procesos> procesosList;
    @OneToMany(mappedBy = "fallador2")
    private List<Procesos> procesosList1;

    public Fallador() {
    }

    public Fallador(Integer idFallador) {
        this.idFallador = idFallador;
    }

    public Fallador(String descripcion) {
        this.descripcion = descripcion;
    }

    public Fallador(Integer idFallador, String descripcion) {
        this.idFallador = idFallador;
        this.descripcion = descripcion;
    }

    public Integer getIdFallador() {
        return idFallador;
    }

    public void setIdFallador(Integer idFallador) {
        this.idFallador = idFallador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Procesos> getProcesosList() {
        return procesosList;
    }

    public void setProcesosList(List<Procesos> procesosList) {
        this.procesosList = procesosList;
    }

    public List<Procesos> getProcesosList1() {
        return procesosList1;
    }

    public void setProcesosList1(List<Procesos> procesosList1) {
        this.procesosList1 = procesosList1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFallador != null ? idFallador.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fallador)) {
            return false;
        }
        Fallador other = (Fallador) object;
        if ((this.idFallador == null && other.idFallador != null) || (this.idFallador != null && !this.idFallador.equals(other.idFallador))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Controlador.Fallador[ idFallador=" + idFallador + " ]";
    }
    
}
