package com.example.podcastcreatormicroservice.Security.Repositories;



import com.example.podcastcreatormicroservice.Security.Entities.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorityRepository extends JpaRepository<Authority, Integer> {
}
