package practise.p07;

public class Student {
    private String name;
    private String age;
    private String number;

    public String query(Student [] arr,String name){
        for (int i = 0; i <arr.length ; i++) {
            if(name.equals(arr[i].getName())){
                return arr[i].toString();
            }
        }
        return "查无此人";
    }

    public Student() {
    }

    public Student(String name, String age, String number) {
        this.name = name;
        this.age = age;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", number=" + number +
                '}';
    }
}
