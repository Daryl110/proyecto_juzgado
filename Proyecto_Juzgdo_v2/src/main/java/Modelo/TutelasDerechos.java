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
@Table(name = "tutelas_derechos")
@NamedQueries({
    @NamedQuery(name = "TutelasDerechos.findAll", query = "SELECT t FROM TutelasDerechos t")
    , @NamedQuery(name = "TutelasDerechos.findByIdTutelasDerechos", query = "SELECT t FROM TutelasDerechos t WHERE t.idTutelasDerechos = :idTutelasDerechos")})
public class TutelasDerechos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idTutelas_Derechos")
    private Integer idTutelasDerechos;
    @JoinColumn(name = "Derechos_idDerechos", referencedColumnName = "idDerechos")
    @ManyToOne(optional = false)
    private Derechos derechosidDerechos;
    @JoinColumn(name = "Tutelas_idTutelas", referencedColumnName = "idTutelas")
    @ManyToOne(optional = false)
    private Tutelas tutelasidTutelas;

    public TutelasDerechos() {
    }

    public TutelasDerechos(Integer idTutelasDerechos) {
        this.idTutelasDerechos = idTutelasDerechos;
    }

    public Integer getIdTutelasDerechos() {
        return idTutelasDerechos;
    }

    public void setIdTutelasDerechos(Integer idTutelasDerechos) {
        this.idTutelasDerechos = idTutelasDerechos;
    }

    public Derechos getDerechosidDerechos() {
        return derechosidDerechos;
    }

    public void setDerechosidDerechos(Derechos derechosidDerechos) {
        this.derechosidDerechos = derechosidDerechos;
    }

    public Tutelas getTutelasidTutelas() {
        return tutelasidTutelas;
    }

    public void setTutelasidTutelas(Tutelas tutelasidTutelas) {
        this.tutelasidTutelas = tutelasidTutelas;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTutelasDerechos != null ? idTutelasDerechos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TutelasDerechos)) {
            return false;
        }
        TutelasDerechos other = (TutelasDerechos) object;
        if ((this.idTutelasDerechos == null && other.idTutelasDerechos != null) || (this.idTutelasDerechos != null && !this.idTutelasDerechos.equals(other.idTutelasDerechos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Controlador.TutelasDerechos[ idTutelasDerechos=" + idTutelasDerechos + " ]";
    }
    
}
