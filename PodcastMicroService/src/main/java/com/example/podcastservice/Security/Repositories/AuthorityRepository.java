package com.example.podcastservice.Security.Repositories;

import com.example.podcastservice.Security.Entities.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorityRepository extends JpaRepository<Authority, Integer> {
}
