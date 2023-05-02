package com.petworld.service;


import com.petworld.dto.servicePackageDto.request.ServicePackageDtoRequest;
import com.petworld.dto.servicePackageDto.response.ServicePackageDtoResponse;

import java.util.List;
import java.util.Optional;

public interface ServicePackageService {
    ServicePackageDtoResponse saveServicePackage(ServicePackageDtoRequest servicePackageDtoRequest);

    List<ServicePackageDtoResponse> getAllServicePackages();

    Optional<ServicePackageDtoResponse> getServicePackage(Long id);

    void deleteByIdByStatus(Long id);

    List<ServicePackageDtoResponse> getAllServicePackageByName(String name);
}