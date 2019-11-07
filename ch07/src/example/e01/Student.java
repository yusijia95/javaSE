package example.e01;

public class Student {
    private String name;
    private int age;
    private String address;
    private String phone;

//    @Override
//    public boolean equals(Object obj) {
//        boolean flag = false;
//        if (obj == null) {
//            return flag;
//        }
//        if (obj.getClass() != this.getClass()) {
//            return flag;
//        }
//        if (obj == this) {
//            flag = true;
//            return flag;
//        }
//        obj = (Student) obj;
//        if (this.getName() != null && ((Student) obj).getName() != null) {
//            if (!(this.getName().equals(((Student) obj).getName()))) {
//                return flag;
//            }
//        }
//        if (this.getAge()!=((Student) obj).getAge()) {
//            return flag;
//        }
//        if (this.getAddress() != null && ((Student) obj).getAddress() != null) {
//            if (!(this.getAddress().equals(((Student) obj).getAddress()))) {
//                return flag;
//            }
//        }
//        if (this.getPhone() != null && ((Student) obj).getPhone() != null) {
//            if (this.getPhone().equals(((Student) obj).getPhone())) {
//                flag=true;
//                return flag;
//            }
//        }
//        return flag;
//    }

    public Student() {
    }

    public Student(String name, int age, String address, String phone) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
