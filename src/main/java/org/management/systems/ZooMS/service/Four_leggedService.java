package org.management.systems.ZooMS.service;

import org.management.systems.ZooMS.model.Animals;
import org.management.systems.ZooMS.model.Four_legged;

import java.util.List;

public interface Four_leggedService {
    List<Animals> getAll();
    void save(Four_legged fourLegged);
    void delete(Four_legged fourLegged);
    Animals getById(Long id);


}
