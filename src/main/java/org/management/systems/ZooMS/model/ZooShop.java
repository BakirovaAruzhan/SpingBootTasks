package org.management.systems.ZooMS.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@Data
@Entity
@ToString
public class ZooShop{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String address;
    private double amountAnimals;

    public ZooShop(String name, String address, double amountAnimals) {
        this.name = name;
        this.address = address;
        this.amountAnimals = amountAnimals;
    }
}