package com.example.demo.DAO;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.user;

@Repository
@Transactional
public interface userDao extends JpaRepository<user,Integer> {

}
