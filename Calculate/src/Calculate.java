interface Calculate {
    void cal(int item);
}

class Display implements Calculate{
    int x;
    public void cal(int item){
        x = item * item;
    }
}

class Interfaces{
    public static void main(String[] args) throws Exception {
       Display arr = new Display();
       arr.x = 0;
       arr.cal(2);
       System.out.print(arr.x);
    }
}
   
