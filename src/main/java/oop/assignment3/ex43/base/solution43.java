package oop.assignment3.ex43.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Keondez Robinson
 */
import java.util.Scanner;


public class solution43 {

    public static void main(String[] args) {

        Scanner newScan = new Scanner(System.in);

        // declare string siteName, author, wantCSS, and wantJS to be caled
        String siteName;
        String author;
        boolean wantCSS;
        boolean wantJS;

        // Print site name and author, prompt for user input
        System.out.print("Site name: ");
        siteName = newScan.nextLine();
        System.out.print("Author: ");
        author = newScan.nextLine();
        // ask user if folder for CSS and JavaScript is wanted
        // prompt user for input
        System.out.print("Do you want a folder for JavaScript? ");
        wantJS = newScan.nextLine().equals("y");
        System.out.print("Do you want a folder for CSS? ");
        wantCSS = newScan.nextLine().equals("y");
        WebsiteGenerator newWebsite = new WebsiteGenerator();

        // set user input to new website properties
        newWebsite.siteName = siteName;
        newWebsite.author = author;
        newWebsite.path = System.getProperty("user.dir");

        //print created website information
        System.out.println("Created " + newWebsite.createWebsite());
        System.out.println("Created " + newWebsite.createHTMl());

        if (wantJS)
            System.out.println("Created " + newWebsite.createJSFolder());

        if (wantCSS)
            System.out.println("Created " + newWebsite.createCSSFolder());

    }

}
