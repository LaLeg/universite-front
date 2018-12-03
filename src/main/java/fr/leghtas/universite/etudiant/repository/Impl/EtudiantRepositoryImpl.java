package fr.leghtas.universite.etudiant.repository.Impl;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import fr.leghtas.universite.etudiant.domain.Etudiant;
import fr.leghtas.universite.etudiant.repository.IEtudiantRepository;

@Repository
public class EtudiantRepositoryImpl implements IEtudiantRepository {
	private static final String URL = "http://localhost:8080/etudiants/";

	@Override
	public Etudiant getOne(Integer id) {
		RestTemplate restTemplate = new RestTemplate();
		Etudiant et = restTemplate.getForObject(URL + id, Etudiant.class);
		return et;
	}

	@Override
	public List<Etudiant> findAll() {

		RestTemplate restTemplate = new RestTemplate();
		List<Etudiant> liste = restTemplate
				.exchange(URL, HttpMethod.GET, null, new ParameterizedTypeReference<List<Etudiant>>() {
				}).getBody();

		return liste;
	}

	@Override
	public Etudiant save(Etudiant etudiant) {
		RestTemplate restTemplate = new RestTemplate();
		Etudiant et = restTemplate.postForObject(URL, etudiant, Etudiant.class);
		return et;
	}

	@Override
	public void deleteById(Integer id) {

	}

	@Override
	public void update(Etudiant etudiant) {
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.put(URL + etudiant.getId(), etudiant);

	}

}
