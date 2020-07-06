package com.traulko.locale.main;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class HamletInternational {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("1)Английский\n 2)Белорусский\n 3)Любой");
            int choice = 0;
            try {
                choice = scanner.nextInt();
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
            String country = "";
            String language = "";
            switch (choice) {
                case 1:
                    country = "US";
                    language = "en";
                    break;
                case 2:
                    country = "BY";
                    language = "be";
                    break;
            }
            Locale currentLocale = new Locale(language, country);
            ResourceBundle resourceBundle = ResourceBundle.getBundle("datares.text", currentLocale);
            String str1 = resourceBundle.getString("str1");
            System.out.println(str1);
            String str2 = resourceBundle.getString("str2");
            System.out.println(str2);
        }
    }
}
