package br.com.extratos.xlsx.report;
import java.util.Map;

import org.apache.poi.xssf.streaming.SXSSFCell;
import org.apache.poi.xssf.streaming.SXSSFRow;
import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;

public class Xlsx {

    // Elementos do arquivo XLSX
    private SXSSFWorkbook workbook;
    private SXSSFSheet sheet;
    private SXSSFRow row;
    private SXSSFCell cell;
    private int currentRow;

    
    //  Estilos do arquivo XLSX
    private Map<String, XSSFCellStyle> estilos;
    

    private void addEstilo(String styleKey, Style style, Integer fontSize) {
    
        ReportStyle reportStyle = style.getReportStyle();
        XSSFCellStyle  cellStyle = (XSSFCellStyle) workbook.createCellStyle();
        cellStyle.setFont( getFontPadrao(reportStyle));

          addEstilo(styleKey, cellStyle);
    }

    private XSSFFont getFontPadrao(ReportStyle reportStyle) {
        XSSFFont font = (XSSFFont) workbook.createFont();
        font.setFontName(reportStyle.getFontName());
        font.setFontHeightInPoints(reportStyle.getFontSize());
        font.setBold(reportStyle.isBold());
        font.setItalic(reportStyle.isItalic());
        font.setColor(((XSSFCellStyle) reportStyle.getFontColor()).getIndex());
        return font;
    }
    
    private void addEstilo(String styleKey, XSSFCellStyle style) {
        estilos.putIfAbsent(styleKey, (XSSFCellStyle) workbook.createCellStyle());
    }


}
