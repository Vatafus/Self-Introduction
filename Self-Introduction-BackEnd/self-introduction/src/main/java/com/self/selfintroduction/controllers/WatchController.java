package com.self.selfintroduction.controllers;


import com.self.selfintroduction.domain.Watches;
import com.self.selfintroduction.services.WatcheService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("watches")
public class WatchController {

    @Autowired
    WatcheService watcheService;

    @GetMapping("/mywatchcollection")
    public List<Watches> getAllWatches(){
        return watcheService.findeAllWatches();
    }


    @PostMapping("/addwatch")
    public Watches addwatch(@RequestBody @Valid Watches watch) {
        return watcheService.addNewWatch(watch);
    }
}
