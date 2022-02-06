package com.cjss.ReturnService.controller;

import com.cjss.ReturnService.model.StatusUpdate;
import com.cjss.ReturnService.service.ReturnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    @Autowired
    private ReturnService service;
    @PostMapping("/return-item/{itemId}")
    public ResponseEntity<StatusUpdate> returnItem(@PathVariable("itemId") String itemId){
        return  service.updateStatus(itemId);
    }
}
