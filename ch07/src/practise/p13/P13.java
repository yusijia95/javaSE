package practise.p13;

public class P13 {
    public static void main(String[] args) {
        String str = "To be or not to be";
        String[] arr = str.split(" ");
        StringBuffer[] sf = new StringBuffer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sf[i]=new StringBuffer();
            sf[i].append(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(sf[i].reverse());
        }
    }
}
