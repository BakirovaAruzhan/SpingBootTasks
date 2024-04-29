package org.management.systems.ZooMS.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "Four_legged")
public class Four_legged extends Animals {
    public Four_legged(String name, String type, String age, double price) {
        super(name, type, age, price);
    }
}
