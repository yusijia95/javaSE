package practise.p11;

public class Tool {
    public static void main(String[] args) {
        Student[] stu = new Student[9];
        Class grade1 = new Class("大一", 1);
        stu[0] = new Student("俞思笳1", 25, 11, grade1);
        stu[1] = new Student("俞思笳2", 25, 12, grade1);
        stu[2] = new Student("俞思笳3", 25, 13, grade1);
        Class grade2 = new Class("大二", 2);
        stu[3] = new Student("俞思笳1", 25, 21, grade2);
        stu[4] = new Student("俞思笳2", 25, 22, grade2);
        stu[5] = new Student("俞思笳3", 25, 23, grade2);
        Class grade3 = new Class("大三", 3);
        stu[6] = new Student("俞思笳1", 25, 31, grade1);
        stu[7] = new Student("俞思笳2", 25, 32, grade1);
        stu[8] = new Student("俞思笳3", 25, 33, grade1);
        for(int i=0;i<9;i++){
            if(stu[0].getName().equals(stu[i].getName())){
                System.out.println(stu[i].toString());
            }
        }
    }
}
