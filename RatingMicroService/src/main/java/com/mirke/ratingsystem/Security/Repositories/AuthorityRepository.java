package com.mirke.ratingsystem.Security.Repositories;

import com.mirke.ratingsystem.Security.Entities.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorityRepository extends JpaRepository<Authority, Integer> {
}
