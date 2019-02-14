package org.springframework.samples.petclinic.persistence.dao;

import java.util.List;

import org.springframework.samples.petclinic.bill.Bill;
import org.springframework.samples.petclinic.visit.Visit;
import org.springframework.stereotype.Repository;

@Repository
public class VisitDAO extends AbstractJpaDAO<Visit,Integer> implements IVisitDAO{

    public VisitDAO() {
        super();

        setClazz(Visit.class);
    }

    
    public List<Visit> getVisitsByIdNumber(long idNumber) {
    	
    	return getEntityManager().createQuery("select b from Visit b where b.idNumber= " + idNumber).getResultList();
    	
    }
    // API


	@Override
	public List<Visit> getVisitsByIdNumberNamedQuery(long idNumber) {
		// TODO Auto-generated method stub
		return getEntityManager().createNamedQuery("billByIdNumber").setParameter("idNumber", idNumber).getResultList();
	}

}
