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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Daryl
 */
@Entity
@Table(name = "elemento_tabla")
@NamedQueries({
    @NamedQuery(name = "ElementoTabla.findAll", query = "SELECT e FROM ElementoTabla e")
    , @NamedQuery(name = "ElementoTabla.findById", query = "SELECT e FROM ElementoTabla e WHERE e.id = :id")
    , @NamedQuery(name = "ElementoTabla.findByTipoElemento", query = "SELECT e FROM ElementoTabla e WHERE e.tipoElemento = :tipoElemento")
    , @NamedQuery(name = "ElementoTabla.findByElemento", query = "SELECT e FROM ElementoTabla e WHERE e.elemento = :elemento")
    , @NamedQuery(name = "ElementoTabla.findByDescripcion", query = "SELECT e FROM ElementoTabla e WHERE e.descripcion = :descripcion")
    , @NamedQuery(name = "ElementoTabla.findByTabla", query = "SELECT e FROM ElementoTabla e WHERE e.tabla = :tabla")})
public class ElementoTabla implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "tipo_elemento")
    private String tipoElemento;
    @Column(name = "elemento")
    private String elemento;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "tabla")
    private String tabla;

    public ElementoTabla() {
    }

    public ElementoTabla(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipoElemento() {
        return tipoElemento;
    }

    public void setTipoElemento(String tipoElemento) {
        this.tipoElemento = tipoElemento;
    }

    public String getElemento() {
        return elemento;
    }

    public void setElemento(String elemento) {
        this.elemento = elemento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTabla() {
        return tabla;
    }

    public void setTabla(String tabla) {
        this.tabla = tabla;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ElementoTabla)) {
            return false;
        }
        ElementoTabla other = (ElementoTabla) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Controlador.ElementoTabla[ id=" + id + " ]";
    }
    
}
