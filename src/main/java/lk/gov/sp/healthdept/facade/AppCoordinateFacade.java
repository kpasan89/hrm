/*
 * Author : Dr. M H B Ariyaratne, MO(Health Information), email : buddhika.ari@gmail.com
 * and open the template in the editor.
 */
package lk.gov.sp.healthdept.facade;

import lk.gov.sp.healthdept.entity.AppCoordinate;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author IT
 */
@Stateless
public class AppCoordinateFacade extends AbstractFacade<AppCoordinate> {

    @PersistenceContext(unitName = "HOPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AppCoordinateFacade() {
        super(AppCoordinate.class);
    }
}
