package org.example.springcourse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class MusicHelper {
    private static BufferedReader br = null;

    private static BufferedReader getReader() {
        return new BufferedReader(new InputStreamReader(System.in));
    }

    public static void closeReader() {
        try {
            br.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getUserInput() {
        String inputString = null;
        if (br == null) br = getReader();
        try {
            inputString = br.readLine();
            return inputString;
        }
        catch (IOException e) {
            System.out.println("Exception " + e + " caught");
        }
        return "POP";
    }

}
