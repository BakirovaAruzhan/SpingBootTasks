package org.management.systems.ZooMS.service;

import org.management.systems.ZooMS.model.ZooShop;

import java.util.List;

public interface ZooShopService {
    List<ZooShop> getAll();
    ZooShop save(ZooShop shop);
    void delete(ZooShop shop);
    ZooShop getById(Long id);
}
