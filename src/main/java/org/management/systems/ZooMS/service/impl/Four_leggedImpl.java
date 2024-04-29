package org.management.systems.ZooMS.service.impl;

import org.management.systems.ZooMS.model.Animals;
import org.management.systems.ZooMS.model.Four_legged;
import org.management.systems.ZooMS.repository.Four_leggedRepository;
import org.management.systems.ZooMS.service.Four_leggedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Four_leggedImpl implements Four_leggedService {

    @Autowired
    private Four_leggedRepository fourLeggedRepository;

    @Override
    public List<Animals> getAll() {
        return fourLeggedRepository.findAll();
    }

    @Override
    public void save(Four_legged fourLegged) {
        fourLeggedRepository.save(fourLegged);
    }

    @Override
    public void delete(Four_legged fourLegged) {
        fourLeggedRepository.delete(fourLegged);
    }

    @Override
    public Animals getById(Long id) {
        return fourLeggedRepository.findById(id).orElse(null);
    }
}



