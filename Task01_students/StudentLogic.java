package by.epam.JavaEpam03_classes;

public class StudentLogic {
    public Student[] excellentStudents(Student[] studentsList) {
        boolean isExcellentStudent;
        int numberOfExcellentStudents = 0;
        Student[] excellentStudents;
        for (Student student : studentsList) {
            isExcellentStudent = true;
            for (int mark : student.getMarks()) {
                if (mark < 9) {
                    isExcellentStudent = false;
                    break;
                }
            }
            if (isExcellentStudent) {
                numberOfExcellentStudents++;
            }
        }
        if (numberOfExcellentStudents > 0) {
            excellentStudents = new Student[numberOfExcellentStudents];
            int i = 0;
            for (Student student : studentsList) {
                isExcellentStudent = true;
                for (int mark : student.getMarks()) {
                    if (mark < 9) {
                        isExcellentStudent = false;
                        break;
                    }
                }
                if (isExcellentStudent) {
                    excellentStudents[i] = student;
                    i++;
                }
            }
            return excellentStudents;
        }
        return excellentStudents = new Student[0];


        /*for (int i = 0; i < student.getMarks().length; i++) {
            if (student.getMarks()[i] < 9) {
                isExcellentStudent = false;
                break;
            }
        }
        return isExcellentStudent;*/
    }
}
