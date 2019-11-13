package practise.p01;

import java.io.*;

public class P01 {
    public static void main(String[] args) throws IOException {
        File file2 = new File("/Users/edz/Desktop");
        File[] files = file2.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if (dir.exists()) {
                    return name.endsWith(".mp3") || name.endsWith(".png");
                }
                return false;
            }
        });
        File[] file = new File[files.length];
        InputStream input = null;
        OutputStream output = null;
        byte[] by = null;
        try {
            for (int i = 0; i < files.length; i++) {
                file[i] = new File("/Users/edz/Desktop", String.valueOf(i));
                if (!file[i].exists()) {
                    file[i].createNewFile();
                }
                by = new byte[(int) files[i].length()];
                input = new FileInputStream(files[i]);
                output = new FileOutputStream(file[i]);
                input.read(by);
                output.write(by);
                input.close();
                output.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
