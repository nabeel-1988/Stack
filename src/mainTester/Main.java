package mainTester;

import stack.StackExample;
import stackImpl.Student;

public class Main {

	public static void main(String[] args) {
		
		StackExample stackexam = new StackExample();
		
		Student s1 = new Student();
		s1.setName("1");
		Student s2 = new Student();
		s2.setName("2");
		Student s3 = new Student();
		s3.setName("3");
		Student s4 = new Student();
		s4.setName("4");
		Student s5 = new Student();
		s5.setName("5");
			
		System.out.println("Stack is empty " + stackexam.isEmpty());
		
		stackexam.push(s1);
		stackexam.push(s2);
		stackexam.push(s3);
		
		System.out.println("Stack is empty " + stackexam.isEmpty());
		Student serachStudent = (Student) stackexam.search(s2);	
		System.out.println("Student searched is " + serachStudent.getName());
		stackexam.push(s4);
		stackexam.push(s5);
		
		Student studentPeek = (Student) stackexam.peek();
		System.out.println("Student on top of stack is " + studentPeek.getName());
		
		Student studentPoped = (Student)stackexam.pop();
		System.out.println("Student popped out is " + studentPoped.getName());
		
		Student studentPeek2 = (Student) stackexam.peek();
		System.out.println("Student on top of stack is " + studentPeek2.getName());
		
	}

}
