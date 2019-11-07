package practise.p05;

public class Tank {
    public int x;
    public int y;
    public String dir;
    public String type;

    public Tank(int x, int y, String dir, String type) {
        this.x = x;
        this.y = y;
        this.dir = dir;
        this.type = type;
    }

    public String ShowData() {
        return "Tank{" +
                "x=" + x +
                ", y=" + y +
                ", dir='" + dir + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
