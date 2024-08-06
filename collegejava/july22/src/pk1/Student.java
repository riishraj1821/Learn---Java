package pk1;

public class Student {
	String name;
	int rollno;
	private float marks;
	public Student(String name, int rollno, float marks) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.marks = marks;
	}
	
	public void Show() {
		System.out.println("roll :" + this.rollno);
		System.out.println("Name :" + this.name);
		System.out.println("Marks :" + this.marks);
	}
	
	@Override
	public boolean equals(Object obj) {
		Student s2 = (Student)obj;
		return rollno==s2.rollno;
	}
	
	
}
