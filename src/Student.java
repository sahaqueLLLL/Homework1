public class Student {
    int age;
    private String name;
    String grade;

    Student(int age_, String grade_, String name_) {
        age = age_;
        grade = grade_;
        name = name_;
    }


    int getAge() {
        System.out.println("Age of this student is: " + age);
        return age;

    }
    String getGrade() {
        System.out.println("This student is in " + grade);
        return grade;
    }
    void setName(String newName) {
        this.name = newName;
    }
    String getName() {
        System.out.println("Name: " + name);
        return this.name;
    }

}
