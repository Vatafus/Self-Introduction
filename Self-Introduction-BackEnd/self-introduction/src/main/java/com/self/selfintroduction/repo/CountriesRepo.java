package com.self.selfintroduction.repo;

import com.self.selfintroduction.domain.Countries;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountriesRepo extends JpaRepository<Countries,Long> {
}
