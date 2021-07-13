package com.api.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.entity.Alumno;

@Repository
public interface ARepository extends JpaRepository<Alumno, Long>{

	

}
