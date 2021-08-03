package com.company;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplexPrinter;

    public Printer(int tonerLevel, boolean duplexPrinter) {

        if (tonerLevel >= 1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }

        this.duplexPrinter = duplexPrinter;
        this.pagesPrinted = 0;

    }

    public int fillToner(int toner) {

        this.tonerLevel = this.tonerLevel + toner;

        if (toner >0 && toner <=100) {
            if (this.tonerLevel + toner > 100) {
                return -1;
            }
            this.tonerLevel += toner;
            return this.tonerLevel;
        }else {
            return -1;
        }
    }

    public int print(int pages) {
        int pagesToPrint = pages;
        if (this.duplexPrinter) {
            pagesToPrint = (pages / 2) + (pages % 2);
            System.out.println("Printed in duplex mode");
        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }


}
