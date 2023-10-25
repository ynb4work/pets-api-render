package com.pets.homelesspetsapi.service;

import com.pets.homelesspetsapi.dto.PetCardDTO;
import com.pets.homelesspetsapi.dto.mapper.PetCardMapper;
import com.pets.homelesspetsapi.entity.PetCard;
import com.pets.homelesspetsapi.repository.PetCardRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PetCardService {

    private final PetCardRepository petCardRepository;
    private final PetCardMapper petCardMapper;

    @Transactional
    public PetCardDTO save(PetCardDTO petCardDTO) {

        PetCard petCard = petCardMapper.mapToPetCard(petCardDTO);
        PetCard savedPetCard = petCardRepository.save(petCard);
        return petCardMapper.mapToPetCardDTO(savedPetCard);
    }

    public PetCardDTO findById(Long id) {

        PetCard petCard = petCardRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("ID not found"));
        return petCardMapper.mapToPetCardDTO(petCard);
    }

    public List<PetCardDTO> findAll() {

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

        petCardRepository.deleteById(id);
    }
}
