package practise.p07;

public class Test {
    public static void main(String[] args) {
        String str = "01#张三#20*02#李四#18*03#王五#22*04#赵六#20*05#田七#21";
        Student[] stu = new Student[5];
        int average=0;
        int sum=0;
        int maxAge=0;
        int minAge=0;
        //将字符串存入学生类
        String[] arr = str.replace("#", " ").replace("*", "|").split("\\|");
        for (int i = 0; i < arr.length; i++) {
            stu[i] = new Student();
            stu[i].setNumber(arr[i].substring(0, 2));
            stu[i].setName(arr[i].substring(3, 5));
            stu[i].setAge(arr[i].substring(6, 8));
        }
        //查询功能
        System.out.println(stu[0].query(stu,"田七"));
        //计算平均年龄，及最大最小年龄
        maxAge=Integer.valueOf(stu[0].getAge());
        minAge=Integer.valueOf(stu[0].getAge());
        for (int i = 0; i < stu.length; i++) {
           sum+=Integer.valueOf(stu[i].getAge());
           if(Integer.valueOf(stu[i].getAge())>maxAge){
               maxAge=Integer.valueOf(stu[i].getAge());
           }
            if(Integer.valueOf(stu[i].getAge())<minAge){
                minAge=Integer.valueOf(stu[i].getAge());
            }
        }
        average=sum/stu.length;
        System.out.println("平均值："+average+" 年龄最大："+maxAge+" 年龄最小："+minAge);
        //改名字
        for (int i = 0; i <stu.length ; i++) {
            if("张三".equals(stu[i].getName())){
                stu[i].setName("张兵");
            }
        }
        //打印
        for (int i = 0; i < stu.length; i++) {
            System.out.println(stu[i]);
        }
    }
}
