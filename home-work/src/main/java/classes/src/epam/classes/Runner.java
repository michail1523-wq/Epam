package classes.src.epam.classes;

public class Runner {

    public static void main(String[] args) {

        Students students = new Students();
        students.getListOfGroup("ze23");
        students.getListBornAfterThisYear(19);
        students.getListOfFaculty("History");
        students.getListOfFacultyAndCourse("Energy", 4);

    }
}
