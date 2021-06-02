package client;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MembersDB {
    public static int save(String id,String name,String email,String phone){
            int status=0;
            try{
                    Connection con=DB.getConnection();
                    PreparedStatement ps=con.prepareStatement("insert into members(id,name,email,phone) values(?,?,?,?)");
                    ps.setString(1,id);
                    ps.setString(2,name);
                    ps.setString(3,email);
                    ps.setString(4,phone);
                    status=ps.executeUpdate();
                    con.close();
            }catch(Exception e){System.out.println(e);}
            return status;
    }
    public static int delete(String id){
            int status=0;
            try{
                    Connection con=DB.getConnection();
                    PreparedStatement ps=con.prepareStatement("delete from members where id=?");
                    ps.setString(1,id);
                    status=ps.executeUpdate();
                    con.close();
            }catch(Exception e){System.out.println(e);}
            return status;
    }
    public static boolean validate(String id){
            boolean status=false;
            try{
                    Connection con=DB.getConnection();
                    PreparedStatement ps=con.prepareStatement("select * from members where id=?");
                    ps.setString(1,id);
                    ResultSet rs=ps.executeQuery();
                    status=rs.next();
                    con.close();
            }catch(Exception e){System.out.println(e);}
            return status;
    }
}
