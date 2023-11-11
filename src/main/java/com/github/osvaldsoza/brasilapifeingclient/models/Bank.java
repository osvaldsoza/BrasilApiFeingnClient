package com.github.osvaldsoza.brasilapifeingclient.models;

public record Bank(
        String ispb,
        String name,
        Integer code,
        String fullName
){}

