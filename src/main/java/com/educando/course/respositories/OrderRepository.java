package com.educando.course.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educando.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
