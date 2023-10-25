package com.self.selfintroduction.services;

import com.self.selfintroduction.domain.Watches;
import com.self.selfintroduction.repo.WatchRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class WatcheService {

    private final WatchRepo watchRepo;

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
}
