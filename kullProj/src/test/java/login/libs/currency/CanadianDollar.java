package login.libs.currency;


public class CanadianDollar extends Currency implements IfFreeConverted {


    public CanadianDollar(double kursNBU) {
        super(kursNBU);
    }

    @Override
    String getCurrencyName() {
        return "CND";
    }


    @Override
    public boolean isfreeConv() {
        return false;
    }
}
