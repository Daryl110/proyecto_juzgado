/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.math.BigDecimal;
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

/**
 *
 * @author Daryl
 */
@Entity
@Table(name = "pena")
@NamedQueries({
    @NamedQuery(name = "Pena.findAll", query = "SELECT p FROM Pena p")
    , @NamedQuery(name = "Pena.findById", query = "SELECT p FROM Pena p WHERE p.id = :id")
    , @NamedQuery(name = "Pena.findByPenaMulta", query = "SELECT p FROM Pena p WHERE p.penaMulta = :penaMulta")
    , @NamedQuery(name = "Pena.findByNombreCondenado", query = "SELECT p FROM Pena p WHERE p.nombreCondenado = :nombreCondenado")
    , @NamedQuery(name = "Pena.findByIdentificacionCondenado", query = "SELECT p FROM Pena p WHERE p.identificacionCondenado = :identificacionCondenado")
    , @NamedQuery(name = "Pena.findByTiempoPena", query = "SELECT p FROM Pena p WHERE p.tiempoPena = :tiempoPena")
    , @NamedQuery(name = "Pena.findByDiasPena", query = "SELECT p FROM Pena p WHERE p.diasPena = :diasPena")})
public class Pena implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "pena_multa")
    private String penaMulta;
    @Basic(optional = false)
    @Column(name = "nombreCondenado")
    private String nombreCondenado;
    @Column(name = "identificacionCondenado")
    private String identificacionCondenado;
    @Column(name = "tiempoPena")
    private String tiempoPena;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "diasPena")
    private BigDecimal diasPena;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "penaId")
    private List<Procesorequerido> procesorequeridoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "penaId")
    private List<PenaDelitos> penaDelitosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "penaId")
    private List<ProcesosAcumulados> procesosAcumuladosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "penaId")
    private List<Situacionjuridica> situacionjuridicaList;
    @JoinColumn(name = "Procesos_NI", referencedColumnName = "NI")
    @ManyToOne(optional = false)
    private Procesos procesosNI;

    public Pena() {
    }

    public Pena(Integer id) {
        this.id = id;
    }

    public Pena(Integer id, String nombreCondenado) {
        this.id = id;
        this.nombreCondenado = nombreCondenado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPenaMulta() {
        return penaMulta;
    }

    public void setPenaMulta(String penaMulta) {
        this.penaMulta = penaMulta;
    }

    public String getNombreCondenado() {
        return nombreCondenado;
    }

    public void setNombreCondenado(String nombreCondenado) {
        this.nombreCondenado = nombreCondenado;
    }

    public String getIdentificacionCondenado() {
        return identificacionCondenado;
    }

    public void setIdentificacionCondenado(String identificacionCondenado) {
        this.identificacionCondenado = identificacionCondenado;
    }

    public String getTiempoPena() {
        return tiempoPena;
    }

    public void setTiempoPena(String tiempoPena) {
        this.tiempoPena = tiempoPena;
    }

    public BigDecimal getDiasPena() {
        return diasPena;
    }

    public void setDiasPena(BigDecimal diasPena) {
        this.diasPena = diasPena;
    }

    public List<Procesorequerido> getProcesorequeridoList() {
        return procesorequeridoList;
    }

    public void setProcesorequeridoList(List<Procesorequerido> procesorequeridoList) {
        this.procesorequeridoList = procesorequeridoList;
    }

    public List<PenaDelitos> getPenaDelitosList() {
        return penaDelitosList;
    }

    public void setPenaDelitosList(List<PenaDelitos> penaDelitosList) {
        this.penaDelitosList = penaDelitosList;
    }

    public List<ProcesosAcumulados> getProcesosAcumuladosList() {
        return procesosAcumuladosList;
    }

    public void setProcesosAcumuladosList(List<ProcesosAcumulados> procesosAcumuladosList) {
        this.procesosAcumuladosList = procesosAcumuladosList;
    }

    public List<Situacionjuridica> getSituacionjuridicaList() {
        return situacionjuridicaList;
    }

    public void setSituacionjuridicaList(List<Situacionjuridica> situacionjuridicaList) {
        this.situacionjuridicaList = situacionjuridicaList;
    }

    public Procesos getProcesosNI() {
        return procesosNI;
    }

    public void setProcesosNI(Procesos procesosNI) {
        this.procesosNI = procesosNI;
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
        if (!(object instanceof Pena)) {
            return false;
        }
        Pena other = (Pena) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Controlador.Pena[ id=" + id + " ]";
    }
    
}
