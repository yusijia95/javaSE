package example.e01;

import java.io.File;
import java.io.FilenameFilter;

public class e01 {
    public static void main(String[] args) {
        File file =new File("src/example");
        file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if(file.exists()){
                    return name.endsWith(".png");
                }
                return false;
            }
        });
    }
}
