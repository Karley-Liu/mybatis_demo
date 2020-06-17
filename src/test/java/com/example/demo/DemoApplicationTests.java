package com.example.demo;

import com.example.demo.mapper.StudentMapper;
import com.example.demo.pojo.Student;
import com.example.demo.pojo.StudentLecture;
import com.example.demo.pojo.StudentSelfcard;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DemoApplicationTests {

	@Autowired(required = false)
	private Student student;

	@Autowired(required = false)
	private StudentMapper studentMapper;

	@Autowired(required = false)
	private StudentSelfcard studentSelfcard;

	@Autowired(required = false)
	private com.example.demo.mapper.StudentSelfcard studentSelfcardMapper;

	@Autowired(required = false)
	private StudentLecture studentLecture;

	@Autowired(required = false)
	private com.example.demo.mapper.StudentLecture studentLectureMapper;

	@Test
	void contextLoads() {
	}

	@Test
	public void testInsert(){
		Student student = new Student();
		StudentSelfcard studentSelfcard = new StudentSelfcard();
		student.setStu_name("carley");
		student.setGender((byte) 0);
		student.setId(8);
		studentSelfcard.setNative_place("云南昆明");
		studentSelfcard.setSelfcard_id("12661027785");
		studentSelfcard.setId(8);
		int insertSelective = studentMapper.insert(student);
		int insert = studentSelfcardMapper.insert(studentSelfcard);
		assertEquals(1,insertSelective);
	}

	@Test
	public void testSelect(){
		List<Student> students = studentMapper.selectAll();
		for (Student student:students){
			System.out.println(student);
		}
	}

	@Test
	public void getStudent(){
		Student student = studentMapper.selectByPrimaryKey(5);
		System.out.println(this.student);
	}

	@Test
	public void insertLecture(){
		StudentLecture studentLecture = new StudentLecture();
		studentLecture.setLectureName("毛概");
		studentLectureMapper.insertLecture(studentLecture);
		System.out.println(studentLecture.getId());
	}

	@Test
	public void tryCommonMapper(){
		StudentSelfcard studentSelfcard = studentSelfcardMapper.selectById(1);
		System.out.println(studentSelfcard);
	}
}
