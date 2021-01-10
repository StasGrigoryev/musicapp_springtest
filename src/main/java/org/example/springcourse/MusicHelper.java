package org.example.springcourse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class MusicHelper {
    public static boolean inputIsValid = false;
    private static BufferedReader br = null;

    private static BufferedReader getReader() {
        return new BufferedReader(new InputStreamReader(System.in));
    }

    //have problem with the code below
    //don't know how to make it get input with validation check and not
    //to return default value until the validation is passed
    //now it's returning "POP" at the end
    public static String getStringFromUser() {
        String inputString = null;
        if (br == null) br = getReader();
        try {
            inputString = br.readLine();
            return inputString;
        }
        catch (IOException e) {
            System.out.println("Exception " + e + " caught");
        }
        finally {
            if (inputIsValid) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return "POP";
    }

}
