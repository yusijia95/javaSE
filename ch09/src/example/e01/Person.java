package example.e01;

import java.util.ArrayList;
import java.util.Collection;

public class Person {
    private String number;
    private int age;
    private String name;
    private String address;
    private String sex;

    public Collection inquire(Collection cool, String address) {
        Collection cool3 = new ArrayList();
        Object[] obj = cool.toArray();
        Person[] per = new Person[obj.length];
        for (int i = 0; i < per.length; i++) {
            per[i] = new Person();
            per[i] = (Person) obj[i];
            if (address.equals(per[i].address.substring(0, 2))) {
                cool3.add(per[i].toString());

            }
        }
        return cool3;
    }

    public Collection delete(Collection cool, String address) {
        Collection cool3 = new ArrayList();
        Object[] obj = cool.toArray();
        for (int i = 0; i < obj.length; i++) {
            Person per = (Person) obj[i];
            if (!address.equals(per.address)) {
                cool3.add(per);
            }
        }
        return cool3;
    }

    public Collection change(Collection cool, String address) {
        Collection cool3 = new ArrayList();
        Object[] obj1 = cool.toArray();
        for (int i = 0; i < obj1.length; i++) {
            Person per = (Person) obj1[i];
            if (address.equals(per.address.substring(0, 2))) {
                per.setNumber(per.getNumber() + "shanghai");
                cool3.add(per);
            }
        }
        return cool3;
    }


    public Person() {
    }

    public Person(String number, int age, String name, String address, String sex) {
        this.number = number;
        this.age = age;
        this.name = name;
        this.address = address;
        this.sex = sex;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "number=" + number +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
