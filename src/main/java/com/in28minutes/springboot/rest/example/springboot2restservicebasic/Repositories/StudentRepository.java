package com.in28minutes.springboot.rest.example.springboot2restservicebasic.Repositories;

import com.in28minutes.springboot.rest.example.springboot2restservicebasic.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}

/**
 *
 * We are extending the JpaRepository using two generics - Student & Long. Student is the entity that is being managed
 * and the primary key of Student is Long
 *
 * The JpaRepository extends PagingAndSortingRepository<T, ID>, QueryByExampleExecutor<T>
 * The PagingAndSortingRepository extends the CrudRepository
 *
 */
