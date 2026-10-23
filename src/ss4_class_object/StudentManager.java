package ss4_class_object;

public class StudentManager {
    private Student[] studentList = new Student[100];

    public void showList() {
        for (int i = 0; i < studentList.length; i++) {
            if (studentList[i] != null) {
                System.out.println(studentList[i].getInfo());
            } else {
                break;
            }
        }
    }

    //
    public void add(Student student) {
        for (int i = 0; i < studentList.length; i++) {
            if (studentList[i] == null) {
                studentList[i] = student;
                break;
            }
        }
    }
}



