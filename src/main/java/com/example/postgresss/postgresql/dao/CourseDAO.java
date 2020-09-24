package com.example.postgresss.postgresql.dao;

import com.example.postgresss.postgresql.entities.Course;
import org.springframework.data.repository.CrudRepository;
import java.util.UUID;
public interface CourseDAO extends CrudRepository<Course, UUID>{}
