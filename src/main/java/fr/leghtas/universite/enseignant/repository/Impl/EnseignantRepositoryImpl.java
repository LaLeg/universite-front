package fr.leghtas.universite.enseignant.repository.Impl;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import fr.leghtas.universite.enseignant.domain.Enseignant;
import fr.leghtas.universite.enseignant.repository.IEnseignantRepository;

@Repository
public class EnseignantRepositoryImpl implements IEnseignantRepository {
	private static final String URL = "http://localhost:8080/enseignants/";

	@Override
	public Enseignant getOne(Integer id) {
		RestTemplate restTemplate = new RestTemplate();
		Enseignant en = restTemplate.getForObject(URL + id, Enseignant.class);

		return en;
	}

	@Override
	public List<Enseignant> findAll() {
		RestTemplate restTemplate = new RestTemplate();
		List<Enseignant> liste = restTemplate
				.exchange(URL, HttpMethod.GET, null, new ParameterizedTypeReference<List<Enseignant>>() {
				}).getBody();
		return liste;

	}

	@Override
	public Enseignant save(Enseignant enseignant) {
		RestTemplate restTemplate = new RestTemplate();
		Enseignant en = restTemplate.postForObject(URL, enseignant, Enseignant.class);
		return en;
	}

	@Override
	public void deleteById(Integer id) {
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.delete(URL + id);

	}

}
