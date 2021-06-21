package oop.assignment3.ex43.base;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class WebsiteGenerator {

    String siteName;
    String author;
    String path;

    public String createWebsite() {


        String directory = path + siteName;
        File newFolder = new File(directory);

        newFolder.mkdir();
        return directory;


    }

    public String createJSFolder() {

        String directory = path + siteName + "/js";
        File newFolder = new File(directory);

        newFolder.mkdirs();
        return directory;


    }

    public String createCSSFolder() {

        String directory = path + siteName + "/css";
        File newFolder = new File(directory);

        newFolder.mkdir();
        return directory;

    }

    public String createHTMl() {

        String directory = path + siteName + "/index.html";

        String htmlContent = "<title> " + siteName + " </title>\n<meta> " + author + " </meta>";

        File file = new File(directory);

        try {

            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write(htmlContent);
            writer.close();
            return directory;

        } catch(Exception ex) {

            return "END";
        }

    }

}