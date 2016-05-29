package sample;

/**
 * Created by ZOMB_SMILE on 25.05.2016.
 */
import java.io.*;
import java.util.Scanner;

public class Galery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String txt = sc.nextLine();     // строка для записи
        String txt1 = sc.nextLine();     // строка для записи
        String txt2 = sc.nextLine();    // строка для пути до картинки
        try(FileOutputStream fos = new FileOutputStream("C://Users//Евгений//IdeaProjects//Teg-p/index.html");
            ObjectOutputStream oos = new ObjectOutputStream(fos);)
        {
            oos.writeUTF("<!DOCTYPE HTML PUBLIC>");
            oos.writeUTF("<HTML>");
            oos.writeUTF("<HEAD>");
            oos.writeUTF("<TITLE>HTML  SHEET</TITLE>");
            oos.writeUTF("</HEAD>");
            oos.writeUTF("<BODY>");
            oos.writeUTF("<br>" + txt + "<br>");
            //oos.writeUTF("\n");
            oos.writeUTF(txt1 + "<br>");
            oos.writeUTF("<img src=\" " + txt2 + "\">");
            oos.writeUTF("<BODY>");
            oos.writeUTF("</HTML>");

            oos.flush();
            oos.close();
        }


        // перевод строки в байты
        //byte[] buffer = text.getBytes();
        //fos.write(buffer, 0, buffer.length);
        catch(IOException ex){


            System.out.println(ex.getMessage());
        }
    }
}