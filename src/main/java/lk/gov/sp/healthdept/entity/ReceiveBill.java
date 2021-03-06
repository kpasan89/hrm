/*
 * Author : Dr. M H B Ariyaratne, MO(Health Information), email : buddhika.ari@gmail.com
 * and open the template in the editor.
 */
package lk.gov.sp.healthdept.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.ManyToOne;

/**
 *
 * @author Buddhika
 * 
 */
@Entity
@Inheritance
public class ReceiveBill extends Bill implements Serializable {

    @ManyToOne
    IssueBill issueBill;
    
    public ReceiveBill() {
    }

    
}
