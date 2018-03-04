package day12.Ch13_Generic;

import java.util.*;

public class WildCardExample {
	//������
	public static void registerCourse(Course<? extends Object> course){
		System.out.println(course.getName()+" ������: "+ Arrays.toString(course.getStudents()));
	}
	//�л�����
	public static void registerCourseStudent(Course<? extends Student> course){
		System.out.println(course.getName()+" ������: "+ Arrays.toString(course.getStudents()));
	}
	//�����ΰ� �Ϲ��� ����
	public static void registerCourseWorker(Course<? super Worker> course){
		System.out.println(course.getName()+" ������: "+ Arrays.toString(course.getStudents()));
	}
	

	public static void main(String ar[]) {
	Course<Person> personCourse=new Course<>("�Ϲ��� ����", 5);
	personCourse.add(new Person("�Ϲ���"));
	personCourse.add(new Worker("������"));
	personCourse.add(new Student("�л�"));
	personCourse.add(new HighStudent("����л�"));
	
	Course<Worker> workerCourse=new Course<>("������ ����", 5);
	workerCourse.add(new Worker("������"));
	
	Course<Student> studentCourse=new Course<>("�л� ����", 5);
	studentCourse.add(new Student("�л�"));
	studentCourse.add(new HighStudent("����л�"));
	
	Course<HighStudent> highStudentCourse=new Course<>("����л� ����", 5);
	highStudentCourse.add(new HighStudent("����л�"));
	
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
		// Ÿ�� �Ķ���ͷ� �迭�� �����Ϸ��� new T[n] ���·δ� �����Ҽ����� (T[])(new Object[n])�� ���·�
		// �����ؾ��Ѵ�.
	}

	public String getName() {
		return name;
	}

	public T[] getStudents() {
		return students;
	}

	// �迭�� ���ִ� �κ��� ã�Ƽ� �������� �߰��ϴ� �޼ҵ�
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
