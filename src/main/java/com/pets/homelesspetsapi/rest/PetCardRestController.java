package com.pets.homelesspetsapi.rest;

import com.pets.homelesspetsapi.dto.PetCardDTO;
import com.pets.homelesspetsapi.service.PetCardService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/pet-cards")
public class PetCardRestController {

    private final PetCardService petCardService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public PetCardDTO save(@RequestBody PetCardDTO petCardDTO) {

        return petCardService.save(petCardDTO);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<PetCardDTO> findAll() {

        return petCardService.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public PetCardDTO findById(@PathVariable UUID id) {

        return petCardService.findById(id);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public PetCardDTO update(@RequestBody PetCardDTO petCardDTO, @PathVariable UUID id) {

        return petCardService.update(petCardDTO, id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(value = HttpStatus.OK, reason = "PetCard deleted successfully")
    public void delete(@PathVariable UUID id) {

        petCardService.delete(id);
    }
}
