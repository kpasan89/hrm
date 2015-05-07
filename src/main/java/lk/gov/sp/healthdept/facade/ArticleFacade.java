/*
 * Author : Dr. M H B Ariyaratne, MO(Health Information), email : buddhika.ari@gmail.com
 * and open the template in the editor.
 */
package lk.gov.sp.healthdept.facade;

import lk.gov.sp.healthdept.entity.Article;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author User56
 */
@Stateless
public class ArticleFacade extends AbstractFacade<Article> {
    @PersistenceContext(unitName = "HOPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ArticleFacade() {
        super(Article.class);
    }
    
}
