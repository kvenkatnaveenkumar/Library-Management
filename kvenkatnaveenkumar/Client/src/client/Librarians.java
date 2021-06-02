package client;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Librarians {
    private Connection connection = null;
            private Statement statement = null;
            private ResultSet resultSet = null;
    private String id,password,name;
    public Librarians(String id,String password,String name){
        this.id=id;
        this.password=password;
        this.name=name;
    }
    public String getid(){
        return id;
        }
    public String getpassword(){
        return password;
        }
    public String getname(){
        return name;
        }
}
