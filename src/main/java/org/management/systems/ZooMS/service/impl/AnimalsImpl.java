package org.management.systems.ZooMS.service.impl;

import org.management.systems.ZooMS.model.Animals;
import org.management.systems.ZooMS.repository.AnimalsRepository;
import org.management.systems.ZooMS.service.AnimalsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalsImpl implements AnimalsService {
    @Autowired
    private AnimalsRepository animalsRepository;

    @Override
    public List<Animals> getAll() {
        return animalsRepository.findAll();
    }

    @Override
    public void save(Animals gadget) {
        animalsRepository.save(gadget);
    }

    @Override
    public void delete(Animals gadget) {
        animalsRepository.delete(gadget);
    }

    @Override
    public Animals getById(Long id) {
        return animalsRepository.findById(id).orElse(null);
    }

    @Override
    public List<Animals> getAllByShop(Long shopId) {
        return animalsRepository.findAllByZooShop_Id(shopId);
    }
}
