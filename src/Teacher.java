public class Teacher {
    Student[] students = new Student[3];
    String name;
    int numOfStudents;
    Teacher(String name_, int numOfStudents_) {
            students[0] = new Student(15, "ninth grade", "Stepan");
                students[1] = new Student(12,"sixth grade", "Artem");
                students[2] = new Student(17, "eleventh grade", "Egor");
                numOfStudents = numOfStudents_;
                name = name_;
            }

    void studentsInfo() {
        System.out.println("\nInformation about students of this teacher: ");
       for (int i = 0; i<3; i++) {
           students[i].getAge();
           students[i].getName();
           students[i].getGrade();
       }

    }
void teacherInfo() {
    System.out.println("\nTeachers name: " + name);
    System.out.println("Numbers of students of this teacher: " + numOfStudents);
    studentsInfo();
}

}
