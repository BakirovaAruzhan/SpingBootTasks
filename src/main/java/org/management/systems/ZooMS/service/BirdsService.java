package org.management.systems.ZooMS.service;

import org.management.systems.ZooMS.model.Animals;
import org.management.systems.ZooMS.model.Birds;

import java.util.List;

public interface BirdsService {
    List<Animals> getAll();
    void save(Birds birds);
    void delete(Birds birds);
    Animals getById(Long id);

}
