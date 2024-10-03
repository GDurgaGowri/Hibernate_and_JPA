package com.springtutorial.cruddemo;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class studentDAOImpl implements studentDAO{
    //define entity manager
    private EntityManager entityManager;
    @Autowired
    public studentDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(student theStudent){
    entityManager.persist(theStudent);

    }

    @Override
    public student findById(Integer id) {
        return entityManager.find(student.class,id);
    }

    @Override
    @Transactional //it involoved modifying db
    public void update(student theStudent) {
    entityManager.merge(theStudent);
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        student myStudent = entityManager.find(student.class,id);
        entityManager.remove(myStudent);
        //int NumRowsDeleted = entityManager.createQuery("DELETE FROM student").executeUpdate(); -to delete all
    }
}
