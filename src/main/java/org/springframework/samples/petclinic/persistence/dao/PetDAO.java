package org.springframework.samples.petclinic.persistence.dao;

import java.util.List;

import org.springframework.samples.petclinic.bill.Bill;
import org.springframework.samples.petclinic.owner.Pet;
import org.springframework.stereotype.Repository;

@Repository
public class PetDAO extends AbstractJpaDAO<Pet,Integer> implements IPetDAO{

    public PetDAO() {
        super();

        setClazz(Pet.class);
    }

    
    public List<Pet> getPetsByIdNumber(long idNumber) {
    	
    	return getEntityManager().createQuery("select b from Pet b where b.idNumber= " + idNumber).getResultList();
    	
    }
    // API


	@Override
	public List<Pet> getPetsByIdNumberNamedQuery(long idNumber) {
		// TODO Auto-generated method stub
		return getEntityManager().createNamedQuery("petByIdNumber").setParameter("idNumber", idNumber).getResultList();
	}

}

