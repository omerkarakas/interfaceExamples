package com.okarakas;

public class GeometrikSekilApp {

	public static void main(String[] args) {


		// Kare kare = new Kare(5);
		
		GeometrikSekil sekil = new Kare(5);
		System.out.println("Kare(GeometrikSekil) alanı="+ sekil.alan());
		System.out.println("Kare(GeometrikSekil) cevresi="+ sekil.cevre());
		
		Dikdortgen dikt = new Dikdortgen(3, 4); 
		
		sekil = dikt;
		System.out.println("Dikdortgen(GeometrikSekil) alanı="+ sekil.alan());
		System.out.println("Dikdortgen(GeometrikSekil) cevresi="+ sekil.cevre());
		
		Boyanabilir renkliSekil = dikt;
		renkliSekil.boya("kırmızı");
		renkliSekil.boyaSil();
		
		/*
		System.out.println("Dikdörtgen:");
		System.out.println("Alan:"+dikdortgen.alan());
		System.out.println("Çevre:"+dikdortgen.cevre());

		
		System.out.println("Kare:");
		System.out.println("Alan:"+kare.alan());
		System.out.println("Çevre:"+kare.cevre());
		*/
	}

}
