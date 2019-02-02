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
@Table(name = "procesos")
@NamedQueries({
    @NamedQuery(name = "Procesos.findAll", query = "SELECT p FROM Procesos p")
    , @NamedQuery(name = "Procesos.findByNi", query = "SELECT p FROM Procesos p WHERE p.ni = :ni")
    , @NamedQuery(name = "Procesos.findByFechaReparto", query = "SELECT p FROM Procesos p WHERE p.fechaReparto = :fechaReparto")
    , @NamedQuery(name = "Procesos.findByFechaIngreso", query = "SELECT p FROM Procesos p WHERE p.fechaIngreso = :fechaIngreso")
    , @NamedQuery(name = "Procesos.findByNumero", query = "SELECT p FROM Procesos p WHERE p.numero = :numero")
    , @NamedQuery(name = "Procesos.findByNumeroCuadernos", query = "SELECT p FROM Procesos p WHERE p.numeroCuadernos = :numeroCuadernos")
    , @NamedQuery(name = "Procesos.findByFechaSentencia", query = "SELECT p FROM Procesos p WHERE p.fechaSentencia = :fechaSentencia")
    , @NamedQuery(name = "Procesos.findByFechaSentencia2", query = "SELECT p FROM Procesos p WHERE p.fechaSentencia2 = :fechaSentencia2")
    , @NamedQuery(name = "Procesos.findByFechaHechos", query = "SELECT p FROM Procesos p WHERE p.fechaHechos = :fechaHechos")
    , @NamedQuery(name = "Procesos.findByEstado", query = "SELECT p FROM Procesos p WHERE p.estado = :estado")
    , @NamedQuery(name = "Procesos.findByJuzgado", query = "SELECT p FROM Procesos p WHERE p.juzgado = :juzgado")})
public class Procesos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NI")
    private Integer ni;
    @Basic(optional = false)
    @Column(name = "fechaReparto")
    private String fechaReparto;
    @Basic(optional = false)
    @Column(name = "FechaIngreso")
    private String fechaIngreso;
    @Basic(optional = false)
    @Column(name = "numero")
    private String numero;
    @Basic(optional = false)
    @Column(name = "NumeroCuadernos")
    private int numeroCuadernos;
    @Basic(optional = false)
    @Column(name = "fechaSentencia")
    private String fechaSentencia;
    @Column(name = "fechaSentencia2")
    private String fechaSentencia2;
    @Column(name = "fechaHechos")
    @Temporal(TemporalType.DATE)
    private Date fechaHechos;
    @Column(name = "estado")
    private String estado;
    @Column(name = "juzgado")
    private String juzgado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "procesosNI")
    private List<Procesorequerido> procesorequeridoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "procesoSecundario")
    private List<ProcesosAcumulados> procesosAcumuladosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "procesoPrincipal")
    private List<ProcesosAcumulados> procesosAcumuladosList1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "procesosNI")
    private List<Pena> penaList;
    @JoinColumn(name = "Fallador1", referencedColumnName = "idFallador")
    @ManyToOne(optional = false)
    private Fallador fallador1;
    @JoinColumn(name = "fallador2", referencedColumnName = "idFallador")
    @ManyToOne
    private Fallador fallador2;
    @JoinColumn(name = "ofendido", referencedColumnName = "idOfendidos")
    @ManyToOne(optional = false)
    private Ofendidos ofendido;
    @JoinColumn(name = "usuario", referencedColumnName = "nombre_usuario")
    @ManyToOne(optional = false)
    private Usuario usuario;

    public Procesos() {
    }

    public Procesos(Integer ni) {
        this.ni = ni;
    }

    public Procesos(Integer ni, String fechaReparto, String fechaIngreso, String numero, int numeroCuadernos, String fechaSentencia) {
        this.ni = ni;
        this.fechaReparto = fechaReparto;
        this.fechaIngreso = fechaIngreso;
        this.numero = numero;
        this.numeroCuadernos = numeroCuadernos;
        this.fechaSentencia = fechaSentencia;
    }

    public Integer getNi() {
        return ni;
    }

    public void setNi(Integer ni) {
        this.ni = ni;
    }

    public String getFechaReparto() {
        return fechaReparto;
    }

    public void setFechaReparto(String fechaReparto) {
        this.fechaReparto = fechaReparto;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getNumeroCuadernos() {
        return numeroCuadernos;
    }

    public void setNumeroCuadernos(int numeroCuadernos) {
        this.numeroCuadernos = numeroCuadernos;
    }

    public String getFechaSentencia() {
        return fechaSentencia;
    }

    public void setFechaSentencia(String fechaSentencia) {
        this.fechaSentencia = fechaSentencia;
    }

    public String getFechaSentencia2() {
        return fechaSentencia2;
    }

    public void setFechaSentencia2(String fechaSentencia2) {
        this.fechaSentencia2 = fechaSentencia2;
    }

    public Date getFechaHechos() {
        return fechaHechos;
    }

    public void setFechaHechos(Date fechaHechos) {
        this.fechaHechos = fechaHechos;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getJuzgado() {
        return juzgado;
    }

    public void setJuzgado(String juzgado) {
        this.juzgado = juzgado;
    }

    public List<Procesorequerido> getProcesorequeridoList() {
        return procesorequeridoList;
    }

    public void setProcesorequeridoList(List<Procesorequerido> procesorequeridoList) {
        this.procesorequeridoList = procesorequeridoList;
    }

    public List<ProcesosAcumulados> getProcesosAcumuladosList() {
        return procesosAcumuladosList;
    }

    public void setProcesosAcumuladosList(List<ProcesosAcumulados> procesosAcumuladosList) {
        this.procesosAcumuladosList = procesosAcumuladosList;
    }

    public List<ProcesosAcumulados> getProcesosAcumuladosList1() {
        return procesosAcumuladosList1;
    }

    public void setProcesosAcumuladosList1(List<ProcesosAcumulados> procesosAcumuladosList1) {
        this.procesosAcumuladosList1 = procesosAcumuladosList1;
    }

    public List<Pena> getPenaList() {
        return penaList;
    }

    public void setPenaList(List<Pena> penaList) {
        this.penaList = penaList;
    }

    public Fallador getFallador1() {
        return fallador1;
    }

    public void setFallador1(Fallador fallador1) {
        this.fallador1 = fallador1;
    }

    public Fallador getFallador2() {
        return fallador2;
    }

    public void setFallador2(Fallador fallador2) {
        this.fallador2 = fallador2;
    }

    public Ofendidos getOfendido() {
        return ofendido;
    }

    public void setOfendido(Ofendidos ofendido) {
        this.ofendido = ofendido;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ni != null ? ni.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Procesos)) {
            return false;
        }
        Procesos other = (Procesos) object;
        if ((this.ni == null && other.ni != null) || (this.ni != null && !this.ni.equals(other.ni))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Controlador.Procesos[ ni=" + ni + " ]";
    }
    
}
