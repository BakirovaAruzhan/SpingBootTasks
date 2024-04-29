package org.management.systems.BookMS.repositories;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.management.systems.BookMS.domain.Category;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CategoryPersistenceAdapter {
    @PersistenceContext
    private EntityManager entityManager;

    public Category getCategoryById(Long id) {
        return entityManager.find(Category.class, id);
    }


    public Category saveCategory(Category category) {
        entityManager.persist(category);
        return category;

    }
    public void deleteCategoryById(Long id) {
        Category category = entityManager.find(Category.class, id);
        if (category != null) {
            entityManager.remove(category);
        }
    }

    public List<Category> findAllCategories() {
        TypedQuery<Category> query = entityManager.createQuery("SELECT c FROM Category c", Category.class);
        return query.getResultList();
    }
}




