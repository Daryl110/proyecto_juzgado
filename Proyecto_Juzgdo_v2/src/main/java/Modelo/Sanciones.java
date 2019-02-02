/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Daryl
 */
@Entity
@Table(name = "sanciones")
@NamedQueries({
    @NamedQuery(name = "Sanciones.findAll", query = "SELECT s FROM Sanciones s")
    , @NamedQuery(name = "Sanciones.findById", query = "SELECT s FROM Sanciones s WHERE s.id = :id")
    , @NamedQuery(name = "Sanciones.findByFechaEjecutoria", query = "SELECT s FROM Sanciones s WHERE s.fechaEjecutoria = :fechaEjecutoria")
    , @NamedQuery(name = "Sanciones.findByDiasSancion", query = "SELECT s FROM Sanciones s WHERE s.diasSancion = :diasSancion")
    , @NamedQuery(name = "Sanciones.findByDiasCumplidos", query = "SELECT s FROM Sanciones s WHERE s.diasCumplidos = :diasCumplidos")
    , @NamedQuery(name = "Sanciones.findByDiasPendientes", query = "SELECT s FROM Sanciones s WHERE s.diasPendientes = :diasPendientes")})
public class Sanciones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "fechaEjecutoria")
    @Temporal(TemporalType.DATE)
    private Date fechaEjecutoria;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "diasSancion")
    private BigDecimal diasSancion;
    @Column(name = "diasCumplidos")
    private BigDecimal diasCumplidos;
    @Column(name = "diasPendientes")
    private BigDecimal diasPendientes;
    @JoinColumn(name = "situacionJuridica_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Situacionjuridica situacionJuridicaid;

    public Sanciones() {
    }

    public Sanciones(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFechaEjecutoria() {
        return fechaEjecutoria;
    }

    public void setFechaEjecutoria(Date fechaEjecutoria) {
        this.fechaEjecutoria = fechaEjecutoria;
    }

    public BigDecimal getDiasSancion() {
        return diasSancion;
    }

    public void setDiasSancion(BigDecimal diasSancion) {
        this.diasSancion = diasSancion;
    }

    public BigDecimal getDiasCumplidos() {
        return diasCumplidos;
    }

    public void setDiasCumplidos(BigDecimal diasCumplidos) {
        this.diasCumplidos = diasCumplidos;
    }

    public BigDecimal getDiasPendientes() {
        return diasPendientes;
    }

    public void setDiasPendientes(BigDecimal diasPendientes) {
        this.diasPendientes = diasPendientes;
    }

    public Situacionjuridica getSituacionJuridicaid() {
        return situacionJuridicaid;
    }

    public void setSituacionJuridicaid(Situacionjuridica situacionJuridicaid) {
        this.situacionJuridicaid = situacionJuridicaid;
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
        if (!(object instanceof Sanciones)) {
            return false;
        }
        Sanciones other = (Sanciones) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Controlador.Sanciones[ id=" + id + " ]";
    }
    
}
