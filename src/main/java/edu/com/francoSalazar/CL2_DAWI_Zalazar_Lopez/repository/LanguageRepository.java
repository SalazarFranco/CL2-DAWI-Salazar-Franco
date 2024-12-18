package edu.com.francoSalazar.CL2_DAWI_Zalazar_Lopez.repository;

import edu.com.francoSalazar.CL2_DAWI_Zalazar_Lopez.model.Language;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LanguageRepository extends CrudRepository<Language,Integer> {
}
