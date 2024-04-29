package org.management.systems.ZooMS.service;

import org.management.systems.ZooMS.model.Animals;
import org.springframework.stereotype.Service;

import java.util.List;

public interface  AnimalsService {
    List<Animals> getAll();
    void save(Animals animals);
    void delete(Animals animals);
    Animals getById(Long id);

    List<Animals> getAllByShop(Long shopId);


}
