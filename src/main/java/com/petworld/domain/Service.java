package com.petworld.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "services")
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;

    private Float price;

    @OneToMany(targetEntity = ServiceImage.class)
    @JoinTable(name = "service_image_detail",
            joinColumns = @JoinColumn(name = "service_id"),
            inverseJoinColumns = @JoinColumn(name = "service_images_id"))
    private List<ServiceImage> serviceImages;


    @Column(name = "status")
    private boolean isStatus;
}