package com.zerodhatech.models;

import com.google.gson.annotations.SerializedName;

/**
 * A wrapper for margin calculation response data.
 */
public class MarginCalculationData {
    @SerializedName("type")
    public String type;
    @SerializedName("exchange")
    public String exchange;
    @SerializedName("tradingsymbol")
    public String tradingSymbol;
    @SerializedName("span")
    public double span;
    @SerializedName("exposure")
    public double exposure;
    @SerializedName("option_premium")
    public double option_premium;
    @SerializedName("additional")
    public double additional;
    @SerializedName("bo")
    public double bo;
    @SerializedName("cash")
    public double cash;
    @SerializedName("var")
    public double var;
    @SerializedName("pnl")
    public PnL pnl;
    @SerializedName("total")
    public double total;
    @SerializedName("charges")
    public Charges charges;

    public class PnL {
        @SerializedName("realised")
        double realised;
        @SerializedName("unrealised")
        double unrealised;
    }

    public class Charges{
        @SerializedName("transaction_tax")
        public double transactionTax;
        @SerializedName("transaction_tax_type")
        public String transactionTaxType;
        @SerializedName("exchange_turnover_charge")
        public double exchangeTurnoverCharge;
        @SerializedName("sebi_turnover_charge")
        public double SEBITurnoverCharge;
        @SerializedName("brokerage")
        public double brokerage;
        @SerializedName("stamp_duty")
        public double stampDuty;
        @SerializedName("gst")
        public GST gst;
        @SerializedName("total")
        public double total;
    }

    public class GST{
        @SerializedName("igst")
        public double IGST;
        @SerializedName("cgst")
        public double CGST;
        @SerializedName("sgst")
        public double SGST;
        @SerializedName("total")
        public double total;
    }
}
