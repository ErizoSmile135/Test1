package by.Homework.lessons.HW9.task20;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;

public class FileCreator implements Callable<List<String>> {

    @Override
    public List<String> call() throws Exception {
        System.out.println("Start " + this.hashCode());

        Random random = new Random();
        List<String> fileNames = new ArrayList<>();
        String directory = "src\\by\\Homework\\lessons\\HW9\\task20\\" + this.hashCode();

        for (int i = 1; i <= 10; i++) {
            String fileName = "file_" + this.hashCode() + "(" + i + ").txt";

            List<String> lines = new ArrayList<>();
            for (int j = 1; j <= 10; j++) {
                String line = "Text " + random.nextInt(1000);
                lines.add(line);
            }

            Files.createDirectories(Path.of(directory));
            //Files.write(Path.of("files", "file1.txt"), lines);        //альтернатива FileWriter, если бы хотел переписать

            try (FileWriter writer = new FileWriter(new File(directory, fileName))) {
                writer.write(String.valueOf(lines));
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }

            fileNames.add(fileName);

            int sleep = random.nextInt(1000, 3001);
            Thread.sleep(sleep);

            System.out.println(this.hashCode() + " создал файл " + fileName);
        }

        System.out.println("End " + this.hashCode());

        return fileNames;
    }
}
