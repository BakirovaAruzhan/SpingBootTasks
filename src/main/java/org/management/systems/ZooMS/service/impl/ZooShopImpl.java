package org.management.systems.ZooMS.service.impl;

import org.management.systems.ZooMS.model.ZooShop;
import org.management.systems.ZooMS.repository.ZooShopRepository;
import org.management.systems.ZooMS.service.ZooShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZooShopImpl implements ZooShopService {
    @Autowired
    private ZooShopRepository zooShopRepository;

    @Override
    public List<ZooShop> getAll() {
        return zooShopRepository.findAll();
    }

    @Override
    public ZooShop save(ZooShop zooShop) {
        return zooShopRepository.save(zooShop);
    }

    @Override
    public void delete(ZooShop zooShop) {
        zooShopRepository.delete(zooShop);
    }

    @Override
    public ZooShop getById(Long id) {
        return zooShopRepository.findById(id).orElse(null);
    }
}
