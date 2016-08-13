import java.io.*;

/**
 * Created by LordwolF on 8/12/2016.
 */
public class WriteObjects {
    public static void main(String[] args) {
        System.out.println("Writing Objects");

        Person adam = new Person(666, "Satan");
        Person eve = new Person(333, "Santa");

        System.out.println(adam);
        System.out.println(eve);

        try (FileOutputStream fs = new FileOutputStream("people.bin")) {

            ObjectOutputStream os = new ObjectOutputStream(fs);

            os.writeObject(adam);
            os.writeObject(eve);

            os.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
