/*
 * Author : Dr. M H B Ariyaratne, MO(Health Information), email : buddhika.ari@gmail.com
 * and open the template in the editor.
 */
package lk.gov.sp.healthdept.bean;

import lk.gov.sp.healthdept.facade.PersonFacade;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author buddhika
 */
@ManagedBean
@SessionScoped
public class NcdController implements Serializable{

    @EJB
    PersonFacade personFacade;
    
    /**
     * Creates a new instance of NcdController
     */
    public NcdController() {
    }
}
