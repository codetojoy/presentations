
// init
String filename = args[0]
def lines = []

// populate 'lines' with contents of the file
new File(filename).eachLine { line -> lines << line }

// print the lines in reverse order
lines.reverse().each { line -> println line }

