import sample.Gen;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

/**
 * Created by ZOMB_SMILE on 25.05.2016.
 */
public class Task2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str;
        /*
        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("save.save"))){
            while ((str = sc.nextLine()).length() > 0){
                outputStream.writeObject(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        */
        Gen<String> gen = new Gen<>();
        gen.save(sc.nextLine());
    }
}
