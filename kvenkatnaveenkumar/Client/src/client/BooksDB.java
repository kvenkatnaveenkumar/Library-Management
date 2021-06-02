package client;

import java.sql.*;

public class BooksDB {
            public static int save(String id,String title,String isbn,String author,String publisher,String year,String edition,int copies,String shelf,String available){
                    int status=0;
                    try{
                            Connection con=DB.getConnection();
                            PreparedStatement ps=con.prepareStatement("insert into books(id,title,isbn,author,publisher,year,edition,copies,shelf,available) values(?,?,?,?,?,?,?,?,?,?)");
                            ps.setString(1,id);
                            ps.setString(2,title);
                            ps.setString(3,isbn);
                            ps.setString(4,author);
                            ps.setString(5,publisher);
                            ps.setString(6,year);
                        ps.setString(7,edition);
                        ps.setInt(8,copies);
                        ps.setString(9,shelf);
                        ps.setString(10,available);
                        
                            status=ps.executeUpdate();
                            con.close();
                    }catch(Exception e){System.out.println(e);}
                    return status;
            }
        public static int update(int copies,String bookid){
                int status=0;
                try{
                        Connection con=DB.getConnection();
                        PreparedStatement ps=con.prepareStatement("UPDATE Books SET copies =?,availble = false WHERE ID =?");
                        ps.setInt(1,copies);
                        ps.setString(2,bookid);
                        status=ps.executeUpdate();
                        con.close();
                }catch(Exception e){System.out.println(e);}
                return status;
        }
            public static int deletebyid(int id){
                    int status=0;
                    try{
                            Connection con=DB.getConnection();
                            PreparedStatement ps=con.prepareStatement("delete from books where id=?");
                            ps.setInt(1,id);
                            status=ps.executeUpdate();
                            con.close();
                    }catch(Exception e){System.out.println(e);}
                    return status;
            }
        public static int deletebyisbn(int isbn){
                int status=0;
                try{
                        Connection con=DB.getConnection();
                        PreparedStatement ps=con.prepareStatement("delete from books where isbn=?");
                        ps.setInt(1,isbn);
                        status=ps.executeUpdate();
                        con.close();
                }catch(Exception e){System.out.println(e);}
                return status;
        }
            public static boolean validate(String id){
                    boolean status=false;
                    try{
                            Connection con=DB.getConnection();
                            PreparedStatement ps=con.prepareStatement("select * from books where id=?");
                            ps.setString(1,id);
                            ResultSet rs=ps.executeQuery();
                            status=rs.next();
                            con.close();
                    }catch(Exception e){System.out.println(e);}
                    return status;
            }

    }


