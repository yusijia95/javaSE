package Practise;

public class P02 {
    public static void main(String [] args) {
        int count=0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                count++;
                count=count%10;
                System.out.print(count);
            }
            System.out.println();
        }
    }
}
