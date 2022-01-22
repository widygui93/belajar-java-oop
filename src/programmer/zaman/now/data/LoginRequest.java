package programmer.zaman.now.data;

public record LoginRequest(String username, String password) {

    public LoginRequest{
        System.out.println("membuat objek LoginRequest");
    }

    public LoginRequest(String username){

        this(username,"");
    }

    public LoginRequest(){
        this("","");
    }
}
