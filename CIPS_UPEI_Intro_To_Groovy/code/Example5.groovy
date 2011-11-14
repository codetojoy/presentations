
// in Groovy, semi-colons are optional
// auto-imports java.util.* and java.io.*
// scripting (see bottom)
// first-class, low-ceremony IO
// dynamic types using 'def'
// new collections methods
// collections iteration

public class Example {
    private def lines = []
    
    public void read(String filename) throws IOException {
        def file = "just a string"
        file = new File(filename)
        
        file.eachLine { line -> 
            lines << line 
        }
    }

    private void display() {
        def reverseLines = lines.reverse()
        
        // super-easy iteration of a list
        reverseLines.each { line ->
            println line
        }
    }    
}

// MAIN
// public static void main(String... args) throws IOException {

String filename = args[0]
Example example = new Example()
example.read(filename)
example.display()

