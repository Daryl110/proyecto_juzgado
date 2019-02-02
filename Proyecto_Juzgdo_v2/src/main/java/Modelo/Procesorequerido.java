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
@Table(name = "procesorequerido")
@NamedQueries({
    @NamedQuery(name = "Procesorequerido.findAll", query = "SELECT p FROM Procesorequerido p")
    , @NamedQuery(name = "Procesorequerido.findById", query = "SELECT p FROM Procesorequerido p WHERE p.id = :id")})
public class Procesorequerido implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @JoinColumn(name = "Procesos_NI", referencedColumnName = "NI")
    @ManyToOne(optional = false)
    private Procesos procesosNI;
    @JoinColumn(name = "pena_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Pena penaId;

    public Procesorequerido() {
    }

    public Procesorequerido(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Procesos getProcesosNI() {
        return procesosNI;
    }

    public void setProcesosNI(Procesos procesosNI) {
        this.procesosNI = procesosNI;
    }

    public Pena getPenaId() {
        return penaId;
    }

    public void setPenaId(Pena penaId) {
        this.penaId = penaId;
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
        if (!(object instanceof Procesorequerido)) {
            return false;
        }
        Procesorequerido other = (Procesorequerido) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Controlador.Procesorequerido[ id=" + id + " ]";
    }
    
}
