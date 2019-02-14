package org.springframework.samples.petclinic.persistence.dao;

import java.util.List;


import org.springframework.samples.petclinic.visit.Visit;

/**
 * Interfaz para definir los métodos especificos para la entidad Bill
 * @author operator
 *
 */
public interface IVisitDAO extends IBaseDAO<Visit, Integer> {
	
	List<Visit> getVisitsByIdNumber(long idNumber);
	
	List<Visit> getVisitsByIdNumberNamedQuery(long idNumber);


}

