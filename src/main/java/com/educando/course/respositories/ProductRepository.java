package com.educando.course.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educando.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
