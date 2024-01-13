package com.vismee.advancedhibernatemapping.dao;

import com.vismee.advancedhibernatemapping.entity.Instructor;
import com.vismee.advancedhibernatemapping.entity.InstructorDetail;

public interface AppDAO
{
    void saveInstructor(Instructor instructor);
    Instructor findInstructorById(int id);
    void deleteInstructorById(int id);
    InstructorDetail findInstructorDetailById(int id);
    void deleteInstructorDetailById(int id);
}
