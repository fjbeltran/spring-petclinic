package org.springframework.samples.petclinic.persistence.dao;

import java.util.List;


import org.springframework.samples.petclinic.owner.Owner;

/**
 * Interfaz para definir los métodos especificos para la entidad Bill
 * @author operator
 *
 */
public interface IOwnerDAO extends IBaseDAO<Owner, Integer> {
	
	List<Owner> getOwnersByIdNumber(long idNumber);
	
	List<Owner> getOwnersByIdNumberNamedQuery(long idNumber);


}

