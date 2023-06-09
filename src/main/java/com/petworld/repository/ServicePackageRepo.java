package com.petworld.repository;

import com.petworld.domain.ServicePackage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;


@Repository
public interface ServicePackageRepo extends JpaRepository<ServicePackage,Long> {
    @Modifying
    @Query("UPDATE ServicePackage sp SET sp.isActive = false WHERE sp.id = :id")
    void deleteByIdPackageService(@Param("id") Long id);

    @Query("SELECT sp FROM ServicePackage sp WHERE sp.name = :name")
    List<ServicePackage> findServicePackageByName(String name);
}
