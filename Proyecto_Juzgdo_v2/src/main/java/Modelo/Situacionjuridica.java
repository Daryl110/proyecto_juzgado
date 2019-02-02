/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Daryl
 */
@Entity
@Table(name = "situacionjuridica")
@NamedQueries({
    @NamedQuery(name = "Situacionjuridica.findAll", query = "SELECT s FROM Situacionjuridica s")
    , @NamedQuery(name = "Situacionjuridica.findById", query = "SELECT s FROM Situacionjuridica s WHERE s.id = :id")
    , @NamedQuery(name = "Situacionjuridica.findByFechaCaptura", query = "SELECT s FROM Situacionjuridica s WHERE s.fechaCaptura = :fechaCaptura")
    , @NamedQuery(name = "Situacionjuridica.findByDiasDetencion", query = "SELECT s FROM Situacionjuridica s WHERE s.diasDetencion = :diasDetencion")
    , @NamedQuery(name = "Situacionjuridica.findByCarcel", query = "SELECT s FROM Situacionjuridica s WHERE s.carcel = :carcel")
    , @NamedQuery(name = "Situacionjuridica.findByDiasPrivacion", query = "SELECT s FROM Situacionjuridica s WHERE s.diasPrivacion = :diasPrivacion")
    , @NamedQuery(name = "Situacionjuridica.findByLugarCumplimiento", query = "SELECT s FROM Situacionjuridica s WHERE s.lugarCumplimiento = :lugarCumplimiento")
    , @NamedQuery(name = "Situacionjuridica.findByObservaciones", query = "SELECT s FROM Situacionjuridica s WHERE s.observaciones = :observaciones")
    , @NamedQuery(name = "Situacionjuridica.findByFolio", query = "SELECT s FROM Situacionjuridica s WHERE s.folio = :folio")
    , @NamedQuery(name = "Situacionjuridica.findByTipo", query = "SELECT s FROM Situacionjuridica s WHERE s.tipo = :tipo")
    , @NamedQuery(name = "Situacionjuridica.findByEstado", query = "SELECT s FROM Situacionjuridica s WHERE s.estado = :estado")
    , @NamedQuery(name = "Situacionjuridica.findByFechaFinalizacion", query = "SELECT s FROM Situacionjuridica s WHERE s.fechaFinalizacion = :fechaFinalizacion")
    , @NamedQuery(name = "Situacionjuridica.findByFechaExtincion", query = "SELECT s FROM Situacionjuridica s WHERE s.fechaExtincion = :fechaExtincion")
    , @NamedQuery(name = "Situacionjuridica.findByDiasTotales", query = "SELECT s FROM Situacionjuridica s WHERE s.diasTotales = :diasTotales")
    , @NamedQuery(name = "Situacionjuridica.findByMostrarTotal", query = "SELECT s FROM Situacionjuridica s WHERE s.mostrarTotal = :mostrarTotal")
    , @NamedQuery(name = "Situacionjuridica.findByTrabajo", query = "SELECT s FROM Situacionjuridica s WHERE s.trabajo = :trabajo")
    , @NamedQuery(name = "Situacionjuridica.findByTotalRedenciones", query = "SELECT s FROM Situacionjuridica s WHERE s.totalRedenciones = :totalRedenciones")})
public class Situacionjuridica implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "fecha_captura")
    @Temporal(TemporalType.DATE)
    private Date fechaCaptura;
    @Column(name = "diasDetencion")
    private String diasDetencion;
    @Column(name = "carcel")
    private String carcel;
    @Column(name = "diasPrivacion")
    private String diasPrivacion;
    @Column(name = "lugar_cumplimiento")
    private String lugarCumplimiento;
    @Column(name = "observaciones")
    private String observaciones;
    @Column(name = "folio")
    private Integer folio;
    @Column(name = "tipo")
    private String tipo;
    @Column(name = "estado")
    private String estado;
    @Column(name = "fechaFinalizacion")
    @Temporal(TemporalType.DATE)
    private Date fechaFinalizacion;
    @Column(name = "fechaExtincion")
    @Temporal(TemporalType.DATE)
    private Date fechaExtincion;
    @Column(name = "diasTotales")
    private Integer diasTotales;
    @Column(name = "mostrarTotal")
    private String mostrarTotal;
    @Column(name = "trabajo")
    private String trabajo;
    @Column(name = "totalRedenciones")
    private String totalRedenciones;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "situacionJuridica")
    private List<Redencion> redencionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "situacionJuridica")
    private List<Caucion> caucionList;
    @JoinColumn(name = "pena_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Pena penaId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "detenidoIdDetenidoCarcel")
    private List<Condiciones> condicionesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "situacionJuridicaid")
    private List<Sanciones> sancionesList;

    public Situacionjuridica() {
    }

    public Situacionjuridica(Integer id) {
        this.id = id;
    }

    public Situacionjuridica(Integer id, Date fechaCaptura) {
        this.id = id;
        this.fechaCaptura = fechaCaptura;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFechaCaptura() {
        return fechaCaptura;
    }

    public void setFechaCaptura(Date fechaCaptura) {
        this.fechaCaptura = fechaCaptura;
    }

    public String getDiasDetencion() {
        return diasDetencion;
    }

    public void setDiasDetencion(String diasDetencion) {
        this.diasDetencion = diasDetencion;
    }

    public String getCarcel() {
        return carcel;
    }

    public void setCarcel(String carcel) {
        this.carcel = carcel;
    }

    public String getDiasPrivacion() {
        return diasPrivacion;
    }

    public void setDiasPrivacion(String diasPrivacion) {
        this.diasPrivacion = diasPrivacion;
    }

    public String getLugarCumplimiento() {
        return lugarCumplimiento;
    }

    public void setLugarCumplimiento(String lugarCumplimiento) {
        this.lugarCumplimiento = lugarCumplimiento;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Integer getFolio() {
        return folio;
    }

    public void setFolio(Integer folio) {
        this.folio = folio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public void setFechaFinalizacion(Date fechaFinalizacion) {
        this.fechaFinalizacion = fechaFinalizacion;
    }

    public Date getFechaExtincion() {
        return fechaExtincion;
    }

    public void setFechaExtincion(Date fechaExtincion) {
        this.fechaExtincion = fechaExtincion;
    }

    public Integer getDiasTotales() {
        return diasTotales;
    }

    public void setDiasTotales(Integer diasTotales) {
        this.diasTotales = diasTotales;
    }

    public String getMostrarTotal() {
        return mostrarTotal;
    }

    public void setMostrarTotal(String mostrarTotal) {
        this.mostrarTotal = mostrarTotal;
    }

    public String getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }

    public String getTotalRedenciones() {
        return totalRedenciones;
    }

    public void setTotalRedenciones(String totalRedenciones) {
        this.totalRedenciones = totalRedenciones;
    }

    public List<Redencion> getRedencionList() {
        return redencionList;
    }

    public void setRedencionList(List<Redencion> redencionList) {
        this.redencionList = redencionList;
    }

    public List<Caucion> getCaucionList() {
        return caucionList;
    }

    public void setCaucionList(List<Caucion> caucionList) {
        this.caucionList = caucionList;
    }

    public Pena getPenaId() {
        return penaId;
    }

    public void setPenaId(Pena penaId) {
        this.penaId = penaId;
    }

    public List<Condiciones> getCondicionesList() {
        return condicionesList;
    }

    public void setCondicionesList(List<Condiciones> condicionesList) {
        this.condicionesList = condicionesList;
    }

    public List<Sanciones> getSancionesList() {
        return sancionesList;
    }

    public void setSancionesList(List<Sanciones> sancionesList) {
        this.sancionesList = sancionesList;
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
        if (!(object instanceof Situacionjuridica)) {
            return false;
        }
        Situacionjuridica other = (Situacionjuridica) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Controlador.Situacionjuridica[ id=" + id + " ]";
    }
    
}
