/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Daryl
 */
@Entity
@Table(name = "condiciones")
@NamedQueries({
    @NamedQuery(name = "Condiciones.findAll", query = "SELECT c FROM Condiciones c")
    , @NamedQuery(name = "Condiciones.findByIdcondiciones", query = "SELECT c FROM Condiciones c WHERE c.idcondiciones = :idcondiciones")
    , @NamedQuery(name = "Condiciones.findByDescripcion", query = "SELECT c FROM Condiciones c WHERE c.descripcion = :descripcion")})
public class Condiciones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcondiciones")
    private Integer idcondiciones;
    @Column(name = "descripcion")
    private String descripcion;
    @JoinColumn(name = "detenido_id_detenido_carcel", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Situacionjuridica detenidoIdDetenidoCarcel;

    public Condiciones() {
    }

    public Condiciones(Integer idcondiciones) {
        this.idcondiciones = idcondiciones;
    }

    public Integer getIdcondiciones() {
        return idcondiciones;
    }

    public void setIdcondiciones(Integer idcondiciones) {
        this.idcondiciones = idcondiciones;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Situacionjuridica getDetenidoIdDetenidoCarcel() {
        return detenidoIdDetenidoCarcel;
    }

    public void setDetenidoIdDetenidoCarcel(Situacionjuridica detenidoIdDetenidoCarcel) {
        this.detenidoIdDetenidoCarcel = detenidoIdDetenidoCarcel;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcondiciones != null ? idcondiciones.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Condiciones)) {
            return false;
        }
        Condiciones other = (Condiciones) object;
        if ((this.idcondiciones == null && other.idcondiciones != null) || (this.idcondiciones != null && !this.idcondiciones.equals(other.idcondiciones))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Controlador.Condiciones[ idcondiciones=" + idcondiciones + " ]";
    }
    
}
