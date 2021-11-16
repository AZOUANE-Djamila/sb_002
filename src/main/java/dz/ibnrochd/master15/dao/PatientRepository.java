package dz.ibnrochd.master15.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import dz.ibnrochd.master15.model.Patient;


@RepositoryRestResource (collectionResourceRel="patients", path="patients")
public interface PatientRepository extends JpaRepository<Patient, Integer> 
{
	// ajouter la signature d'une méthode pour rechercher des patients par leurs noms (convention Spring Data)

	List<Patient> findByNom(@Param("nom") String nom);

}
