package login.libs.currency;

import org.apache.log4j.Logger;

abstract public class Currency {// абстракт описывает но от него нельзя сделать наследника

    Logger logger;
    private double kursNBU;
    private double marga = 0.1;


    public Currency(double kursNBU) {
        this.kursNBU = kursNBU;
        logger = Logger.getLogger(getClass());
    }

    public double getKursNBU() {
        return kursNBU;
    }

    public void setKursNBU(double kursNBU) {
        this.kursNBU = kursNBU;
    }

//  alt + insert подсказка для автоматической вставки гетеров и сетеров в случае если есть переменные соответствующие

    public double getMarga() {
        return marga;
    }

    public void setMarga(double marga) {
        this.marga = marga;
    }



    public double exchangedCurrencyToGrn (double amountOfCurrency){

//        if (IfFreeConverted) {
        double tempResult = amountOfCurrency * kursNBU * (1 - marga);
        logger.info("For " + amountOfCurrency + "(" + kursNBU + ") " + getCurrencyName() + " you get " + tempResult + " grn");
        return tempResult;
//        } else {
//
//            double tempResult = amountOfCurrency * kursNBU * (1 - margaNotFreeConvert);
//            System.out.println("For " + amountOfCurrency + "(" + kursNBU + ") " + getCurrencyName() + " you get " + tempResult + " grn");
//            return tempResult;
//
//        }

    }

    abstract  String getCurrencyName();


}
