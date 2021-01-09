public class Teste {
    public static void main(String[] args) throws Exception {
        try {
            Teste t = new Teste();
            int d = t.getNum(2, 5);
            System.out.println(d);
        } catch (Exception e) {
            System.out.println("Exceção 1");
        }
    }

    public int getNum(int a, int b) {
        int c = 0;
        try {
            c = a * b;
            if (c > 10)
                throw new Exception("Não pode ser maior que 10");
        } catch (Exception e) {
            System.out.println("Exceção 2");
        }
        return c;
    }
}
