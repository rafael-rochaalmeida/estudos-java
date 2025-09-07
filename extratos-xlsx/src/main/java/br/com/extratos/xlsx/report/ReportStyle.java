package br.com.extratos.xlsx.report;

import org.apache.poi.ss.usermodel.Color;
import org.apache.poi.ss.usermodel.HorizontalAlignment;

public class ReportStyle {

    private String fontName;
    private Short fontSize;
    private boolean isBold;
    private boolean isItalic;
    private Color fontColor;
    private Color backgroundColor;
    private HorizontalAlignment alignment;
    private boolean multiLine;
    


    public ReportStyle(String fontName, Short fontSize, boolean isBold, boolean isItalic, Color fontColor,
            Color backgroundColor, HorizontalAlignment alignment, boolean multiLine) {
        this.fontName = fontName;
        this.fontSize = fontSize.shortValue();
        this.isBold = isBold;
        this.isItalic = isItalic;
        this.fontColor = fontColor;
        this.backgroundColor = backgroundColor;
        this.alignment = alignment;
        this.multiLine = multiLine;
    }



    public String getFontName() {
        return fontName;
    }



    public void setFontName(String fontName) {
        this.fontName = fontName;
    }



    public Short getFontSize() {
        return fontSize;
    }



    public void setFontSize(Short fontSize) {
        this.fontSize = fontSize;
    }



    public boolean isBold() {
        return isBold;
    }



    public void setBold(boolean isBold) {
        this.isBold = isBold;
    }



    public boolean isItalic() {
        return isItalic;
    }



    public void setItalic(boolean isItalic) {
        this.isItalic = isItalic;
    }



    public Color getFontColor() {
        return fontColor;
    }



    public void setFontColor(Color fontColor) {
        this.fontColor = fontColor;
    }



    public Color getBackgroundColor() {
        return backgroundColor;
    }



    public void setBackgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
    }



    public HorizontalAlignment getAlignment() {
        return alignment;
    }



    public void setAlignment(HorizontalAlignment alignment) {
        this.alignment = alignment;
    }



    public boolean isMultiLine() {
        return multiLine;
    }



    public void setMultiLine(boolean multiLine) {
        this.multiLine = multiLine;
    }

    
    



}
