import groovy.xml.MarkupBuilder

def writer = new StringWriter()
def xml = new MarkupBuilder(writer)

// Domain Specific Language to construct 
// hierarchy of XML nodes
xml.schools() {
    school(name: "UPEI", province: "PEI")
    school(name: "Holland College", province: "PEI")
    school(name: "Mount Allison", province: "NB")
    school(name: "Dalhousie", province: "NS")
    
    /*
    -- uncomment this for dynamic data generation
    for (i in 1..5) {
        school(name: "random school ${i}")
    }
    */
}

// because MarkupBuilder has the writer, we can
// now simply write out the XML
println writer.toString()