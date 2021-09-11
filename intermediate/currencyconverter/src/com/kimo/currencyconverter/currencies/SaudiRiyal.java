package com.kimo.currencyconverter.currencies;

import com.kimo.currencyconverter.Currency;

public class SaudiRiyal extends Currency {

    @Override
    public double getValue() {
        return 3.75;
    }

    @Override
    public String getName() {
        return "SAUDI_RIYAL";
    }

    @Override
    public String getSymbol() {
        return "﷼";
    }

    @Override
    public String getISOCode() {
        return "SAR";
    }

}
