package client;

public class Member {
    private String id,name,email,phone;
    public Member(String id,String name,String email,String phone){
        this.id=id;
        this.name=name;
        this.email=email;
        this.phone=phone;
        
        }
    public String getid(){
        return id;
        }
    public String getname(){
        return name;
        }
    public String getemail(){
        return email;
        }
    public String getphone(){
        return phone;
        }
}
