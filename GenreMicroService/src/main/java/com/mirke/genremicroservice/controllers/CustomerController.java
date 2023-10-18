package com.mirke.genremicroservice.controllers;

import com.mirke.genremicroservice.model.Genre;
import java.util.List;
import com.mirke.genremicroservice.service.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/api/edufy/genre")
public class CustomerController {

    @Autowired
    private GenreService genreService;

    public CustomerController() { }

    @GetMapping
    public List<Genre> getAllGenres(){
        return genreService.getAllGenres();
    }

}
