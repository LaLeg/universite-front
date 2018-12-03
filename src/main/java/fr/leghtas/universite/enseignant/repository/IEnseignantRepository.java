package fr.leghtas.universite.enseignant.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import fr.leghtas.universite.enseignant.domain.Enseignant;

@Repository

public interface IEnseignantRepository {

	Enseignant getOne(Integer id);

	List<Enseignant> findAll();

	Enseignant save(Enseignant enseignant);

	void deleteById(Integer id);

}
