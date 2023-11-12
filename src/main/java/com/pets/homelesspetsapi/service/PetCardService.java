package com.pets.homelesspetsapi.service;

import com.pets.homelesspetsapi.dto.PetCardDTO;
import com.pets.homelesspetsapi.dto.mapper.PetCardMapper;
import com.pets.homelesspetsapi.entity.PetCard;
import com.pets.homelesspetsapi.repository.PetCardRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class PetCardService {

    private final PetCardRepository petCardRepository;
    private final PetCardMapper petCardMapper;

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

        return petCardMapper.mapToPetCardDTO(petCard);
    }

    public List<PetCardDTO> findAll() {

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
        petCardRepository.deleteById(id);
    }
}
