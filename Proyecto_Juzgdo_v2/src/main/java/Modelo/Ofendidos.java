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
@Table(name = "ofendidos")
@NamedQueries({
    @NamedQuery(name = "Ofendidos.findAll", query = "SELECT o FROM Ofendidos o")
    , @NamedQuery(name = "Ofendidos.findByIdOfendidos", query = "SELECT o FROM Ofendidos o WHERE o.idOfendidos = :idOfendidos")
    , @NamedQuery(name = "Ofendidos.findByDescripcion", query = "SELECT o FROM Ofendidos o WHERE o.descripcion = :descripcion")})
public class Ofendidos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idOfendidos")
    private Integer idOfendidos;
    @Basic(optional = false)
    @Column(name = "descripcion")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ofendido")
    private List<Procesos> procesosList;

    public Ofendidos() {
    }

    public Ofendidos(Integer idOfendidos) {
        this.idOfendidos = idOfendidos;
    }

    public Ofendidos(Integer idOfendidos, String descripcion) {
        this.idOfendidos = idOfendidos;
        this.descripcion = descripcion;
    }

    public Ofendidos(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public Integer getIdOfendidos() {
        return idOfendidos;
    }

    public void setIdOfendidos(Integer idOfendidos) {
        this.idOfendidos = idOfendidos;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idOfendidos != null ? idOfendidos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ofendidos)) {
            return false;
        }
        Ofendidos other = (Ofendidos) object;
        if ((this.idOfendidos == null && other.idOfendidos != null) || (this.idOfendidos != null && !this.idOfendidos.equals(other.idOfendidos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Controlador.Ofendidos[ idOfendidos=" + idOfendidos + " ]";
    }
    
}
