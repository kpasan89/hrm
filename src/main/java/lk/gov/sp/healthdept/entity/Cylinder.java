/*
 * Author : Dr. M H B Ariyaratne, MO(Health Information), email : buddhika.ari@gmail.com
 * and open the template in the editor.
 */
package lk.gov.sp.healthdept.entity;


import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Inheritance;
import lk.gov.sp.healthdept.data.CylinderType;
import lk.gov.sp.healthdept.data.Gas;


/**
 *
 * @author buddhika
 */
@Entity
@Inheritance
public class Cylinder extends Item implements Serializable {

    
    
    private static final long serialVersionUID = 1L;
    @Enumerated(EnumType.STRING)
    Gas gas;
    @Enumerated(EnumType.STRING)
    CylinderType cylinderType;
    Double gasVolume;

    
    
    public Double getGasVolume() {
        return gasVolume;
    }

    public void setGasVolume(Double gasVolume) {
        this.gasVolume = gasVolume;
    }

    
    
    public Gas getGas() {
        return gas;
    }

    public void setGas(Gas gas) {
        this.gas = gas;
    }

    public CylinderType getCylinderType() {
        return cylinderType;
    }

    public void setCylinderType(CylinderType cylinderType) {
        this.cylinderType = cylinderType;
    }
}
