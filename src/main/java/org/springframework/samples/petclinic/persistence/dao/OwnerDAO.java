package org.springframework.samples.petclinic.persistence.dao;

import java.util.List;

import org.springframework.samples.petclinic.bill.Bill;
import org.springframework.samples.petclinic.owner.Owner;
import org.springframework.stereotype.Repository;

@Repository
public class OwnerDAO extends AbstractJpaDAO<Owner,Integer> implements IOwnerDAO{

    public OwnerDAO() {
        super();

        setClazz(Owner.class);
    }

    
    public List<Owner> getOwnersByIdNumber(long idNumber) {
    	
    	return getEntityManager().createQuery("select o from Owner o where o.idNumber= " + idNumber).getResultList();
    	
    }
    // API


	@Override
	public List<Owner> getOwnersByIdNumberNamedQuery(long idNumber) {
		// TODO Auto-generated method stub
		return getEntityManager().createNamedQuery("ownerByIdNumber").setParameter("idNumber", idNumber).getResultList();
	}

}
