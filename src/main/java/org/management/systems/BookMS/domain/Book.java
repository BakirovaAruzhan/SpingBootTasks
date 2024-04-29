package org.management.systems.BookMS.domain;

import jakarta.persistence.Entity;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.xml.crypto.Data;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@Entity
public class Book {

    private Long id;
    private String title;
    private String author;
    private String isbn;
    private Data publishedDate;
    private double price;
    private Category category;

}
