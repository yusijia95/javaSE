import java.util.Scanner;
public class E01 {
    public static void main(String[] args) {
      int num=0;
      int jishu=0;
      int oushu=0;
        while(num!=-1){
          num=(int)(100000*Math.random());
          if(num%2==0){
              oushu++;
          }
            if(num%2==0){
                jishu++;
            }
      }

    }
}
