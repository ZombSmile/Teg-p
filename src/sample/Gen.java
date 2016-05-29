package sample;

import java.io.*;

/**
 * Created by ZOMB_SMILE on 25.05.2016.
 */
public class Gen<T extends Serializable> {
    public boolean save(T obj){
        boolean f = true;
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("save.save"))){
            outputStream.writeObject(obj);
        } catch (FileNotFoundException e) {
            f = false;
        } catch (IOException e) {
            f = false;
            e.printStackTrace();
           e.printStackTrace();
        }
        return f;
    }
}

