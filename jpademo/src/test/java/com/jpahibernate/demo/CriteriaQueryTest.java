package com.jpahibernate.demo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

//import com.jpahibernate.demo.CourseRepository;
//import com.jpahibernate.demo.tanjila_Course;

@RunWith(SpringRunner.class)
@SpringBootTest
class CriteriaQueryTest {

private Logger logger = LoggerFactory.getLogger(this.getClass());
@Autowired
EntityManager em;

//@Test
// public void jpql_basic() {
// Query query = em.createNamedQuery("Select c From TanjilaCourse c");
// List resultList = query.getResultList();
// logger.info("Select c From tanjila_course c ->{}", resultList);
// }
// @Test
// public void jpql_typed() {
// TypedQuery<TanjilaCourse> query =
// em.createNamedQuery("query_get_all_courses",TanjilaCourse.class);
// List<TanjilaCourse> resultList = query.getResultList();
// logger.info("Select c From tanjila_course c ->{}", resultList);
// }
@Test
public void all_courses() {
//Select c From tanjila_Course c

//1 use Criteria Builder to create a Criteria query returning to expected resukt object
CriteriaBuilder cb = em.getCriteriaBuilder();
CriteriaQuery<TanjilaCourse> cq = cb.createQuery(TanjilaCourse.class);

//2 define root for tables which are involved in query
Root<TanjilaCourse> courseRoot = cq.from(TanjilaCourse.class);

//3 define predicate etc using criteria builder

//4 add predicate etc to the criteria query

//5 build the typed query using entity manager and criteria query
TypedQuery<TanjilaCourse> query =
em.createQuery(cq.select(courseRoot));
List<TanjilaCourse> resultList = query.getResultList();
logger.info("Typed Query ->{}", resultList);
}
@Test
public void all_courses_having_database() {
//Select c From tanjila_course c where name like '%database

//1 use Criteria Builder to create a Criteria query returning to expected resukt object
CriteriaBuilder cb = em.getCriteriaBuilder();
CriteriaQuery<TanjilaCourse> cq = cb.createQuery(TanjilaCourse.class);

//2 define root for tables which are involved in query
Root<TanjilaCourse> courseRoot = cq.from(TanjilaCourse.class);

//3 define predicate etc using criteria builder
Predicate likedatabase = cb.like(courseRoot.get("name"), "%database");

//4 add predicate etc to the criteria query
cq.where(likedatabase);

//5 build the typed query using entity manager and criteria query
TypedQuery<TanjilaCourse> query =
em.createQuery(cq.select(courseRoot));
List<TanjilaCourse> resultList = query.getResultList();
logger.info("Select c From tanjila_course c where name like '%database'->{}", resultList);
}
@Test
public void all_courses_without_students() {
//Select c From tanjila_course c where c.students is empty

//1 use Criteria Builder to create a Criteria query returning to expected resukt object
CriteriaBuilder cb = em.getCriteriaBuilder();
CriteriaQuery<TanjilaCourse> cq = cb.createQuery(TanjilaCourse.class);

//2 define root for tables which are involved in query
Root<TanjilaCourse> courseRoot = cq.from(TanjilaCourse.class);

//3 define predicate etc using criteria builder
Predicate studentsIsEmpty = cb.isEmpty(courseRoot.get("students"));

//4 add predicate etc to the criteria query
cq.where(studentsIsEmpty);

//5 build the typed query using entity manager and criteria query
TypedQuery<TanjilaCourse> query =
em.createQuery(cq.select(courseRoot));
List<TanjilaCourse> resultList = query.getResultList();
logger.info("Typed Query ->{}", resultList);
}

@Test
public void joins() {
//Select c From tanjila_course c join c.students s

//1 use Criteria Builder to create a Criteria query returning to expected resukt object
CriteriaBuilder cb = em.getCriteriaBuilder();
CriteriaQuery<TanjilaCourse> cq = cb.createQuery(TanjilaCourse.class);

//2 define root for tables which are involved in query
Root<TanjilaCourse> courseRoot = cq.from(TanjilaCourse.class);

//3 define predicate etc using criteria builder
Predicate studentsIsEmpty = cb.isEmpty(courseRoot.get("students"));

//4 add predicate etc to the criteria query
cq.where(studentsIsEmpty);

//5 build the typed query using entity manager and criteria query
TypedQuery<TanjilaCourse> query =
em.createQuery(cq.select(courseRoot));
List<TanjilaCourse> resultList = query.getResultList();
logger.info("Typed Query ->{}", resultList);
}

@Test
public void left_join() {
//Select c From tanjila_course c join c.students s

//1 use Criteria Builder to create a Criteria query returning to expected resukt object
CriteriaBuilder cb = em.getCriteriaBuilder();
CriteriaQuery<TanjilaCourse> cq = cb.createQuery(TanjilaCourse.class);

//2 define root for tables which are involved in query
Root<TanjilaCourse> courseRoot = cq.from(TanjilaCourse.class);

//3 define predicate etc using criteria builder
Join<Object,Object> join = courseRoot.join("students",JoinType.LEFT);

//4 add predicate etc to the criteria query

//5 build the typed query using entity manager and criteria query
TypedQuery<TanjilaCourse> query =
em.createQuery(cq.select(courseRoot));
List<TanjilaCourse> resultList = query.getResultList();
logger.info("Typed Query ->{}", resultList);
}


}