public class University {
Teacher[] teachers = new Teacher[3];

University() {
    teachers[0] = new Teacher("Vitaliy", 3);
    teachers[1] = new Teacher("Aleksey", 3);
    teachers[2] = new Teacher("Uliana", 3);
        }
        void uni() {
            System.out.println("Information about teachers of this university: ");
            for (int i = 0; i<3; i++) {
                teachers[i].teacherInfo();
            }

        }


}
