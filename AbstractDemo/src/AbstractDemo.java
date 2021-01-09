abstract class AbstractDemo {
    public int a;
    public AbstractDemo(){
        a = 10;
    }

    abstract public void set(int a);
    abstract public void get();
    }

    class Demo extends AbstractDemo{
        public void set(int a){
            this.a = a;
        }
        final public void get(){
            System.out.println("a = " + a);
        
        }
        public static void main(String[] args){
            Demo obj = new Demo();
            obj.set(20);
            obj.get();
        }
    }

