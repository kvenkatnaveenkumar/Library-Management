package client;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BorrowDB {
    public static int save(String bookid,String memberid,String currentdate,String returndate){
            int status=0;
            try{
                    Connection con=DB.getConnection();
                    PreparedStatement ps=con.prepareStatement("insert into borrow(bookid,memberid,currentdate,returndate) values(?,?,?,?)");
                    ps.setString(1,bookid);
                    ps.setString(2,memberid);
                    ps.setString(3,currentdate);
                    ps.setString(4,returndate);
                    status=ps.executeUpdate();
                    con.close();
            }catch(Exception e){System.out.println(e);}
            return status;
    }
    public static int delete(String bookid,String memberid){
            int status=0;
            try{
                    Connection con=DB.getConnection();
                    PreparedStatement ps=con.prepareStatement("delete from borrow where bookid=? and memberid=?");
                    ps.setString(1,bookid);
                    ps.setString(1,memberid);
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
