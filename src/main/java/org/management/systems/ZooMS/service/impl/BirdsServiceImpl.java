package org.management.systems.ZooMS.service.impl;

import org.management.systems.ZooMS.model.Animals;
import org.management.systems.ZooMS.model.Birds;
import org.management.systems.ZooMS.repository.BirdsRepository;
import org.management.systems.ZooMS.service.BirdsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BirdsServiceImpl implements BirdsService {
    @Autowired
    private BirdsRepository birdsRepository;

    @Override

    public List<Animals> getAll() {
        return birdsRepository.findAll();
    }

    @Override
    public void save(Birds birds) {
        birdsRepository.save(birds);
    }

    @Override
    public void delete(Birds birds) {
        birdsRepository.delete(birds);
    }

    @Override
    public Animals getById(Long id) {
        return (Birds) birdsRepository.findById(id).orElse(null);
    }
}