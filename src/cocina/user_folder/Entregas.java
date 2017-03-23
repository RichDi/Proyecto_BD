/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cocina.user_folder;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author drdr_
 */
@Entity
@Table(name = "entregas", catalog = "bd", schema = "")
@NamedQueries({
    @NamedQuery(name = "Entregas.findAll", query = "SELECT e FROM Entregas e")
    , @NamedQuery(name = "Entregas.findByIdEntrega", query = "SELECT e FROM Entregas e WHERE e.idEntrega = :idEntrega")
    , @NamedQuery(name = "Entregas.findByFecha", query = "SELECT e FROM Entregas e WHERE e.fecha = :fecha")})
public class Entregas implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_entrega")
    private Integer idEntrega;
    @Basic(optional = false)
    @Column(name = "fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;

    public Entregas() {
    }

    public Entregas(Integer idEntrega) {
        this.idEntrega = idEntrega;
    }

    public Entregas(Integer idEntrega, Date fecha) {
        this.idEntrega = idEntrega;
        this.fecha = fecha;
    }

    public Integer getIdEntrega() {
        return idEntrega;
    }

    public void setIdEntrega(Integer idEntrega) {
        Integer oldIdEntrega = this.idEntrega;
        this.idEntrega = idEntrega;
        changeSupport.firePropertyChange("idEntrega", oldIdEntrega, idEntrega);
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        Date oldFecha = this.fecha;
        this.fecha = fecha;
        changeSupport.firePropertyChange("fecha", oldFecha, fecha);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEntrega != null ? idEntrega.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Entregas)) {
            return false;
        }
        Entregas other = (Entregas) object;
        if ((this.idEntrega == null && other.idEntrega != null) || (this.idEntrega != null && !this.idEntrega.equals(other.idEntrega))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cocina.user_folder.Entregas[ idEntrega=" + idEntrega + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
