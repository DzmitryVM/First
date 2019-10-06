package lection_InputOutput;

import java.io.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

/* 6 Вывести список файлов и каталогов выбранного каталога на диске с учетом вложенности директориев.
Для этого использовать рекурсию (пример рекурсии тут и тут).*/

public class ListOfFiles {
    public static void main(String[] args) {
        GetDirectoryFiles(File.separator + "Users" + File.separator + System.getProperty("user.name") + File.separator + "IdeaProjects" + File.separator + "First");
    }

    public static List<File> GetDirectoryFiles(String directoryName) {
        File directory = new File(directoryName);

        List<File> resultList = new ArrayList<>();
        File[] fileList = directory.listFiles();
        resultList.addAll(Arrays.asList(fileList));
        for (File file : fileList) {
            if (file.isFile()) {
                System.out.println(file.getAbsolutePath());
            } else if (file.isDirectory()) {
                resultList.addAll(GetDirectoryFiles(file.getAbsolutePath()));
            }
        }
        return resultList;
    }
}
