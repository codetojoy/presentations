
// meta-programming 
// add a new method, isInsert(), to java.lang.String
String.metaClass.isInsert = {
    // 'delegate' is a keyword similar to 'this'
    // it represents the object on which the method has been called
    boolean result = delegate.indexOf("INSERT ") > -1
    return result
}

// exercise the new method with some String objects

String s = "UPDATE EMPLOYEE...."
String t = "INSERT INTO EMPLOYEE... "

if (s.isInsert()) {
    println "s is an insert statement"
} else {
    println "s is NOT an insert statement"    
}

if (t.isInsert()) {
    println "t is an insert statement"
} else {
    println "t is NOT an insert statement"    
}

println "class is still ${s.class} !!"
