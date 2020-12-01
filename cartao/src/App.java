import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class App {
    public static void main(String[] args) throws Exception {
        List<CreditCard> list = new ArrayList<CreditCard>();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        
        CreditCard c1 = new CreditCard(123456789, sdf.parse("2020-10-01"));
        CreditCard c2 = new CreditCard(123456789, sdf.parse("2021-05-07"));
        CreditCard c3 = new CreditCard(123456789, sdf.parse("2077-09-12"));
        
        list.add(c1);
        list.add(c2);
        list.add(c3);

        Collections.sort(list);

        System.out.print(list.toString());
    }
}
