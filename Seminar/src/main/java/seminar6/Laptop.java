package seminar6;

import java.time.LocalDate;
import java.util.Date;

public class Laptop {
    /**
     * Подумать над структурой класса Ноутбук для магазина техники
     * - выделить поля и методы. Реализовать в java.
     * Создать множество ноутбуков (ArrayList).
     * Отфильтровать ноутбуки их первоначального множества
     * и вывести проходящие по условиям.
     * Например, спросить у пользователя минимальный размер оперативной памяти
     * или конкретный цвет. Выводить только те ноутбуки, что соответствуют условию**/
    private double price;
    private String vendor;
    private String model;
    private Date dateOfRelease;
    private String color;
    private String matrix;
    private String screenResolution;
    private double displayDiagonal;
    private int screenRefreshRate;
    private String processorVendor;
    private String processorRate;
    private String ramType;
    private int ramValue;
    private String graphicCard;
    private String os;

    public Laptop(String vendor, String model, double price, Date dateOfRelease, String color, String matrix, String screenResolution, double displayDiagonal, int screenRefreshRate, String processorVendor, String processorRate, String ramType, int ramValue, String graphicCard, String os) {
        this.vendor = vendor;
        this.model = model;
        this.price = price;
        this.dateOfRelease = dateOfRelease;
        this.color = color;
        this.matrix = matrix;
        this.screenResolution = screenResolution;
        this.displayDiagonal = displayDiagonal;
        this.screenRefreshRate = screenRefreshRate;
        this.processorVendor = processorVendor;
        this.processorRate = processorRate;
        this.ramType = ramType;
        this.ramValue = ramValue;
        this.graphicCard = graphicCard;
        this.os = os;
    }

    public Laptop(String vendor, String model,  double price, String color, String matrix, double displayDiagonal, String processorVendor, String ramType, int ramValue, String graphicCard) {
        this.vendor = vendor;
        this.model = model;
        this.price = price;
        this.color = color;
        this.matrix = matrix;
        this.displayDiagonal = displayDiagonal;
        this.processorVendor = processorVendor;
        this.ramType = ramType;
        this.ramValue = ramValue;
        this.graphicCard = graphicCard;
    }

    public Laptop(String vendor, String model) {
        this.vendor = vendor;
        this.model = model;
    }

    public Date getDateOfRelease() {
        return dateOfRelease;
    }

    public void setDateOfRelease(Date dateOfRelease) {
        this.dateOfRelease = dateOfRelease;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMatrix() {
        return matrix;
    }

    public void setMatrix(String matrix) {
        this.matrix = matrix;
    }

    public String getScreenResolution() {
        return screenResolution;
    }

    public void setScreenResolution(String screenResolution) {
        this.screenResolution = screenResolution;
    }

    public double getDisplayDiagonal() {
        return displayDiagonal;
    }

    public void setDisplayDiagonal(double displayDiagonal) {
        this.displayDiagonal = displayDiagonal;
    }

    public int getScreenRefreshRate() {
        return screenRefreshRate;
    }

    public void setScreenRefreshRate(int screenRefreshRate) {
        this.screenRefreshRate = screenRefreshRate;
    }

    public String getProcessorVendor() {
        return processorVendor;
    }

    public void setProcessorVendor(String processorVendor) {
        this.processorVendor = processorVendor;
    }

    public String getProcessorRate() {
        return processorRate;
    }

    public void setProcessorRate(String processorRate) {
        this.processorRate = processorRate;
    }

    public String getRamType() {
        return ramType;
    }

    public void setRamType(String ramType) {
        this.ramType = ramType;
    }

    public int getRamValue() {
        return ramValue;
    }

    public void setRamValue(int ramValue) {
        this.ramValue = ramValue;
    }

    public String getGraphicCard() {
        return graphicCard;
    }

    public void setGraphicCard(String graphicCard) {
        this.graphicCard = graphicCard;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public void show(){
        String show = vendor + " " +
                model + " " +
                price + " " +
                ((color != null) ? color + " ": "")  +
                ((matrix != null) ? matrix : "") + " " +
                ((screenResolution != null) ? screenResolution + " " : "")  +
                ((displayDiagonal > 0 ) ? displayDiagonal  + " " : "") +
                ((screenRefreshRate > 0) ? screenRefreshRate + " " : "") +
                ((processorVendor != null) ? processorVendor + " " : "") +
                ((processorRate != null) ? processorRate + " " : "") +
                ((ramType != null) ? ramType + " " : "") +
                ((ramValue > 0) ? ramValue + " " : "") +
                ((graphicCard != null) ? graphicCard + " " : "") +
                ((os != null) ? os : "") ;

        System.out.println(show);
    }
    @Override
    public String toString() {
        return "Laptop{" +
                "Производитель'" + vendor + '\'' +
                ", Модель '" + model + '\'' +
                ", Дата релиза " + dateOfRelease +
                ", цвет '" + color + '\'' +
                ", Матрица '" + matrix + '\'' +
                ", Разрешение экрана '" + screenResolution + '\'' +
                ", Диагональ дисплея '" + displayDiagonal +
                ", Частота обновления дисплея " + screenRefreshRate +
                ", Процессор '" + processorVendor + '\'' +
                ", Частота прочессора '" + processorRate + '\'' +
                ", Тип памяти '" + ramType + '\'' +
                ", Частота памяти '" + ramValue + '\'' +
                ", Видеокарта '" + graphicCard + '\'' +
                ", Операционная систима '" + os + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        Laptop t = (Laptop) obj;
        return this.model.equals(t.model);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
