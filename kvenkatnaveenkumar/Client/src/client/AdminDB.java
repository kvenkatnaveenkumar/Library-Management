package client;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AdminDB {
    
        public static int save(String id,String password){
                        int status=0;
                        try{
                                Connection con=DB.getConnection();
                                PreparedStatement ps=con.prepareStatement("insert into admin(id,password) values(?,?)");
                                ps.setString(1,id);
                                ps.setString(2,password);
                                status=ps.executeUpdate();
                                con.close();
                        }catch(Exception e){System.out.println(e);}
                        return status;
                }
                public static int delete(int id){
                        int status=0;
                        try{
                                Connection con=DB.getConnection();
                                PreparedStatement ps=con.prepareStatement("delete from admin where id=?");
                                ps.setInt(1,id);
                                status=ps.executeUpdate();
                                con.close();
                        }catch(Exception e){System.out.println(e);}
                        return status;
                }

                public static boolean validate(String id,String password){
                        boolean status=false;
                        try{
                                Connection con=DB.getConnection();
                                PreparedStatement ps=con.prepareStatement("select * from admin where id=? and password=?");
                                ps.setString(1,id);
                                ps.setString(2,password);
                                ResultSet rs=ps.executeQuery();
                                status=rs.next();
                                con.close();
                        }catch(Exception e){System.out.println(e);}
                        return status;
                }
    }


