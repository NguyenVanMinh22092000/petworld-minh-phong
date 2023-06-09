package com.petworld.dto.servicePackageDto.response;

import com.petworld.domain.Service;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ServicePackageDtoResponse {
    private Long id;
    private String name;
//    private String description;
    private Float minPrice;
    private Float maxPrice;
    private String image;
    private List<Service> services;
    private boolean isActive;
    private String status;
}
