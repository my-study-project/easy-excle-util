package com.js.pojo;

import lombok.Data;

@Data
public class ThirdAndStep {
    /**
     * 三方订单号
     */
    private String thirdLoanId;

    /**
     * 订单对应还款阶段
     */
    private Integer step;
}
