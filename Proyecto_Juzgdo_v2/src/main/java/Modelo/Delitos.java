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
@Table(name = "delitos")
@NamedQueries({
    @NamedQuery(name = "Delitos.findAll", query = "SELECT d FROM Delitos d")
    , @NamedQuery(name = "Delitos.findByIdDelitos", query = "SELECT d FROM Delitos d WHERE d.idDelitos = :idDelitos")
    , @NamedQuery(name = "Delitos.findByDescripcion", query = "SELECT d FROM Delitos d WHERE d.descripcion = :descripcion")
    , @NamedQuery(name = "Delitos.findByAtributoUno", query = "SELECT d FROM Delitos d WHERE d.atributoUno = :atributoUno")
    , @NamedQuery(name = "Delitos.findByAtributoDos", query = "SELECT d FROM Delitos d WHERE d.atributoDos = :atributoDos")
    , @NamedQuery(name = "Delitos.findByAtributoTres", query = "SELECT d FROM Delitos d WHERE d.atributoTres = :atributoTres")
    , @NamedQuery(name = "Delitos.findByAtributoCuatro", query = "SELECT d FROM Delitos d WHERE d.atributoCuatro = :atributoCuatro")})
public class Delitos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idDelitos")
    private Integer idDelitos;
    @Basic(optional = false)
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "atributoUno")
    private String atributoUno;
    @Column(name = "atributoDos")
    private String atributoDos;
    @Column(name = "atributoTres")
    private String atributoTres;
    @Column(name = "atributoCuatro")
    private String atributoCuatro;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "delitosidDelitos")
    private List<PenaDelitos> penaDelitosList;

    public Delitos() {
    }

    public Delitos(Integer idDelitos) {
        this.idDelitos = idDelitos;
    }
    
    public Delitos(String descripcion) {
        this.descripcion = descripcion;
    }

    public Delitos(Integer idDelitos, String descripcion) {
        this.idDelitos = idDelitos;
        this.descripcion = descripcion;
    }

    public Delitos(String descripcion, String atributoUno, String atributoDos, String atributoTres, String atributoCuatro) {
        this.descripcion = descripcion;
        this.atributoUno = atributoUno;
        this.atributoDos = atributoDos;
        this.atributoTres = atributoTres;
        this.atributoCuatro = atributoCuatro;
    }

    public Delitos(Integer idDelitos, String descripcion, String atributoUno, String atributoDos, String atributoTres, String atributoCuatro) {
        this.idDelitos = idDelitos;
        this.descripcion = descripcion;
        this.atributoUno = atributoUno;
        this.atributoDos = atributoDos;
        this.atributoTres = atributoTres;
        this.atributoCuatro = atributoCuatro;
    }

    public Integer getIdDelitos() {
        return idDelitos;
    }

    public void setIdDelitos(Integer idDelitos) {
        this.idDelitos = idDelitos;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getAtributoUno() {
        return atributoUno;
    }

    public void setAtributoUno(String atributoUno) {
        this.atributoUno = atributoUno;
    }

    public String getAtributoDos() {
        return atributoDos;
    }

    public void setAtributoDos(String atributoDos) {
        this.atributoDos = atributoDos;
    }

    public String getAtributoTres() {
        return atributoTres;
    }

    public void setAtributoTres(String atributoTres) {
        this.atributoTres = atributoTres;
    }

    public String getAtributoCuatro() {
        return atributoCuatro;
    }

    public void setAtributoCuatro(String atributoCuatro) {
        this.atributoCuatro = atributoCuatro;
    }

    public List<PenaDelitos> getPenaDelitosList() {
        return penaDelitosList;
    }

    public void setPenaDelitosList(List<PenaDelitos> penaDelitosList) {
        this.penaDelitosList = penaDelitosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDelitos != null ? idDelitos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Delitos)) {
            return false;
        }
        Delitos other = (Delitos) object;
        if ((this.idDelitos == null && other.idDelitos != null) || (this.idDelitos != null && !this.idDelitos.equals(other.idDelitos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Controlador.Delitos[ idDelitos=" + idDelitos + " ]";
    }
    
}
