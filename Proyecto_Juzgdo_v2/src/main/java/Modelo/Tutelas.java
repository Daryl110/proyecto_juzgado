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
@Table(name = "tutelas")
@NamedQueries({
    @NamedQuery(name = "Tutelas.findAll", query = "SELECT t FROM Tutelas t")
    , @NamedQuery(name = "Tutelas.findByIdTutelas", query = "SELECT t FROM Tutelas t WHERE t.idTutelas = :idTutelas")
    , @NamedQuery(name = "Tutelas.findByFechaPresentaciion", query = "SELECT t FROM Tutelas t WHERE t.fechaPresentaciion = :fechaPresentaciion")
    , @NamedQuery(name = "Tutelas.findByFechaIngreso", query = "SELECT t FROM Tutelas t WHERE t.fechaIngreso = :fechaIngreso")
    , @NamedQuery(name = "Tutelas.findByFechaAvocase", query = "SELECT t FROM Tutelas t WHERE t.fechaAvocase = :fechaAvocase")
    , @NamedQuery(name = "Tutelas.findByFechaVencimiento", query = "SELECT t FROM Tutelas t WHERE t.fechaVencimiento = :fechaVencimiento")
    , @NamedQuery(name = "Tutelas.findByNumero", query = "SELECT t FROM Tutelas t WHERE t.numero = :numero")
    , @NamedQuery(name = "Tutelas.findByAccionante", query = "SELECT t FROM Tutelas t WHERE t.accionante = :accionante")
    , @NamedQuery(name = "Tutelas.findByIdentificacionAccionante", query = "SELECT t FROM Tutelas t WHERE t.identificacionAccionante = :identificacionAccionante")
    , @NamedQuery(name = "Tutelas.findByAgente", query = "SELECT t FROM Tutelas t WHERE t.agente = :agente")
    , @NamedQuery(name = "Tutelas.findByIdentificacionAgente", query = "SELECT t FROM Tutelas t WHERE t.identificacionAgente = :identificacionAgente")
    , @NamedQuery(name = "Tutelas.findByAccionadas", query = "SELECT t FROM Tutelas t WHERE t.accionadas = :accionadas")
    , @NamedQuery(name = "Tutelas.findByVinculadas", query = "SELECT t FROM Tutelas t WHERE t.vinculadas = :vinculadas")
    , @NamedQuery(name = "Tutelas.findByFechaActuacion", query = "SELECT t FROM Tutelas t WHERE t.fechaActuacion = :fechaActuacion")
    , @NamedQuery(name = "Tutelas.findByDespacho", query = "SELECT t FROM Tutelas t WHERE t.despacho = :despacho")
    , @NamedQuery(name = "Tutelas.findByActuaciones", query = "SELECT t FROM Tutelas t WHERE t.actuaciones = :actuaciones")
    , @NamedQuery(name = "Tutelas.findByApoderado", query = "SELECT t FROM Tutelas t WHERE t.apoderado = :apoderado")})
public class Tutelas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idTutelas")
    private Integer idTutelas;
    @Column(name = "fechaPresentaciion")
    @Temporal(TemporalType.DATE)
    private Date fechaPresentaciion;
    @Column(name = "fechaIngreso")
    @Temporal(TemporalType.DATE)
    private Date fechaIngreso;
    @Column(name = "fechaAvocase")
    @Temporal(TemporalType.DATE)
    private Date fechaAvocase;
    @Column(name = "fechaVencimiento")
    @Temporal(TemporalType.DATE)
    private Date fechaVencimiento;
    @Column(name = "numero")
    private String numero;
    @Column(name = "accionante")
    private String accionante;
    @Column(name = "identificacionAccionante")
    private String identificacionAccionante;
    @Column(name = "agente")
    private String agente;
    @Column(name = "identificacionAgente")
    private String identificacionAgente;
    @Column(name = "accionadas")
    private String accionadas;
    @Column(name = "vinculadas")
    private String vinculadas;
    @Column(name = "fechaActuacion")
    @Temporal(TemporalType.DATE)
    private Date fechaActuacion;
    @Column(name = "despacho")
    private String despacho;
    @Column(name = "actuaciones")
    private String actuaciones;
    @Column(name = "apoderado")
    private String apoderado;
    @JoinColumn(name = "derechoPrincipal", referencedColumnName = "idDerechos")
    @ManyToOne(optional = false)
    private Derechos derechoPrincipal;
    @JoinColumn(name = "usuario", referencedColumnName = "nombre_usuario")
    @ManyToOne(optional = false)
    private Usuario usuario;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tutelasidTutelas")
    private List<TutelasDerechos> tutelasDerechosList;

    public Tutelas() {
    }

    public Tutelas(Integer idTutelas) {
        this.idTutelas = idTutelas;
    }

    public Integer getIdTutelas() {
        return idTutelas;
    }

    public void setIdTutelas(Integer idTutelas) {
        this.idTutelas = idTutelas;
    }

    public Date getFechaPresentaciion() {
        return fechaPresentaciion;
    }

    public void setFechaPresentaciion(Date fechaPresentaciion) {
        this.fechaPresentaciion = fechaPresentaciion;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Date getFechaAvocase() {
        return fechaAvocase;
    }

    public void setFechaAvocase(Date fechaAvocase) {
        this.fechaAvocase = fechaAvocase;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getAccionante() {
        return accionante;
    }

    public void setAccionante(String accionante) {
        this.accionante = accionante;
    }

    public String getIdentificacionAccionante() {
        return identificacionAccionante;
    }

    public void setIdentificacionAccionante(String identificacionAccionante) {
        this.identificacionAccionante = identificacionAccionante;
    }

    public String getAgente() {
        return agente;
    }

    public void setAgente(String agente) {
        this.agente = agente;
    }

    public String getIdentificacionAgente() {
        return identificacionAgente;
    }

    public void setIdentificacionAgente(String identificacionAgente) {
        this.identificacionAgente = identificacionAgente;
    }

    public String getAccionadas() {
        return accionadas;
    }

    public void setAccionadas(String accionadas) {
        this.accionadas = accionadas;
    }

    public String getVinculadas() {
        return vinculadas;
    }

    public void setVinculadas(String vinculadas) {
        this.vinculadas = vinculadas;
    }

    public Date getFechaActuacion() {
        return fechaActuacion;
    }

    public void setFechaActuacion(Date fechaActuacion) {
        this.fechaActuacion = fechaActuacion;
    }

    public String getDespacho() {
        return despacho;
    }

    public void setDespacho(String despacho) {
        this.despacho = despacho;
    }

    public String getActuaciones() {
        return actuaciones;
    }

    public void setActuaciones(String actuaciones) {
        this.actuaciones = actuaciones;
    }

    public String getApoderado() {
        return apoderado;
    }

    public void setApoderado(String apoderado) {
        this.apoderado = apoderado;
    }

    public Derechos getDerechoPrincipal() {
        return derechoPrincipal;
    }

    public void setDerechoPrincipal(Derechos derechoPrincipal) {
        this.derechoPrincipal = derechoPrincipal;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
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
        hash += (idTutelas != null ? idTutelas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tutelas)) {
            return false;
        }
        Tutelas other = (Tutelas) object;
        if ((this.idTutelas == null && other.idTutelas != null) || (this.idTutelas != null && !this.idTutelas.equals(other.idTutelas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Controlador.Tutelas[ idTutelas=" + idTutelas + " ]";
    }
    
}
