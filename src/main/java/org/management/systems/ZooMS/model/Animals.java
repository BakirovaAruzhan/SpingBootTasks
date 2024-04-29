package org.management.systems.ZooMS.model;

import jakarta.persistence.*;
import lombok.*;


@ToString
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "Animals")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
 public class Animals {
    @Id
    private long id;
    private String name;
    private String type;
    private String age;
    private double price;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ZooShop_id")
    private ZooShop zooShop;


    public Animals(String name, String type, String age, double price) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.price = price;
    }
}
