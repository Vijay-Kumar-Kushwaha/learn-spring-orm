package com.lcwd.orm.repositories;

import com.lcwd.orm.entities.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LaptopRepository extends JpaRepository<Laptop,Integer> {
}
