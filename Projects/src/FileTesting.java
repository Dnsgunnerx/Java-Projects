import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileTesting {

public void CreateFile() throws IOException {

    try {
        File myFile = new File("Inventory.txt");
        if (myFile.createNewFile()) {
            System.out.println("File Created:" + myFile.getName());
        } else {
            System.out.println("File already created");
        }
    }catch(IOException e){
        System.out.println("An error occurred");
        e.printStackTrace();
    }
}

public void WriteToFile() {
    try {
        FileWriter myWriter = new FileWriter("Inventory.txt");
        myWriter.write("Files in Java might be tricky, but it is fun enough!");
        myWriter.close();
        System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
    }
}




    public static void main(String[] args) throws IOException {
    FileTesting ft = new FileTesting();
        ft.CreateFile();

        ft.WriteToFile();

    }
}
