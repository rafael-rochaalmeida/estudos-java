package br.com.extratos.xlsx.report;

import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;

public enum Style {

    // textoNormal( "textoNormal", "TEXT", new ReportStyle("Arial", (short)10, false, false, IndexedColors.BLACK.getIndex(), null, HorizontalAlignment.LEFT, false)),
    textoNormal("textoNormal", "TEXT", new ReportStyle("Arial", 10, false, false, IndexedColors.BLACK.getIndex(), null, HorizontalAlignment.LEFT, false));

    titulo("titulo", "TEXT", new ReportStyle("Arial", 12, true, false, IndexedColors.BLACK.getIndex(), null, HorizontalAlignment.CENTER, false));

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
