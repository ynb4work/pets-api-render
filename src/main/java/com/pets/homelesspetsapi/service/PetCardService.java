package com.pets.homelesspetsapi.service;

import com.pets.homelesspetsapi.dto.PetCardDTO;
import com.pets.homelesspetsapi.dto.mapper.PetCardMapper;
import com.pets.homelesspetsapi.entity.PetCard;
import com.pets.homelesspetsapi.repository.PetCardRepository;
import jakarta.transaction.Transactional;
<<<<<<< HEAD
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
=======
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
>>>>>>> c9facf68ab80df0023172476a8d4db98e3060df8
public class PetCardService {

    private final PetCardRepository petCardRepository;
    private final PetCardMapper petCardMapper;

<<<<<<< HEAD
    public PetCardService(PetCardRepository petCardRepository, PetCardMapper petCardMapper) {

        this.petCardRepository = petCardRepository;
        this.petCardMapper = petCardMapper;
    }

    public PetCardDTO save(PetCardDTO petCardDTO) {

        PetCard petCard = petCardMapper.mapToPetCard(petCardDTO);

        return petCardMapper.mapToPetCardDTO(petCardRepository.save(petCard));
    }


    public PetCardDTO findById(UUID id) {

        PetCard petCard = petCardRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("ID not found"));

=======
    @Transactional
    public PetCardDTO save(PetCardDTO petCardDTO) {

        PetCard petCard = petCardMapper.mapToPetCard(petCardDTO);
        PetCard savedPetCard = petCardRepository.save(petCard);
        return petCardMapper.mapToPetCardDTO(savedPetCard);
    }

    public PetCardDTO findById(Long id) {

        PetCard petCard = petCardRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("ID not found"));
>>>>>>> c9facf68ab80df0023172476a8d4db98e3060df8
        return petCardMapper.mapToPetCardDTO(petCard);
    }

    public List<PetCardDTO> findAll() {

<<<<<<< HEAD
        List<PetCard> allPetCards = petCardRepository.findAll();

        return petCardMapper.mapToListPetCardDTO(allPetCards);
    }

    @Transactional
    public PetCardDTO update(PetCardDTO petCardDTO, UUID id) {

        PetCard petCard = petCardRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("ID not found"));
        petCardDTO.setId(id);

        return petCardDTO;
    }

    @Transactional
    public void delete(UUID id) {

        findById(id);
=======
        List<PetCard> petCardList = petCardRepository.findAll();
        return petCardMapper.mapToListPetCardDTO(petCardList);
    }

    @Transactional
    public PetCardDTO update(PetCardDTO petCardDTO, Long id) {

        petCardRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("ID not found"));

        PetCard updatedPetCard = petCardMapper.mapToPetCard(petCardDTO);
        updatedPetCard.setId(id);

        return petCardMapper.mapToPetCardDTO(petCardRepository.save(updatedPetCard));
    }

    public void delete(Long id) {

>>>>>>> c9facf68ab80df0023172476a8d4db98e3060df8
        petCardRepository.deleteById(id);
    }
}
