package com.self.selfintroduction.services;

import com.self.selfintroduction.domain.Watches;
import com.self.selfintroduction.repo.WatchRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Comparator;
import java.util.List;

@Service
public class WatcheService {

    private final WatchRepo watchRepo;
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public WatcheService(WatchRepo watchRepo){
        this.watchRepo = watchRepo;
    }

    public List<Watches> findeAllWatches(){
        return watchRepo.findAll();
    }

    public Watches addNewWatch(Watches watch) {
        return watchRepo.save(watch);
    }


    public boolean isTableEmpty() {
        Integer count = jdbcTemplate.queryForObject("SELECT COUNT(*) FROM self.watches", Integer.class);
        return count != null && count == 0;
    }

    public void resetSequence() {
        jdbcTemplate.execute("ALTER SEQUENCE self.watches_id_seq RESTART WITH 1");
    }

    public void deleteWatch(Long id){
        watchRepo.deleteById(id);
        if (isTableEmpty()) {
            resetSequence();
        }
    }


}
