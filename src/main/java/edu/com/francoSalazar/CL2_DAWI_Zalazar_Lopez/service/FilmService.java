package edu.com.francoSalazar.CL2_DAWI_Zalazar_Lopez.service;


import edu.com.francoSalazar.CL2_DAWI_Zalazar_Lopez.dto.FilmDetailDto;
import edu.com.francoSalazar.CL2_DAWI_Zalazar_Lopez.dto.FilmDto;

import java.util.List;

public interface FilmService {

    List<FilmDto> findAll();
    FilmDetailDto findById(Integer id);
    Boolean update(FilmDetailDto filmDetailDto);
    Boolean delete(Integer id);
    Boolean save(FilmDetailDto filmDetailDto);

}
