/*
 * Author : Dr. M H B Ariyaratne, MO(Health Information), email : buddhika.ari@gmail.com
 * and open the template in the editor.
 */
package lk.gov.sp.healthdept.bean;

import lk.gov.sp.healthdept.entity.Bill;
import lk.gov.sp.healthdept.entity.Location;
import lk.gov.sp.healthdept.entity.Unit;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Buddhika
 */
@ManagedBean
@SessionScoped
public class TransferBean  implements Serializable {

    Bill bill;
    Unit unit;
    Location location;
    
    
    /**
     * Creates a new instance of TransferBean
     */
    public TransferBean() {
    }

    public Bill getBill() {

        return bill;
    }

    public void setBill(Bill bill) {

        this.bill = bill;
    }
    
    
    
}
