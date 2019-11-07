package example;

public class Person {
    private String name;
    private int age;
    private String address;
    private String sex;
    public static String country="中国";

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return"名字"+name+"年龄"+age;
    }

    void quicksort(Person[] arr, int begin, int end) {
        int i;
        int j;
        if (begin < end) {
            i = begin + 1;
            j = end;
            while (i < j) {
                if (arr[begin].age < arr[i].age) {
                    Person temp = arr[i];
                    arr[i] = arr[end];
                    arr[end] = temp;
                    j--;
                } else {
                    i++;
                }
            }
            if (arr[i].age >= arr[begin].age) {
                i--;
            }
            Person temp = arr[i];
            arr[i] = arr[begin];
            arr[begin] = temp;
            quicksort(arr, begin, i);
            quicksort(arr, j, end);
        }
    }
}
