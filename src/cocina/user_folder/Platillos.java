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
@Table(name = "platillos", catalog = "bd", schema = "")
@NamedQueries({
    @NamedQuery(name = "Platillos.findAll", query = "SELECT p FROM Platillos p")
    , @NamedQuery(name = "Platillos.findByIdPlatillo", query = "SELECT p FROM Platillos p WHERE p.idPlatillo = :idPlatillo")
    , @NamedQuery(name = "Platillos.findByIdPlatilloElements", query = "SELECT p FROM Platillos p WHERE p.idPlatilloElements = :idPlatilloElements")
    , @NamedQuery(name = "Platillos.findByNombre", query = "SELECT p FROM Platillos p WHERE p.nombre = :nombre")})
public class Platillos implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_platillo")
    private Integer idPlatillo;
    @Column(name = "id_platillo_elements")
    private Integer idPlatilloElements;
    @Column(name = "nombre")
    private String nombre;

    public Platillos() {
    }

    public Platillos(Integer idPlatillo) {
        this.idPlatillo = idPlatillo;
    }

    public Integer getIdPlatillo() {
        return idPlatillo;
    }

    public void setIdPlatillo(Integer idPlatillo) {
        Integer oldIdPlatillo = this.idPlatillo;
        this.idPlatillo = idPlatillo;
        changeSupport.firePropertyChange("idPlatillo", oldIdPlatillo, idPlatillo);
    }

    public Integer getIdPlatilloElements() {
        return idPlatilloElements;
    }

    public void setIdPlatilloElements(Integer idPlatilloElements) {
        Integer oldIdPlatilloElements = this.idPlatilloElements;
        this.idPlatilloElements = idPlatilloElements;
        changeSupport.firePropertyChange("idPlatilloElements", oldIdPlatilloElements, idPlatilloElements);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        String oldNombre = this.nombre;
        this.nombre = nombre;
        changeSupport.firePropertyChange("nombre", oldNombre, nombre);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPlatillo != null ? idPlatillo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Platillos)) {
            return false;
        }
        Platillos other = (Platillos) object;
        if ((this.idPlatillo == null && other.idPlatillo != null) || (this.idPlatillo != null && !this.idPlatillo.equals(other.idPlatillo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cocina.user_folder.Platillos[ idPlatillo=" + idPlatillo + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
