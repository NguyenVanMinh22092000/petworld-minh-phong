package com.petworld.repository;

import com.petworld.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    @Modifying
    @Query( value = "select p from Product p where p.status = true ")
    List<Product> findAllProducts();
    @Transactional
    @Modifying
    @Query("UPDATE Product p SET p.status = false WHERE p.id = :id")
    void deleteProductById(@Param("id") Long id);
}
