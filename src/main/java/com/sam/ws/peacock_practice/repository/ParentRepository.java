package com.sam.ws.peacock_practice.repository;

import com.sam.ws.peacock_practice.entity.Parent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParentRepository extends JpaRepository<Parent, Long> {
}
