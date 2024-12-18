package edu.com.francoSalazar.CL2_DAWI_Zalazar_Lopez.controller;

import edu.com.francoSalazar.CL2_DAWI_Zalazar_Lopez.dto.FilmDetailDto;
import edu.com.francoSalazar.CL2_DAWI_Zalazar_Lopez.dto.FilmDto;
import edu.com.francoSalazar.CL2_DAWI_Zalazar_Lopez.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/film")
public class FilmController {

    @Autowired
    FilmService filmService;

    @GetMapping("/lista")
    public String inicio(Model model){
        List<FilmDto> films= filmService.findAll();
        model.addAttribute("films",films);
        return "index";
    }

    @GetMapping("/detail/{id}")
    public String detail(@PathVariable Integer id,Model model){
        FilmDetailDto film=filmService.findById(id);
        model.addAttribute("film",film);
        return "film-detail";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable Integer id,Model model){
        FilmDetailDto film=filmService.findById(id);
        model.addAttribute("film",film);
        return "film-edit";
    }

    @PostMapping("/edit-confirm")
    public String editConfirm(@ModelAttribute("film") FilmDetailDto filmDetailDto,Model model){
        filmService.update(filmDetailDto);
        return "redirect:/film/lista";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Integer id){
        filmService.delete(id);
        return "redirect:/film/lista";
    }

    @GetMapping("/create")
    public String create(){
        return "film-create";
    }

    @PostMapping("/create-film")
    public String createNewFilm(FilmDetailDto filmDetailDto){
        filmService.save(filmDetailDto);
        return "redirect:/film/lista";
    }
}
