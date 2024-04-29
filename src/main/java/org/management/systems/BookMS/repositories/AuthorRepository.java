package org.management.systems.BookMS.repositories;

import org.management.systems.BookMS.domain.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author,Long > {
}
