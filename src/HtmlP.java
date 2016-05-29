/**
 * Created by ZOMB_SMILE on 25.05.2016.
 */
import java.io.*;
import java.util.Scanner;

public class HtmlP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        try (FileWriter fileWriter = new FileWriter("index.html", false)) {
            while ((str = sc.nextLine()).length() > 0) {
                fileWriter.write("<p>" + str + "</p>");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}