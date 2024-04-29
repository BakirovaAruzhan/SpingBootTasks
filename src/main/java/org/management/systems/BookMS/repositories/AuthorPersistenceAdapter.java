package org.management.systems.BookMS.repositories;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.management.systems.BookMS.domain.Author;
import org.springframework.stereotype.Repository;

@Repository
public class AuthorPersistenceAdapter {
    @PersistenceContext
    private EntityManager entityManager;

    public Author getAuthorById(Long id) {
        return entityManager.find(Author.class, id);
    }

    public Author saveAuthor(Author author) {
        entityManager.persist(author);
        return author;
    }

    public void deleteAuthorById(Long id) {
        Author author = entityManager.find(Author.class, id);
        if (author != null) {
            entityManager.remove(author);
        }
    }
}