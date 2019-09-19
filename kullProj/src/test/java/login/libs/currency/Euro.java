package login.libs.currency;

public class Euro extends Currency implements IfFreeConverted{
        public Euro(double kursNBU) {
                super(kursNBU);
        }

        @Override
        String getCurrencyName() {
                return "Euro";
        }

        @Override
        public boolean isfreeConv() {
                return true;
        }
}
