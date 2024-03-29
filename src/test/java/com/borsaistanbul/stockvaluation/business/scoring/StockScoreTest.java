package com.borsaistanbul.stockvaluation.business.scoring;

import com.borsaistanbul.stockvaluation.dto.model.ResponseData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class StockScoreTest {

    private StockScoreImpl stockScore;
    private List<ResponseData> responseDataList;
    private static final String TEST = "TEST";
    private static final double defaultDouble = 10.0;

    @BeforeEach
    void init() {
        stockScore = new StockScoreImpl();
        responseDataList = new ArrayList<>();

        String ticker = TEST;
        String companyName = TEST;
        String latestBalanceSheetTerm = TEST;
        double price = defaultDouble;
        double pe = defaultDouble;
        double netDebtToEbitda = defaultDouble;
        double leverageRatio = defaultDouble;
        double finalScore = defaultDouble;
        String suggestion = TEST;

        ResponseData responseData1 = ResponseData.builder()
                .ticker(ticker)
                .companyName(companyName)
                .latestBalanceSheetTerm(latestBalanceSheetTerm)
                .price(price)
                .pe(pe)
                .pb(defaultDouble)
                .peg(defaultDouble)
                .ebitdaMargin(defaultDouble)
                .netProfitMargin(defaultDouble)
                .netDebtToEbitda(netDebtToEbitda)
                .leverageRatio(leverageRatio)
                .finalScore(finalScore)
                .suggestion(suggestion)
                .build();

        ResponseData responseData2 = ResponseData.builder()
                .ticker(ticker)
                .companyName(companyName)
                .latestBalanceSheetTerm(latestBalanceSheetTerm)
                .price(price)
                .pe(pe)
                .pb(0)
                .peg(0)
                .ebitdaMargin(Double.POSITIVE_INFINITY)
                .netProfitMargin(Double.POSITIVE_INFINITY)
                .netDebtToEbitda(netDebtToEbitda)
                .leverageRatio(leverageRatio)
                .finalScore(finalScore)
                .suggestion(suggestion)
                .build();

        ResponseData responseData3 = ResponseData.builder()
                .ticker(ticker)
                .companyName(companyName)
                .latestBalanceSheetTerm(latestBalanceSheetTerm)
                .price(price)
                .pe(pe)
                .pb(0)
                .peg(0)
                .ebitdaMargin(Double.NEGATIVE_INFINITY)
                .netProfitMargin(Double.NEGATIVE_INFINITY)
                .netDebtToEbitda(netDebtToEbitda)
                .leverageRatio(leverageRatio)
                .finalScore(finalScore)
                .suggestion(suggestion)
                .build();

        responseDataList.add(responseData1);
        responseDataList.add(responseData2);
        responseDataList.add(responseData3);
    }

    @Test
    void test() {
        stockScore.scoring(responseDataList);
        Assertions.assertNotNull(responseDataList);
    }

}
