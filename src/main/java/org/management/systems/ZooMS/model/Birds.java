package org.management.systems.ZooMS.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "Birds")
public class Birds extends Animals {


    public Birds(String name, String type, String age, double price) {
        super(name, type, age, price);
    }
}
