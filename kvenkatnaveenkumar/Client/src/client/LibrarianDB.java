package client;

import java.sql.*;
import java.sql.PreparedStatement;

public class LibrarianDB {
    public static int save(String id,String password,String name){
                    int status=0;
                    try{
                            Connection con=DB.getConnection();
                            PreparedStatement ps=con.prepareStatement("insert into librarian(id,password,name) values(?,?,?)");
                            ps.setString(1,id);
                            ps.setString(2,password);
                            ps.setString(3,name);
                            status=ps.executeUpdate();
                            con.close();
                    }catch(Exception e){System.out.println(e);}
                    return status;
            }
            public static int delete(String id){
                    int status=0;
                    try{
                            Connection con=DB.getConnection();
                            PreparedStatement ps=con.prepareStatement("delete from librarian where id=?");
                            ps.setString(1,id);
                            status=ps.executeUpdate();
                            con.close();
                    }catch(Exception e){System.out.println(e);}
                    return status;
            }

            public static boolean validate(String id,String password){
                    boolean status=false;
                    try{
                            Connection con=DB.getConnection();
                            PreparedStatement ps=con.prepareStatement("select * from librarian where id=? and password=?");
                            ps.setString(1,id);
                            ps.setString(2,password);
                            ResultSet rs=ps.executeQuery();
                            status=rs.next();
                            con.close();
                    }catch(Exception e){System.out.println(e);}
                    return status;
            }
    
}
