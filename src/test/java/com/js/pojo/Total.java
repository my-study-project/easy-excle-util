package com.js.pojo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Total {
    /**
     * 我方借款订单号
     */
    private String loanNo;

    /**
     * 订单对应还款阶段
     */
    private Integer step;

    /**
     * 资方合同号
     */
    private String thirdLoanId;

}
