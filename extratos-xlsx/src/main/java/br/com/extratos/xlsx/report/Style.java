package br.com.extratos.xlsx.report;

import org.apache.poi.ss.usermodel.HorizontalAlignment;

public enum Style {

    textoNormal("textoNormal",  "TEXT", new ReportStyle("Arial", 11,  false, false, StyleColor.BLACK, StyleColor.BLACK, HorizontalAlignment.RIGHT, false));

    private final String styleKey;
    private final String styleDataType;
    private final ReportStyle reportStyle;

    private Style(String styleKey, String styleDataType, ReportStyle reportStyle) {
        this.styleKey = styleKey;
        this.styleDataType = styleDataType;
        this.reportStyle = reportStyle;
    }

    public String getStyleKey() {
        return styleKey;
    }

    public String getStyleDataType() {
        return styleDataType;
    }

    public ReportStyle getReportStyle() {
        return reportStyle;
    }
}
