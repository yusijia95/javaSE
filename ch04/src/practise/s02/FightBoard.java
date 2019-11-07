package practise.s02;

public class FightBoard {
    public static void main(String[] args) {
        String[] arr1 = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "大王", "小王"};
        String[] arr2 = {"黑桃", "红桃", "方块", "梅花"};
        String[] arr3 = new String[54];//花色
        String[] arr4 = new String[54];//数字
        int count14 = 0;
        int count15 = 0;
        int count12 = 0;
        int no = 0;
        int num = (int) (Math.random() * 4);
        for (int i = 0; i < 3; i++) {
            int num1 = (int) (Math.random() * 4);//花色
            int num2 = (int) (Math.random() * 15);//数字
            if (num2 == 13) {
                if (count14 != 0) {
                    i--;
                    continue;
                }
                arr4[i] = arr1[num2];
                arr3[i] = "0";
                count14++;
            } else if (num2 == 14) {
                if (count15 != 0) {
                    i--;
                    continue;
                }
                arr4[i] = arr1[num2];
                arr3[i] = "0";
                count15++;
            } else {
                arr3[i] = arr2[num1];
                arr4[i] = arr1[num2];
            }
            for (int j = 0; j < i; j++) {
                if (arr3[i] == arr3[j] && arr4[i] == arr4[j]) {
                    i--;
                    break;
                }
            }
        }
        for (int i = 3; i < 54; i++) {
            int num3 = (int) (Math.random() * 4);//花色
            int num4 = (int) (Math.random() * 15);//数字
            if (num4 == 12 && count12 == 0) {
                no = i;
                count12++;
            }
            if (num4 == 13) {
                if (count14 != 0) {
                    i--;
                    continue;
                }
                arr4[i] = arr1[num4];
                arr3[i] = "0";
                count14++;
            } else if (num4 == 14) {
                if (count15 != 0) {
                    i--;
                    continue;
                }
                arr4[i] = arr1[num4];
                arr3[i] = "0";
                count15++;
            } else {
                arr3[i] = arr2[num3];
                arr4[i] = arr1[num4];
            }
            for (int j = 0; j < i; j++) {
                if (arr3[i] == arr3[j] && arr4[i] == arr4[j]) {
                    i--;
                    break;
                }
            }
        }
        if (no >= 3 && no <= 19) {
            System.out.println("小王是地主");
        } else if (no >= 20 && no <= 36) {
            System.out.println("小明是地主");
        } else if (no >= 37 && no <= 53) {
            System.out.println("小月是地主");
        }
        System.out.println("小王的牌：");
        for (int i = 3; i < 20; i++) {
            if (arr4[i].equals("大王") || arr4[i].equals("小王")) {
                System.out.print(arr4[i] + "  ");
            } else {
                System.out.print(arr4[i]);
                System.out.print(arr3[i] + "  ");
            }
        }
        if (no >= 3 && no <= 19) {
            for (int i = 0; i < 3; i++) {
                if (arr4[i].equals("大王") || arr4[i].equals("小王")) {
                    System.out.print(arr4[i] + "  ");
                } else {
                    System.out.print(arr4[i]);
                    System.out.print(arr3[i] + "  ");
                }
            }
        }
        System.out.println();
        System.out.println("小明的牌：");
        for (int i = 20; i < 37; i++) {
            if (arr4[i].equals("大王") || arr4[i].equals("小王")) {
                System.out.print(arr4[i] + "  ");
            } else {
                System.out.print(arr4[i]);
                System.out.print(arr3[i] + "  ");
            }
        }
        if (no >= 20 && no <= 36) {
            for (int i = 0; i < 3; i++) {
                if (arr4[i].equals("大王") || arr4[i].equals("小王")) {
                    System.out.print(arr4[i] + "  ");
                } else {
                    System.out.print(arr4[i]);
                    System.out.print(arr3[i] + "  ");
                }
            }
        }
        System.out.println();
        System.out.println("小月的牌：");
        for (int i = 36; i < 54; i++) {
            if (arr4[i].equals("大王") || arr4[i].equals("小王")) {
                System.out.print(arr4[i] + "  ");
            } else {
                System.out.print(arr4[i]);
                System.out.print(arr3[i] + "  ");
            }
        }
        if (no >= 36 && no <= 53) {
            for (int i = 0; i < 3; i++) {
                if (arr4[i].equals("大王") || arr4[i].equals("小王")) {
                    System.out.print(arr4[i] + "  ");
                } else {
                    System.out.print(arr4[i]);
                    System.out.print(arr3[i] + "  ");
                }
            }
        }
    }
}