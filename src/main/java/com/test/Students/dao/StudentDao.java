package com.test.Students.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.Students.entity.StudentsRecord;

public interface StudentDao extends	JpaRepository<StudentsRecord, Integer>{

}
