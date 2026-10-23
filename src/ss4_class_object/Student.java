package ss4_class_object;

public class Student {
    //thuộc tính
    int id; // biết global / thuộc tính / instance(thể hiện của 1 class)
    String name;
    String address;

    //hàm khởi tạo đối tượng(constructor)
    //Đặc điểm:

    public Student(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    //Trả phương thức cho bên kia hiển thị
    public String getInfo() {
        return "id:" + this.id + ",name:" + this.name +",address:" +this.address;
    }
}
