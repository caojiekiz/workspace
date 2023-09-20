package com.kiz.service;

import com.kiz.domain.Province;

import java.util.List;

public interface ProvinceService {
    public List<Province> findAll();
    public String findAllJson();
}
