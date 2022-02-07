package com.js.easyexcel.domain;

import com.alibaba.excel.annotation.write.style.ContentFontStyle;
import com.alibaba.excel.annotation.write.style.ContentRowHeight;
import com.alibaba.excel.annotation.write.style.ContentStyle;
import com.alibaba.excel.annotation.write.style.HeadFontStyle;
import com.alibaba.excel.annotation.write.style.HeadRowHeight;
import com.alibaba.excel.annotation.write.style.HeadStyle;
import com.alibaba.excel.enums.BooleanEnum;
import com.alibaba.excel.enums.poi.BorderStyleEnum;
import com.alibaba.excel.enums.poi.FillPatternTypeEnum;
import com.alibaba.excel.enums.poi.HorizontalAlignmentEnum;
import com.alibaba.excel.enums.poi.VerticalAlignmentEnum;

/**
 * Excel基本设置
 */
@HeadStyle(fillPatternType = FillPatternTypeEnum.SOLID_FOREGROUND, fillForegroundColor = 30,
        horizontalAlignment = HorizontalAlignmentEnum.CENTER, verticalAlignment = VerticalAlignmentEnum.CENTER,
        wrapped = BooleanEnum.TRUE, shrinkToFit = BooleanEnum.TRUE,
        borderTop = BorderStyleEnum.NONE, borderBottom = BorderStyleEnum.NONE, borderLeft = BorderStyleEnum.NONE, borderRight = BorderStyleEnum.NONE)
@HeadRowHeight(24)
@HeadFontStyle(bold = BooleanEnum.TRUE, color = 9, fontName = "Arial", fontHeightInPoints = 10)
@ContentStyle(horizontalAlignment = HorizontalAlignmentEnum.CENTER, verticalAlignment = VerticalAlignmentEnum.CENTER)
@ContentRowHeight(19)
@ContentFontStyle(fontName = "Arial", fontHeightInPoints = 10)
public abstract class BaseExcelData {

}