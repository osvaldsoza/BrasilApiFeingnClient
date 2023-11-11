package com.github.osvaldsoza.brasilapifeingclient.repository;

import com.github.osvaldsoza.brasilapifeingclient.models.Bank;
import com.github.osvaldsoza.brasilapifeingclient.models.Holliday;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Component
@FeignClient(value = "brasilapi", url = "https://brasilapi.com.br/api/")
public interface BrasilApiClient {

    @GetMapping("banks/v1")
    List<Bank> banks();

    @GetMapping("feriados/v1/{ano}")
    List<Holliday> hollidays(@PathVariable("ano") int ano);
}
