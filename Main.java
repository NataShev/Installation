import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    static StringBuilder log = new StringBuilder();

    public static void main(String[] args) {


        createDir("C://Games//src");
        log.append("на диске С. Название папки src \n");
        createDir("C://Games//res");
        log.append("на диске С. Название папки res \n");
        createDir("C://Games//saveGames");
        log.append("на диске С. Название папки saveGames \n");
        createDir("C://Games//temp");
        log.append("на диске С. Название папки temp \n");
        createDir("C://Games//src//main");
        log.append("на диске С. Название папки main \n");
        createDir("C://Games//src//test");
        log.append("на диске С. Название папки test \n");
        createFile("C://Games//src//Main//Main.java");
        log.append("в папке Main. Название файла Main.java \n ");
        createFile("C://Games//src//Main//Utils.java");
        log.append("в папке Main. Название файла Utils.java \n ");
        createDir("C://Games//res//drawables");
        log.append("на диске С. Название папки drawables \n");
        createDir("C://Games//res//vectors");
        log.append("на диске С. Название папки vectors \n");
        createDir("C://Games//res//icons");
        log.append("на диске С. Название папки icons \n");
        createFile("C://Games//Temp//temp.txt");
        log.append("в папке Temp. Название файла temp.txt");
        System.out.println(log.toString());
        String text = log.toString();
        try (FileWriter logWriter = new FileWriter("C://Games//Temp//temp.txt", true)) {
            logWriter.write(text);
            logWriter.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void createDir(String string) {
        File file = new File(string);
        if (file.mkdir())
            log.append("Успешно создана папка ");
    }

    public static void createFile(String string) {
        File file = new File(string);
        try {
            if (file.createNewFile())
                log.append("Успешно создан файл ");

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}


