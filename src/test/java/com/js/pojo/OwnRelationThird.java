package com.js.pojo;

import lombok.Data;

@Data
public class OwnRelationThird {

    /**
     * 我方借款订单号
     */
    private String loanNo;

    /**
     * 资方借款订单号
     */
    private String thirdLoanId;
}
