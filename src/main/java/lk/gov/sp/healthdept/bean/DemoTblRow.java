/*
 * Author : Dr. M H B Ariyaratne, MO(Health Information), email : buddhika.ari@gmail.com
 * and open the template in the editor.
 */
package lk.gov.sp.healthdept.bean;

import lk.gov.sp.healthdept.entity.DpdhsArea;
import lk.gov.sp.healthdept.entity.GnArea;
import lk.gov.sp.healthdept.entity.MohArea;
import lk.gov.sp.healthdept.entity.PhiArea;
import lk.gov.sp.healthdept.entity.PhmArea;
import lk.gov.sp.healthdept.entity.Population;
import lk.gov.sp.healthdept.entity.Province;
import java.io.Serializable;

/**
 *
 * @author Buddhika
 */


public class DemoTblRow  implements Serializable {
    Province province;
    DpdhsArea dpdhs;
    MohArea moh;
    PhiArea phi;
    PhmArea phm;
    GnArea gn;
    Population gnPop;
    Population phmPop;
    Population phiPop;
    Population mohPop;
    Population dpdhsPop;
    Population provincePop;

    public DemoTblRow() {
    }

    public DpdhsArea getDpdhs() {
        return dpdhs;
    }

    public void setDpdhs(DpdhsArea dpdhs) {
        this.dpdhs = dpdhs;
    }

    public Population getDpdhsPop() {
        return dpdhsPop;
    }

    public void setDpdhsPop(Population dpdhsPop) {
        this.dpdhsPop = dpdhsPop;
    }

    public GnArea getGn() {
        return gn;
    }

    public void setGn(GnArea gn) {
        this.gn = gn;
    }

    public Population getGnPop() {
        return gnPop;
    }

    public void setGnPop(Population gnPop) {
        this.gnPop = gnPop;
    }

    public MohArea getMoh() {
        return moh;
    }

    public void setMoh(MohArea moh) {
        this.moh = moh;
    }

    public Population getMohPop() {
        return mohPop;
    }

    public void setMohPop(Population mohPop) {
        this.mohPop = mohPop;
    }

    public PhiArea getPhi() {
        return phi;
    }

    public void setPhi(PhiArea phi) {
        this.phi = phi;
    }

    public Population getPhiPop() {
        return phiPop;
    }

    public void setPhiPop(Population phiPop) {
        this.phiPop = phiPop;
    }

    public PhmArea getPhm() {
        return phm;
    }

    public void setPhm(PhmArea phm) {
        this.phm = phm;
    }

    public Population getPhmPop() {
        return phmPop;
    }

    public void setPhmPop(Population phmPop) {
        this.phmPop = phmPop;
    }

    public Province getProvince() {
        return province;
    }

    public void setProvince(Province province) {
        this.province = province;
    }

    public Population getProvincePop() {
        return provincePop;
    }

    public void setProvincePop(Population provincePop) {
        this.provincePop = provincePop;
    }

    
    
}
