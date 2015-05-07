/*
 * Author : Dr. M H B Ariyaratne, MO(Health Information), email : buddhika.ari@gmail.com
 * and open the template in the editor.
 */
package lk.gov.sp.healthdept.bean;

import lk.gov.sp.healthdept.entity.CitizenCharterCategory;
import lk.gov.sp.healthdept.entity.FinancialFindingCategory;
import lk.gov.sp.healthdept.facade.CitizenCharterCategoryFacade;
import lk.gov.sp.healthdept.facade.CitizenCharterFacade;
import lk.gov.sp.healthdept.facade.ExpenseFacade;
import lk.gov.sp.healthdept.facade.FinancialFindingCategoryFacade;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author buddhika
 */
@ManagedBean
@RequestScoped
public class TemBean {
@EJB
        ExpenseFacade expenseFacade;
@EJB
        CitizenCharterCategoryFacade cccFacade;
@EJB
        FinancialFindingCategoryFacade ffFacade;


    
    
    String temTxt;
    
    public void saveAsExpense(){
        FinancialFindingCategory ffc = new FinancialFindingCategory();
        ffc.setName(temTxt);
        ffFacade.create(ffc);
        JsfUtil.addSuccessMessage("Saved FFC");
        temTxt = "";
    }
    

    public FinancialFindingCategoryFacade getFfFacade() {
        return ffFacade;
    }

    public void setFfFacade(FinancialFindingCategoryFacade ffFacade) {
        this.ffFacade = ffFacade;
    }
    
    
    
    public void saveAsCCC(){
        CitizenCharterCategory ccc = new CitizenCharterCategory();
        ccc.setName(temTxt);
        cccFacade.create(ccc);
        JsfUtil.addSuccessMessage("Saved CCC");
        temTxt="";
    }

    public ExpenseFacade getExpenseFacade() {
        return expenseFacade;
    }

    public void setExpenseFacade(ExpenseFacade expenseFacade) {
        this.expenseFacade = expenseFacade;
    }

    public CitizenCharterCategoryFacade getCccFacade() {
        return cccFacade;
    }

    public void setCccFacade(CitizenCharterCategoryFacade cccFacade) {
        this.cccFacade = cccFacade;
    }

    public String getTemTxt() {
        return temTxt;
    }

    public void setTemTxt(String temTxt) {
        this.temTxt = temTxt;
    }

    
    
    
    /**
     * Creates a new instance of TemBean
     */
    public TemBean() {
    }
    
    public String toIndex(){
        return "index";
    }
    
}
