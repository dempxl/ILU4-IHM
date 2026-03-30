/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ihm.tp1;

/**
 *
 * @author logan
 */
public class ImpressionFile {

    private String fileName;
    private int number;
    private String format;
    private boolean doubleSide;
    private boolean blackAndWhite;
    private String paperQuality;

    public ImpressionFile(String fileName, int number, String format, boolean doubleSide, boolean blackAndWhite, String paperQuality) {
        this.fileName = fileName;
        this.number = number;
        this.format = format;
        this.doubleSide = doubleSide;
        this.blackAndWhite = blackAndWhite;
        this.paperQuality = paperQuality;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public boolean isDoubleSide() {
        return doubleSide;
    }

    public void setDoubleSide(boolean doubleSide) {
        this.doubleSide = doubleSide;
    }

    public boolean isBlackAndWhite() {
        return blackAndWhite;
    }

    public void setBlackAndWhite(boolean blackAndWhite) {
        this.blackAndWhite = blackAndWhite;
    }

    public String getPaperQuality() {
        return paperQuality;
    }

    public void setPaperQuality(String paperQuality) {
        this.paperQuality = paperQuality;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(fileName);
        builder.append("-");
        builder.append(number);
        builder.append("-");
        if (isDoubleSide()) {
            builder.append("Recto/Verso");
        } else {
            builder.append("Recto");
        }
        builder.append("-");
        if (isBlackAndWhite()) {
            builder.append("Noir&Blanc");
        } else {
            builder.append("Couleur");
        }
        builder.append("-");
        builder.append(paperQuality);
        return builder.toString();
    }
  
}
