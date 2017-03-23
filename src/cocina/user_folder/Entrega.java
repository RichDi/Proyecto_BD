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
@Table(name = "entrega", catalog = "bd", schema = "")
@NamedQueries({
    @NamedQuery(name = "Entrega.findAll", query = "SELECT e FROM Entrega e")
    , @NamedQuery(name = "Entrega.findByIdEntrega", query = "SELECT e FROM Entrega e WHERE e.idEntrega = :idEntrega")
    , @NamedQuery(name = "Entrega.findByIdEntregaElement", query = "SELECT e FROM Entrega e WHERE e.idEntregaElement = :idEntregaElement")
    , @NamedQuery(name = "Entrega.findByFecha", query = "SELECT e FROM Entrega e WHERE e.fecha = :fecha")})
public class Entrega implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_entrega")
    private Integer idEntrega;
    @Column(name = "id_entrega_element")
    private Integer idEntregaElement;
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;

    public Entrega() {
    }

    public Entrega(Integer idEntrega) {
        this.idEntrega = idEntrega;
    }

    public Integer getIdEntrega() {
        return idEntrega;
    }

    public void setIdEntrega(Integer idEntrega) {
        Integer oldIdEntrega = this.idEntrega;
        this.idEntrega = idEntrega;
        changeSupport.firePropertyChange("idEntrega", oldIdEntrega, idEntrega);
    }

    public Integer getIdEntregaElement() {
        return idEntregaElement;
    }

    public void setIdEntregaElement(Integer idEntregaElement) {
        Integer oldIdEntregaElement = this.idEntregaElement;
        this.idEntregaElement = idEntregaElement;
        changeSupport.firePropertyChange("idEntregaElement", oldIdEntregaElement, idEntregaElement);
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
        if (!(object instanceof Entrega)) {
            return false;
        }
        Entrega other = (Entrega) object;
        if ((this.idEntrega == null && other.idEntrega != null) || (this.idEntrega != null && !this.idEntrega.equals(other.idEntrega))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cocina.user_folder.Entrega[ idEntrega=" + idEntrega + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
