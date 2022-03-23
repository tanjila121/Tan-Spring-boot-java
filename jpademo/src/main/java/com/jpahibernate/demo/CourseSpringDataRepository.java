package com.jpahibernate.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="courses")
public interface CourseSpringDataRepository extends JpaRepository<TanjilaCourse, Long> {
//List<TanjilaCourse> findByNameAndId(String name);
List<TanjilaCourse> findByName(String name);
//List<TanjilaCourse> countByName(String name);
//List<TanjilaCourse> findByNameOrderByIdDesc(String name);
//List<TanjilaCourse> deleteByName(String name);
//@Query("Select c From tanjila_Course c where name like '%database'") 
//List<TanjilaCourse> courseWithDatabaseInName();
//
//@Query(value="Select * From tanjila_Course c where name like '%database'") 
//List<TanjilaCourse> courseWithDatabaseInNameUsingNativeQuery();
//
//@Query(name="query_get_database") 
//List<TanjilaCourse> courseWithDatabaseInNameUsingNamedQuery();

}
