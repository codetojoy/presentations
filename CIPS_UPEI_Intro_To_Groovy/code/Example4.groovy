
// in Groovy, semi-colons are optional
// auto-imports java.util.* and java.io.*
// scripting (see bottom)
// first-class, low-ceremony IO
// dynamic types using 'def'
// new collections methods

public class Example {
    // dynamic variable with empty list
    private def lines = []   
    
    public void read(String filename) throws IOException {
        // assign String, then File to the var 'file'
        def file = "just a string"
        file = new File(filename)
        
        file.eachLine { line -> 
            // '<<' adds item to the list
            lines << line 
        }
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

