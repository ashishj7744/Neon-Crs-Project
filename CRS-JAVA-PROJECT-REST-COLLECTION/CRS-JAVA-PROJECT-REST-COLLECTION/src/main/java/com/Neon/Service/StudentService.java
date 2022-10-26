/**
 * 
 */
package com.Neon.Service;

import java.util.List;

import com.Neon.Bean.Course;
import com.Neon.Bean.StudentGrade;

/**
 * @author user364
 *
 */
public interface StudentService {

	public List<Course> registerForCourse(int studentId,String studentPassword);
	public List<Course> ViewCourse();
	public Course addCourse(Course courseId,int studentId);
	public String dropCourse(int courseId,int studentId);
	public List<StudentGrade> viewGrades();
	public String payFees(int payId);
}