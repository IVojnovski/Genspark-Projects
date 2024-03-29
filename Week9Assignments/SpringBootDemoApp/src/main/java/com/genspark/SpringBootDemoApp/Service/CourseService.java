package com.genspark.SpringBootDemoApp.Service;

import com.genspark.SpringBootDemoApp.Entity.Course;
import java.util.List;

public interface CourseService {
    List<Course> getAllCourse();
    Course getCourseById(int courseId);

    Course addCourse(Course course);

    Course updateCourse(Course course);

    String deleteCourseById(int courseId);
}
