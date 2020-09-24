package com.example.postgresss.postgresql.dao;

import com.example.postgresss.postgresql.entities.Teacher;
import org.springframework.data.repository.CrudRepository;
import java.util.UUID;
public interface TeacherDAO extends CrudRepository<Teacher, UUID>{}
