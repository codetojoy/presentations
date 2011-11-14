
import java.io.*;
import java.util.*; 

// same file as Example.java
// simply accepts a filename as a command-line argument
// and prints out the lines in reverse order

public class Example {
    private List<String> lines = new ArrayList<String>();
    
    public void read(String filename) throws IOException {
        File file = new File(filename);
    
        BufferedReader input =  new BufferedReader(new FileReader(file));
        
        try {         
            String line = null;

            while (( line = input.readLine()) != null) {
                lines.add(line);
            }
        } finally {
            input.close();
        }
    }
    
    private void display() {
        int max = lines.size();
        
        for (int i = max - 1; i >= 0; i--) {
            System.out.println(lines.get(i));
        }
    }
    
    public static void main(String... args) throws IOException {
        String filename = args[0];
        Example example = new Example();
        example.read(filename);
        example.display();
    }
}