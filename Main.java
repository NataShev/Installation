import javax.imageio.IIOException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    static StringBuilder log = new StringBuilder();
    public static void main(String[] args) {

        File src = new File("C://Games//src");
        createDir(src);
            log.append("на диске С. Название папки src \n");

        File res = new File("C://Games//res");
        createDir(res);
            log.append("на диске С. Название папки res \n");

        File saveGames = new File("C://Games//saveGames");
        createDir(saveGames);
            log.append("на диске С. Название папки saveGames \n");

        File temp = new File("C://Games//temp");
        createDir(temp);
            log.append("на диске С. Название папки temp \n");

        File main = new File("C://Games//src//main");
        createDir(main);
            log.append("на диске С. Название папки main \n");

        File test = new File("C://Games//src//test");
        createDir(test);
        log.append("на диске С. Название папки test \n");

        File fileMain = new File("C://Games//src//Main//Main.java");
        createFile(fileMain);
        log.append("в папке Main. Название файла Main.java \n ");

        File utils = new File("C://Games//src//Main//Utils.java");
        createFile(utils);
        log.append("в папке Main. Название файла Utils.java \n ");

        File drawables = new File("C://Games//res//drawables");
        createDir(drawables);
            log.append("на диске С. Название папки drawables \n");

        File vectors = new File("C://Games//res//vectors");
        createDir(vectors);
            log.append("на диске С. Название папки vectors \n");

        File icons = new File("C://Games//res//icons");
        createDir(icons);
            log.append("на диске С. Название папки icons \n");

        File tempFile = new File("C://Games//Temp//temp.txt");
        createFile(tempFile);
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
    public static void createDir(File file) {
        if(file.mkdir())
            log.append("Успешно создана папка ");
    }
    public static void createFile(File file) {
        try {
            if(file.createNewFile())
                log.append("Успешно создан файл ");

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    }


