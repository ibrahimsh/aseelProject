package com.example.demo.DAO;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.models.user;

@Repository
@Transactional
public interface userDao extends JpaRepository<user,Integer> {
	
	@Query("select a from user a where a.email=:email and a.password=:password")
	public user checkUser(@Param("email")String email ,@Param("password") String  password);

}
