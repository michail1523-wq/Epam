package classes.src.epam.classes;

public class Students {
    private Student[] allStudents;


    public Students() {
        this.allStudents = createStudents();
    }

    public Student[] createStudents() {

        Student[] arrOfStudents = {new Student(1, "Oleg", "Zaharov",
                20, "Mira 20", "Energy", 123456, 4, "ze25"), new Student(2, "Artem", "Beliy",
                22, "Mira 21", "Energy", 678543, 3, "ze23"), new Student(3, "Boris", "Borisov",
                19, "Mira 24", "History", 890543, 2, "ze21"), new Student(4, "Boris", "Zarev",
                22, "Mira 26", "History", 890546, 3, "ze23")};
        return arrOfStudents;
    }

    public void getListOfGroup(String groupName) {
        for (Student student : allStudents) {
            if (student.getGroup().equals(groupName)) {
                System.out.println(student.getGroup() + " " + student.getFirstName() + "  " + student.getLastName());
            }
        }
    }

    public void getListBornAfterThisYear(int ageOfStudents) {
        for (Student student : allStudents) {
            if (student.getAge() > ageOfStudents) {
                System.out.println(student.getFirstName() + "  " + student.getLastName());
            }
        }
    }

    public void getListOfFaculty(String facultyName) {
        for (Student student : allStudents) {
            if (student.getFaculty().equals(facultyName)) {
                System.out.println(student.getFaculty() + " " + student.getFirstName() + "  " + student.getLastName());
            }
        }
    }

    public void getListOfFacultyAndCourse(String facultyName, int course) {
        for (Student student : allStudents) {
            if (student.getFaculty().equals(facultyName) && student.getCourse() == course) {
                System.out.println("Course - " + student.getCourse() + ',' + " Faculty - " + student.getFaculty() + ',' + " " + student.getFirstName() + "  " + student.getLastName());
            }
        }
    }

}
