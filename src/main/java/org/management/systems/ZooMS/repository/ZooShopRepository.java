package org.management.systems.ZooMS.repository;

import org.management.systems.ZooMS.model.ZooShop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZooShopRepository extends JpaRepository<ZooShop,Long> {
}
