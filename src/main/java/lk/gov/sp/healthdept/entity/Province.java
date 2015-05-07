package lk.gov.sp.healthdept.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Inheritance;

/**
 *
 * @author Dr. M. H. B. Ariyaratne, MBBS, PGIM Trainee for MSc(Biomedical
 * Informatics)
 */
@Entity
@Inheritance
public class Province extends Area implements Serializable {

}
