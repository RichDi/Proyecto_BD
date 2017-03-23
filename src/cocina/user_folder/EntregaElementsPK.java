/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cocina.user_folder;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author drdr_
 */
@Embeddable
public class EntregaElementsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "id_entrega")
    private int idEntrega;
    @Basic(optional = false)
    @Column(name = "id_insumo")
    private int idInsumo;

    public EntregaElementsPK() {
    }

    public EntregaElementsPK(int idEntrega, int idInsumo) {
        this.idEntrega = idEntrega;
        this.idInsumo = idInsumo;
    }

    public int getIdEntrega() {
        return idEntrega;
    }

    public void setIdEntrega(int idEntrega) {
        this.idEntrega = idEntrega;
    }

    public int getIdInsumo() {
        return idInsumo;
    }

    public void setIdInsumo(int idInsumo) {
        this.idInsumo = idInsumo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idEntrega;
        hash += (int) idInsumo;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EntregaElementsPK)) {
            return false;
        }
        EntregaElementsPK other = (EntregaElementsPK) object;
        if (this.idEntrega != other.idEntrega) {
            return false;
        }
        if (this.idInsumo != other.idInsumo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cocina.user_folder.EntregaElementsPK[ idEntrega=" + idEntrega + ", idInsumo=" + idInsumo + " ]";
    }
    
}
