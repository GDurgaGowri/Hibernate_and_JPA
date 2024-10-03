package com.springtutorial.cruddemo;
import com.springtutorial.cruddemo.student;
public interface studentDAO {
    void save(student theStudent);
    student findById(Integer id);
    void update(student theStudent);
    void delete(Integer id);
}
