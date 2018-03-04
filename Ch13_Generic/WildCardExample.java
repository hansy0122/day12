package day12.Ch13_Generic;

import java.util.*;

public class WildCardExample {
	//모든과정
	public static void registerCourse(Course<? extends Object> course){
		System.out.println(course.getName()+" 수강생: "+ Arrays.toString(course.getStudents()));
	}
	//학생과정
	public static void registerCourseStudent(Course<? extends Student> course){
		System.out.println(course.getName()+" 수강생: "+ Arrays.toString(course.getStudents()));
	}
	//직장인과 일반인 과정
	public static void registerCourseWorker(Course<? super Worker> course){
		System.out.println(course.getName()+" 수강생: "+ Arrays.toString(course.getStudents()));
	}
	

	public static void main(String ar[]) {
	Course<Person> personCourse=new Course<>("일반인 과정", 5);
	personCourse.add(new Person("일반인"));
	personCourse.add(new Worker("직장인"));
	personCourse.add(new Student("학생"));
	personCourse.add(new HighStudent("고등학생"));
	
	Course<Worker> workerCourse=new Course<>("직장인 과정", 5);
	workerCourse.add(new Worker("직장인"));
	
	Course<Student> studentCourse=new Course<>("학생 과정", 5);
	studentCourse.add(new Student("학생"));
	studentCourse.add(new HighStudent("고등학생"));
	
	Course<HighStudent> highStudentCourse=new Course<>("고등학생 과정", 5);
	highStudentCourse.add(new HighStudent("고등학생"));
	
	registerCourse(personCourse);
	registerCourse(workerCourse);
	registerCourse(studentCourse);
	registerCourse(highStudentCourse);
	System.out.println();
	
	registerCourseWorker(personCourse);
	registerCourseWorker(workerCourse);
	//registerCourseWorker(studentCourse);
	//registerCourseWorker(highStudentCourse);
	System.out.println();
	
	//registerCourseStudent(personCourse);
	//registerCourseStudent(workerCourse);
	registerCourseStudent(studentCourse);
	registerCourseStudent(highStudentCourse);
	
	List<String> list = new ArrayList<>();
	}
}

class Course<T> {
	private String name;
	private T[] students;

	public Course(String name, int capacity) {
		this.name = name;
		students = (T[]) (new Object[capacity]);
		// 타입 파라미터로 배열을 생성하려면 new T[n] 형태로는 생성할수없고 (T[])(new Object[n])으 형태로
		// 생성해야한다.
	}

	public String getName() {
		return name;
	}

	public T[] getStudents() {
		return students;
	}

	// 배열에 비여있는 부분을 찾아서 수강생을 추가하는 메소드
	public void add(T t) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				students[i] = t;
				break;
			}
		}
	}
}

class Person {
	Person(){}
	Person(String name){}
	
}

class Worker extends Person {
	Worker(String name){}
}

class Student extends Person {
	Student(){}
	Student(String name){}
}

class HighStudent extends Student {
	HighStudent(String name){}
}
