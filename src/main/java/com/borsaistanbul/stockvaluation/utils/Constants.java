package com.borsaistanbul.stockvaluation.utils;

import lombok.experimental.UtilityClass;

@UtilityClass
public class Constants {

    // BALANCE SHEET CONSTANTS
    public static final String FINTABLES = "https://fintables.com/sirketler/{0}/finansal-tablolar/excel?currency=TRY";
    public static final String INITIAL_CAPITAL = "Ödenmiş Sermaye";
    public static final String CASH_AND_EQUIVALENTS = "Nakit ve Nakit Benzerleri";
    public static final String FINANCIAL_LIABILITIES = "Finansal Borçlar";
    public static final String FINANCIAL_INVESTMENTS = "Finansal Yatırımlar";
    public static final String EQUITIES = "Ana Ortaklığa Ait Özkaynaklar";
    public static final String PARENT_COMPANY_SHARES = "Ana Ortaklık Payları";

    // INCOME STATEMENT CONSTANTS
    public static final String GROSS_PROFIT = "Brüt Kar (Zarar)";
    public static final String ADMINISTRATIVE_EXPENSES = "Genel Yönetim Giderleri (-)";
    public static final String MARKETING_SALES_DISTRIBUTION_EXPENSES = "Pazarlama, Satış ve Dağıtım Giderleri (-)";
    public static final String RESEARCH_DEVELOPMENT_EXPENSES = "Araştırma ve Geliştirme Giderleri (-)";
    public static final String AMORTIZATION = "Amortisman";
    public static final String OPERATIONAL_PROFIT_BEFORE_TAX = "Sürdürülen Faaliyetler Vergi Öncesi Karı (Zararı)";
    public static final String TAX_FROM_OPERATIONS = "Sürdürülen Faaliyetler Vergi Geliri (Gideri)";

    // CASH FLOW TABLE CONSTANTS
    public static final String CASH_FLOW_FROM_OPERATIONS = "İşletme Faaliyetlerinden Nakit Akışları";
    public static final String CAPITAL_EXPENDITURES = "Maddi ve Maddi Olmayan Duran Varlıkların Alımından Kaynaklanan Nakit Çıkışları";

}