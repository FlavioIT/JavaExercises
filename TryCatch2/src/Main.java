import java.io.IOException;

public class Main {
    public static void main(String[] args) throws Exception {
        try{
            throw new IOException("Hello ");
        }catch(IOException e){
            System.out.print(e.getMessage());
        }catch(Exception e){
            System.out.print(e.getMessage());
        }finally{
            System.out.println("World");
        }
    }
}
