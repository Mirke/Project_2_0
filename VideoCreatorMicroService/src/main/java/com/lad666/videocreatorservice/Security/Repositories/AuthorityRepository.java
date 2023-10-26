package com.lad666.videocreatorservice.Security.Repositories;


import com.lad666.videocreatorservice.Security.Entities.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorityRepository extends JpaRepository<Authority, Integer> {
}
