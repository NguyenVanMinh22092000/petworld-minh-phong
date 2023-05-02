package com.petworld.service.impl;

import com.petworld.domain.ServiceImage;
import com.petworld.repository.ServiceImageRepo;
import com.petworld.service.ServiceImageService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class ServiceImageServiceImpl implements ServiceImageService {
    private final ServiceImageRepo serviceImageRepo;
    @Override
    public List<ServiceImage> findAll() {
        return null;
    }

    @Override
    public ServiceImage findById(Long id) {
        return null;
    }

    @Override
    public ServiceImage findByName(String name) {
        return null;
    }

    @Override
    public void remove(Long id) {

    }

    @Override
    public ServiceImage save(ServiceImage serviceImage) {
        return null;
    }
}
