package com.tan.database.database2demo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.BeanPropertyRowMapper;


@Repository
public class PersonJdbcDao {
	
@Autowired
 JdbcTemplate jdbcTemplate;   
class tanjila_PersonRowMapper implements RowMapper<tanjila_Person>{

	@Override
	public tanjila_Person mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		tanjila_Person person = new tanjila_Person();
		person.setId(rs.getInt("id"));
		person.setName(rs.getString("name"));
		person.setLocation(rs.getString("location"));
		person.setBirthdate(rs.getTimestamp("birthdate"));
		return person;
	}
	
}

//@SuppressWarnings("unchecked")
//public List<tanjila_Person> findAll(){
//	return jdbcTemplate.query("select * from tanjila_Person",new BeanPropertyRowMapper(tanjila_Person.class));	
//}

//@SuppressWarnings("deprecation")
//public tanjila_Person findById(int id) {
//	return jdbcTemplate.queryForObject("select * from tanjila_Person"+" where id=?", new Object[]{id},
//			new BeanPropertyRowMapper<tanjila_Person>(tanjila_Person.class));
//} 

//public int deleteById(int id) {
//	return jdbcTemplate.update("delete from tanjila_Person where id=?", new Object[] { id });
//}
//public int insert(tanjila_Person person) {
//	return jdbcTemplate.update("insert into tanjila_Person(id, name, location, birthdate)" + "values(?,  ?, ?, ?)",
//			new Object[] { person.getId(), person.getName(), person.getLocation(),
//					new Timestamp(person.getBirthdate().getTime()) });
//}
//public int update(tanjila_Person person) {
//	return jdbcTemplate.update("update tanjila_Person "+"set name=?, location=?,birthdate=?" + " where id =?",
//			new Object[] {person.getName(), person.getLocation(),
//					new Timestamp(person.getBirthdate().getTime()),person.getId()});
//}



}
