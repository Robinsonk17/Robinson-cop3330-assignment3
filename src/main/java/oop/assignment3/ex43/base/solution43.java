package oop.assignment3.ex43.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Keondez Robinson
 */
import java.util.Scanner;


public class solution43 {

    public static void main(String[] args) {

        Scanner newScan = new Scanner(System.in);

        String siteName;
        String author;
        String wantCSS;
        String wantJS;

        System.out.print("Site name: ");
        siteName = newScan.nextLine();
        System.out.print("Author: ");
        author = newScan.nextLine();
        System.out.print("Do you want a folder for JavaScript? ");
        wantJS = newScan.nextLine();
        System.out.print("Do you want a folder for CSS? ");
        wantCSS = newScan.nextLine();
        WebsiteGenerator newWebsite = new WebsiteGenerator();

        newWebsite.siteName = siteName;
        newWebsite.author = author;
        newWebsite.path = "src/main/java/ex43/";

        System.out.println("Created " + newWebsite.createWebsite());
        System.out.println("Created " + newWebsite.createHTMl());

        if(wantJS.equals("y"))
            System.out.println("Created " + newWebsite.createJSFolder());

        if(wantCSS.equals("y"))
            System.out.println("Created " + newWebsite.createCSSFolder());

    }

}
