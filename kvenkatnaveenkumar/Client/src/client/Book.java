package client;

import java.sql.*;


public class Book {
    private Connection connection = null;
            private Statement statement = null;
            private ResultSet resultSet = null;
    private String id,title,isbn,author,publisher,year,edition,shelf,available;
    private int copies;
    public Book(String id,String title,String isbn,String author,String publisher,String year,String edition,int copies,String shelf,String available){
        this.id=id;
        this.title=title;
        this.isbn=isbn;
        this.author=author;
        this.publisher=publisher;
        this.year=year;
        this.edition=edition;
        this.copies=copies;
        this.shelf=shelf;
        this.available=available;
        }
    public String getid(){
        return id;
        }
    public String gettitle(){
        return title;
        }
    public String getisbn(){
        return isbn;
        }
    public String getauthor(){
        return author;
        }
    public String getpublisher(){
        return publisher;
        }
    public String getyear(){
        return year;
        }
    public String getedition(){
        return edition;
        }
    public int getcopies(){
        return copies;
        }
    public String getshelf(){
        return shelf;
    }
    public String getavailable(){
        return available;
        }
    public  void connection(String Query) {
                    try {
                            Class.forName("oracle.jdbc.driver.OracleDriver");
                    }
                    catch (ClassNotFoundException cnfe) {
                            System.out.println("Books.java\n" + cnfe.toString());
                    }
                    catch (Exception e) {
                            System.out.println("Books.java\n" + e.toString());
                    }
                    /***************************************************************
                     * for making the connection,creating the statement and update *
                     * the table in the database. After that,closing the statmenet *
                     * and connection. There is catch block SQLException for error *
                     ***************************************************************/
                    try {
                            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
                            statement = connection.createStatement();
                            resultSet = statement.executeQuery(Query);
                            while (resultSet.next()) {
                                    id = resultSet.getString(1);
                                    title = resultSet.getString(2);
                                isbn = resultSet.getString(3);
                                author = resultSet.getString(4);
                                publisher = resultSet.getString(5);
                                year = resultSet.getString(6);
                                edition = resultSet.getString(7);
                                copies = resultSet.getInt(8);
                                shelf = resultSet.getString(9);
                                available = resultSet.getString(9);
                                    
                            }
                            resultSet.close();
                            statement.close();
                            connection.close();
                    }
                    catch (SQLException SQLe) {
                            System.out.println("Books.java\n" + SQLe.toString());
                    }
            }
}


    

