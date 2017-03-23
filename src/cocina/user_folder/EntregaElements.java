/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cocina.user_folder;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author drdr_
 */
@Entity
@Table(name = "entrega_elements", catalog = "bd", schema = "")
@NamedQueries({
    @NamedQuery(name = "EntregaElements.findAll", query = "SELECT e FROM EntregaElements e")
    , @NamedQuery(name = "EntregaElements.findByIdEntrega", query = "SELECT e FROM EntregaElements e WHERE e.entregaElementsPK.idEntrega = :idEntrega")
    , @NamedQuery(name = "EntregaElements.findByIdInsumo", query = "SELECT e FROM EntregaElements e WHERE e.entregaElementsPK.idInsumo = :idInsumo")
    , @NamedQuery(name = "EntregaElements.findByCantidad", query = "SELECT e FROM EntregaElements e WHERE e.cantidad = :cantidad")})
public class EntregaElements implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EntregaElementsPK entregaElementsPK;
    @Column(name = "cantidad")
    private Integer cantidad;

    public EntregaElements() {
    }

    public EntregaElements(EntregaElementsPK entregaElementsPK) {
        this.entregaElementsPK = entregaElementsPK;
    }

    public EntregaElements(int idEntrega, int idInsumo) {
        this.entregaElementsPK = new EntregaElementsPK(idEntrega, idInsumo);
    }

    public EntregaElementsPK getEntregaElementsPK() {
        return entregaElementsPK;
    }

    public void setEntregaElementsPK(EntregaElementsPK entregaElementsPK) {
        this.entregaElementsPK = entregaElementsPK;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        Integer oldCantidad = this.cantidad;
        this.cantidad = cantidad;
        changeSupport.firePropertyChange("cantidad", oldCantidad, cantidad);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (entregaElementsPK != null ? entregaElementsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EntregaElements)) {
            return false;
        }
        EntregaElements other = (EntregaElements) object;
        if ((this.entregaElementsPK == null && other.entregaElementsPK != null) || (this.entregaElementsPK != null && !this.entregaElementsPK.equals(other.entregaElementsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cocina.user_folder.EntregaElements[ entregaElementsPK=" + entregaElementsPK + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
