package com.lad666.artistservice.Security.Repositories;

import com.lad666.artistservice.Security.Entities.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorityRepository extends JpaRepository<Authority, Integer> {
}
