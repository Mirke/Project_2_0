package com.lad666.albummicroservice.Security.Repositories;

import com.lad666.albummicroservice.Security.Entities.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorityRepository extends JpaRepository<Authority, Integer> {
}
