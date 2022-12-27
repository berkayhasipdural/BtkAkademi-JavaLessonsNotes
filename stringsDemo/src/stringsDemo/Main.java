package stringsDemo;

import javax.swing.SwingUtilities;

public class Main {

	public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel.";
        System.out.println(mesaj);

        System.out.println("Eleman sayısı : " + mesaj.length()); //uzunluğu
        System.out.println("5. eleman : " + mesaj.charAt(4)); //5. Eleman
        System.out.println(mesaj.concat(" Yaşasın!"));//Sonuna koyar
        System.out.println(mesaj.startsWith("B"));//Bunlamı Başlar ?
        System.out.println(mesaj.endsWith("."));//Bunlamı biter?
        char[] karakterler = new char[5];
        mesaj.getChars(0,5,karakterler,0);//0ile 5 arasındaki karakterler
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf("av")); //
        System.out.println(mesaj.lastIndexOf("a"));

        String yeniMesaj = mesaj.replace(' ','-');//aralara boşluk koyar
        System.out.println(yeniMesaj);
        System.out.println(mesaj.substring(2,5));

        for (String kelime : mesaj.split(" ")){
            System.out.println(kelime);
        }

        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());
        System.out.println(mesaj.trim());

    }
}
