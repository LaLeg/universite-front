package fr.leghtas.universite.etudiant.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import fr.leghtas.universite.etudiant.domain.Etudiant;

@Repository

public interface IEtudiantRepository {

	Etudiant getOne(Integer id);

	List<Etudiant> findAll();

	Etudiant save(Etudiant etudiant);

	void update(Etudiant etudiant);

	void deleteById(Integer id);
}
