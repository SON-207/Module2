package ss5_access_modifier_student;

public class TestStudent {
    public static void main(String[] args) {
        Student st = new Student();
        System.out.println("Ten: " +st.getName() +" Lop: " +st.getClasses());
        Student st1 = new Student("Son","C04");
        System.out.println("Ten:" +st1.getName() +" Lop: " +st1.getClasses());
    }
}
