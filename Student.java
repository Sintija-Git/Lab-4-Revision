package Lab4Revison;

public class Student {
	
private String name;
private int age;

public Student() { // create constructor
	this.name = "Error, name didn't set	!";
}

public Student(String bootcampName) {
	this.name = bootcampName;
}

public String getName() {
	return name;
}

public void setName(String name) { //This set works only for our empty constructor - as needs input fom user
	this.name = name;
}

@Override
public String toString() {
	return "Student [name=" + name + "]";
}
	


} //end class
