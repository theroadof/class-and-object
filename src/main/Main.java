package main;

import model.Student;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student studentA = new Student("zhangsan", 20, "male", "20206151542");
		System.out.println("name:"+studentA.getName());
		System.out.println("age:"+studentA.getAge());
		System.out.println("gender:"+studentA.getGender());
		System.out.println("id:"+studentA.getId());
	}

}
