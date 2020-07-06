package com.traulko.locale.main;

import java.util.Locale;
import java.util.ResourceBundle;

public class HamletInternational {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            String country = "";
            String language = "";
            switch (i) {
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
            System.out.println();
        }
    }
}
