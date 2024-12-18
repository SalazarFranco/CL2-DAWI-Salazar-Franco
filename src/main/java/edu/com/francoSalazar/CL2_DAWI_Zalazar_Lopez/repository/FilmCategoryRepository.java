package edu.com.francoSalazar.CL2_DAWI_Zalazar_Lopez.repository;


import edu.com.francoSalazar.CL2_DAWI_Zalazar_Lopez.model.FilmCategory;
import edu.com.francoSalazar.CL2_DAWI_Zalazar_Lopez.model.FilmCategoryId;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmCategoryRepository extends CrudRepository<FilmCategory, FilmCategoryId> {
}
