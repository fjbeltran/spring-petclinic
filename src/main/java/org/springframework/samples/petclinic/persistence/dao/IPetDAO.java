package org.springframework.samples.petclinic.persistence.dao;

import java.util.List;


import org.springframework.samples.petclinic.owner.Pet;

/**
 * Interfaz para definir los métodos especificos para la entidad Bill
 * @author operator
 *
 */
public interface IPetDAO extends IBaseDAO<Pet, Integer> {
	
	List<Pet> getPetsByIdNumber(long idNumber);
	
	List<Pet> getPetsByIdNumberNamedQuery(long idNumber);


}

