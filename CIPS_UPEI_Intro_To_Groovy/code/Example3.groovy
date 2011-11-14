
// in Groovy, semi-colons are optional
// auto-imports java.util.* and java.io.*
// scripting (see bottom)
// first-class, low-ceremony IO

public class Example {
    private List<String> lines = new ArrayList<String>()
    
    public void read(String filename) throws IOException {
        File file = new File(filename)
        
        System.out.println file.class
        
        // a low-ceremony way to read a simple file
        file.eachLine { line -> 
            lines.add(line)
        }
        
        // no need to close the file: it is done for us
    }

    private void display() {
        int max = lines.size()
    
        for (int i = max - 1; i >= 0; i--) {
            System.out.println(lines.get(i))
        }
    }    
}

// MAIN
// public static void main(String... args) throws IOException {

String filename = args[0]
Example example = new Example()
example.read(filename)
example.display()

