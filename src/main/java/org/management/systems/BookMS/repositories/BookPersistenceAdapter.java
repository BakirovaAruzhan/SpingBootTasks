package org.management.systems.BookMS.repositories;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.management.systems.BookMS.domain.Book;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookPersistenceAdapter {
    @PersistenceContext
    private EntityManager entityManager;

    public Book getBookById(Long id) {
        return entityManager.find(Book.class, id);
    }
    public Book saveBook(Book book) {
        if (book.getId() == null) {
            entityManager.persist(book);
            return book;
        } else {
            return entityManager.merge(book);
        }
    }

    public void deleteBookById(Long id) {
        Book book = entityManager.find(Book.class, id);
        if (book != null) {
            entityManager.remove(book);
        }
    }

    public List<Book> findAllBooks() {
        TypedQuery<Book> query = entityManager.createQuery("SELECT b FROM Book b", Book.class);
        return query.getResultList();
    }



}
