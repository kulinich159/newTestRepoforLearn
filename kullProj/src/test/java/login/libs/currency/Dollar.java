package login.libs.currency;

public class Dollar extends Currency implements IfFreeConverted{
    public Dollar(double kursNBU) {
        super(kursNBU);
    }

    // поставить курсо и alt+enter - автоматически создает запись для имплементации
    @Override
    String getCurrencyName() {
        return "Dollar";
    }

    @Override
    public boolean isfreeConv() {
        return true;
    }

}
