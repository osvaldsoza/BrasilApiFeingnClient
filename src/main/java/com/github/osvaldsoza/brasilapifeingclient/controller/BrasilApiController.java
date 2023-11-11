package com.github.osvaldsoza.brasilapifeingclient.controller;

import com.github.osvaldsoza.brasilapifeingclient.models.Bank;
import com.github.osvaldsoza.brasilapifeingclient.models.Holliday;
import com.github.osvaldsoza.brasilapifeingclient.repository.BrasilApiClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("external/brasil-api")
public class BrasilApiController {

    @Autowired
    BrasilApiClient brasilApiClient;

    @GetMapping("banks")
    public List<Bank> listBanks() {
        return brasilApiClient.banks();
    }

    @GetMapping("hollidays/{year}")
    public List<Holliday> listHollidays(@PathVariable("year") int year){
        return brasilApiClient.hollidays(year);
    }
}
