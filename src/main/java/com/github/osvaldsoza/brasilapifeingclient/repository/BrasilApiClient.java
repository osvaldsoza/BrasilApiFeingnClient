package com.github.osvaldsoza.brasilapifeingclient;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "brasilapi", url = "https://brasilapi.com.br/api/")
public interface BrasilApiClient {
}
