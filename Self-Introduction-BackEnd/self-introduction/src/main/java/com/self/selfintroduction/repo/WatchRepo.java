package com.self.selfintroduction.repo;

import com.self.selfintroduction.domain.Watches;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WatchRepo extends JpaRepository<Watches,Long> {
}
