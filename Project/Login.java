import java.io.*;

public class Login {
    public static void main(String[] args) throws Exception {
        Console c = System.console();
        String uname = c.readLine("User ID		: ");
        char[] pwd = c.readPassword("Password	: ");
        String upwd = new String(pwd);
        if(uname.equals("shubham.panchal") && upwd.equals("welcome2digivalet")) System.out.println("Welcome Shubham");
        else System.err.println("Pleace enter valid User ID and Password");
    }
}