package org.management.systems.ZooMS.repository;

import org.management.systems.ZooMS.model.Animals;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Primary
public interface AnimalsRepository extends JpaRepository<Animals, Long> {
    List<Animals>  findAllByZooShop_Id(Long shopId);
}
