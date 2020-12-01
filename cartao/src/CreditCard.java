import java.util.Date;

public class CreditCard implements Comparable<CreditCard>{
    int cardNum;
    Date expDate;

    public CreditCard(int cardNum, Date expDate){
        this.cardNum = cardNum;
        this.expDate = expDate;
    }
    
    public int compareTo(CreditCard otherCard) {
        if(this.expDate.equals(otherCard.expDate)){
            if(this.cardNum > otherCard.cardNum){return -1;}
            if(this.cardNum > otherCard.cardNum){return 1;}
        }else{
            if(this.expDate.before(otherCard.expDate)){return -1;}
            if(this.expDate.after(otherCard.expDate)){return 1;}
        }
        return 0;
    }


    public int getCardNum() {
        return cardNum;
    }

    public Date getExpDate() {
        return expDate;
    }

    public void setCardNum(int cardNum) {
        this.cardNum = cardNum;
    }

    public void setExpDate(Date expDate) {
        this.expDate = expDate;
    }
    @Override
    public String toString() {
        return cardNum + " " + expDate;
    }
}
