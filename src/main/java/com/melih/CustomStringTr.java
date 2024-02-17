package com.melih;

public class CustomStringTr {
    public String ifade;

    public CustomStringTr(String ifade) {
        this.ifade = ifade;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CustomStringTr{");
        sb.append("ifade='").append(ifade).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public int uzunluk() {

        return ifade.length();
    }

    public char oradakiKarakter(int index) {
        return ifade.charAt(index);
    }

    public String altString(int baslangic, int bitis) {
        return new CustomStringTr(ifade.substring(baslangic, bitis)).toString();
    }

    public int indexi(char karakter) {
        return ifade.indexOf(karakter);
    }

    public boolean bosMu() {
        return ifade.isEmpty();
    }

    public boolean bosMu2() {
        return ifade.isBlank();
    }

    public boolean bunlaBaslar(String x) {
        return ifade.startsWith(x);
    }

    public boolean bunlaBiter(String x) {
        return ifade.endsWith(x);
    }

    public CustomStringTr buyukharfecevir() {
        return new CustomStringTr(ifade.toUpperCase());
    }

    public CustomStringTr kucukharfecevir() {
        return new CustomStringTr(ifade.toLowerCase());
    }

}
