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
<<<<<<< HEAD

import java.util.List;
import java.util.UUID;
=======
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
>>>>>>> c9facf68ab80df0023172476a8d4db98e3060df8

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
<<<<<<< HEAD
    public PetCardDTO findById(@PathVariable UUID id) {
=======
    public PetCardDTO findById(@PathVariable Long id) {
>>>>>>> c9facf68ab80df0023172476a8d4db98e3060df8

        return petCardService.findById(id);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
<<<<<<< HEAD
    public PetCardDTO update(@RequestBody PetCardDTO petCardDTO, @PathVariable UUID id) {
=======
    public PetCardDTO update(@RequestBody PetCardDTO petCardDTO, @PathVariable Long id) {
>>>>>>> c9facf68ab80df0023172476a8d4db98e3060df8

        return petCardService.update(petCardDTO, id);
    }

    @DeleteMapping("/{id}")
<<<<<<< HEAD
    @ResponseStatus(value = HttpStatus.OK, reason = "PetCard deleted successfully")
    public void delete(@PathVariable UUID id) {

        petCardService.delete(id);
    }
}
=======
    @ResponseStatus(HttpStatus.OK)
    public String delete(@PathVariable Long id) {

        if (petCardService.findById(id) == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "PetCard not found");
        } else {
            petCardService.delete(id);
            return "PetCard deleted successfully";
        }
    }
}

>>>>>>> c9facf68ab80df0023172476a8d4db98e3060df8
