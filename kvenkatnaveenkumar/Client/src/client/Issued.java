package client;

public class Issued {
    private String bookid,memberid,currentdate,returndate;
    public Issued(String bookid,String memberid,String currentdate,String returndate){
        this.bookid=bookid;
        this.memberid=memberid;
        this.currentdate=currentdate;
        this.returndate=returndate;
        
        }
    public String getbookid(){
        return bookid;
        }
    public String getmemberid(){
        return memberid;
        }
    public String getcurrentdate(){
        return currentdate;
        }
    public String getreturndate(){
        return returndate;
        }
}
