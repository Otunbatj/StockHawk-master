package com.sam_chordas.android.stockhawk.model;

/**
 * Created by Otunba on 9/21/2016.
 */
public class DateHigh {
    private String quoteDate;
    private String quoteHighValue;

    /**
     *
     * @return quote Date
     */
    public String getQuoteDate() {
        return quoteDate;
    }

    /**
     *
     * @param quoteDate the quote date
     */
    public void setQuoteDate(String quoteDate) {
        this.quoteDate = quoteDate;
    }

    /**
     *
     * @return quoteHighValue
     */
    public String getQuoteHighValue() {
        return quoteHighValue;
    }

    /**
     *
     * @param quoteHighValue
     * The quote_high_value
     */
    public void setQuoteHighValue(String quoteHighValue) {
        this.quoteHighValue = quoteHighValue;
    }
}
