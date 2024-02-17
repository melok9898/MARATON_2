package com.melih;

public class Runner {


    public static void main(String[] args) {

        CustomStringTr stringdeneme = new CustomStringTr("En büyük Cimbom");
        System.out.println(stringdeneme.uzunluk());
        System.out.println(stringdeneme.oradakiKarakter(1));
        System.out.println(stringdeneme.altString(2,7));
        System.out.println(stringdeneme.indexi('b'));

        CustomStringTr denemeBosmu = new CustomStringTr("cimbombom");
        CustomStringTr denemeBosmu2 = new CustomStringTr("");
        CustomStringTr denemeBosmu3 = new CustomStringTr(" ");


//        System.out.println(denemeBosmu.bosMu());
//        System.out.println(denemeBosmu.bosMu2());
//        System.out.println(denemeBosmu2.bosMu());
//        System.out.println(denemeBosmu2.bosMu2());
//        System.out.println(denemeBosmu3.bosMu());
//        System.out.println(denemeBosmu3.bosMu2());

        System.out.println(stringdeneme.bunlaBaslar("En"));
        System.out.println(stringdeneme.bunlaBaslar("cimbom"));

        System.out.println(stringdeneme.bunlaBiter("bom"));
        System.out.println(stringdeneme.bunlaBiter("bombombom"));

        System.out.println(stringdeneme.buyukharfecevir());
        System.out.println(stringdeneme.kucukharfecevir());



    }
}
