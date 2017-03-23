/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cocina.user_folder;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author drdr_
 */
@Entity
@Table(name = "insumos", catalog = "bd", schema = "")
@NamedQueries({
    @NamedQuery(name = "Insumos_1.findAll", query = "SELECT i FROM Insumos_1 i")
    , @NamedQuery(name = "Insumos_1.findByIdInsumo", query = "SELECT i FROM Insumos_1 i WHERE i.idInsumo = :idInsumo")
    , @NamedQuery(name = "Insumos_1.findByNombre", query = "SELECT i FROM Insumos_1 i WHERE i.nombre = :nombre")
    , @NamedQuery(name = "Insumos_1.findByCantidad", query = "SELECT i FROM Insumos_1 i WHERE i.cantidad = :cantidad")
    , @NamedQuery(name = "Insumos_1.findByCategoria", query = "SELECT i FROM Insumos_1 i WHERE i.categoria = :categoria")})
public class Insumos_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_insumo")
    private Integer idInsumo;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "cantidad")
    private Integer cantidad;
    @Column(name = "categoria")
    private String categoria;

    public Insumos_1() {
    }

    public Insumos_1(Integer idInsumo) {
        this.idInsumo = idInsumo;
    }

    public Integer getIdInsumo() {
        return idInsumo;
    }

    public void setIdInsumo(Integer idInsumo) {
        Integer oldIdInsumo = this.idInsumo;
        this.idInsumo = idInsumo;
        changeSupport.firePropertyChange("idInsumo", oldIdInsumo, idInsumo);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        String oldNombre = this.nombre;
        this.nombre = nombre;
        changeSupport.firePropertyChange("nombre", oldNombre, nombre);
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        Integer oldCantidad = this.cantidad;
        this.cantidad = cantidad;
        changeSupport.firePropertyChange("cantidad", oldCantidad, cantidad);
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        String oldCategoria = this.categoria;
        this.categoria = categoria;
        changeSupport.firePropertyChange("categoria", oldCategoria, categoria);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idInsumo != null ? idInsumo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Insumos_1)) {
            return false;
        }
        Insumos_1 other = (Insumos_1) object;
        if ((this.idInsumo == null && other.idInsumo != null) || (this.idInsumo != null && !this.idInsumo.equals(other.idInsumo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cocina.user_folder.Insumos_1[ idInsumo=" + idInsumo + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
