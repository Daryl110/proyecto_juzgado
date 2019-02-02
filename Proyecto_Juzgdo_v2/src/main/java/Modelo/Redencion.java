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
@Table(name = "redencion")
@NamedQueries({
    @NamedQuery(name = "Redencion.findAll", query = "SELECT r FROM Redencion r")
    , @NamedQuery(name = "Redencion.findById", query = "SELECT r FROM Redencion r WHERE r.id = :id")
    , @NamedQuery(name = "Redencion.findByFecha", query = "SELECT r FROM Redencion r WHERE r.fecha = :fecha")
    , @NamedQuery(name = "Redencion.findByHoras", query = "SELECT r FROM Redencion r WHERE r.horas = :horas")
    , @NamedQuery(name = "Redencion.findByCuaderno", query = "SELECT r FROM Redencion r WHERE r.cuaderno = :cuaderno")
    , @NamedQuery(name = "Redencion.findByFolio", query = "SELECT r FROM Redencion r WHERE r.folio = :folio")})
public class Redencion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "horas")
    private BigDecimal horas;
    @Column(name = "cuaderno")
    private Integer cuaderno;
    @Column(name = "folio")
    private Integer folio;
    @JoinColumn(name = "situacionJuridica", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Situacionjuridica situacionJuridica;

    public Redencion() {
    }

    public Redencion(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public BigDecimal getHoras() {
        return horas;
    }

    public void setHoras(BigDecimal horas) {
        this.horas = horas;
    }

    public Integer getCuaderno() {
        return cuaderno;
    }

    public void setCuaderno(Integer cuaderno) {
        this.cuaderno = cuaderno;
    }

    public Integer getFolio() {
        return folio;
    }

    public void setFolio(Integer folio) {
        this.folio = folio;
    }

    public Situacionjuridica getSituacionJuridica() {
        return situacionJuridica;
    }

    public void setSituacionJuridica(Situacionjuridica situacionJuridica) {
        this.situacionJuridica = situacionJuridica;
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
        if (!(object instanceof Redencion)) {
            return false;
        }
        Redencion other = (Redencion) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Controlador.Redencion[ id=" + id + " ]";
    }
    
}
