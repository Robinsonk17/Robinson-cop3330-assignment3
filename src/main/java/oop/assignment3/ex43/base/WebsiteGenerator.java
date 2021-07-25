package oop.assignment3.ex43.base;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class WebsiteGenerator {

    // Declare string for siteName, author, and path
    String siteName;
    String author;
    String path;

    public String createWebsite() {
        // create string directory and set it equal to path + site name
        String directory = path + "\\" + siteName;
        File newFolder = new File(directory);

        // make new directory called new folder
        newFolder.mkdir();
        return directory;
    }

    public String createJSFolder() {

        // create string directory and set it equal to path + site name for JS
        String directory = path + siteName + "/js";
        File newFolder = new File(directory);

        newFolder.mkdirs();
        return directory;


    }

    public String createCSSFolder() {

        // create string directory and set it equal to path + site name for CSS
        String directory = path + siteName + "/css";
        File newFolder = new File(directory);

        newFolder.mkdir();
        return directory;

    }

    public String createHTMl() {
        // create string directory and set it equal to path + site name for HTML
        String directory = path + "\\" + siteName + "\\index.html";

        String htmlContent = "<title> " + siteName + " </title>\n<meta> " + author + " </meta>";

        File file = new File(directory);
        try {
            // write content for the html file
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write(htmlContent);
            writer.close();
            return directory;

        } catch(Exception ex) {
            return "END";
        }

    }

}