package com.cjss.ReturnService.service;

import com.cjss.ReturnService.model.StatusUpdate;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class ReturnService {
    RestTemplate rt = new RestTemplate();
    public StatusUpdate updateStatus(String itemId){
        String url = UriComponentsBuilder.fromUriString("http://localhost:8084/update-item-status")
                .build().toUriString();

        ResponseEntity<StatusUpdate> result = rt.postForEntity(url, new StatusUpdate(itemId,"RETURN","FROM RETURN SERVICE"), StatusUpdate.class);
        return    result.getBody();
}}
