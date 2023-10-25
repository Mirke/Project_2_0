package com.mirke.mediamicroservice.Security.Repositories;

import com.mirke.mediamicroservice.Security.Entities.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorityRepository extends JpaRepository<Authority, Integer> {
}
