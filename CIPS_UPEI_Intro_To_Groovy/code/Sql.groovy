
import groovy.sql.Sql
 
// connect to database
def sql = groovy.sql.Sql.newInstance("jdbc:postgresql://localhost:6150/sandbox",
                            "postgres","ttosbtpg","org.postgresql.Driver")

def query = "select * from Student"

// exec sql and write out file
List rows = sql.rows(query)

rows.each { row ->
    println row.name + " lives at " + row.address
}

println "\n done : " + new Date()