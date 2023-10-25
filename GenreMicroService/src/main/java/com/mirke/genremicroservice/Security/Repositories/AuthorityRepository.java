package com.mirke.genremicroservice.Security.Repositories;

import com.mirke.genremicroservice.Security.Entities.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorityRepository extends JpaRepository<Authority, Integer> {
}
