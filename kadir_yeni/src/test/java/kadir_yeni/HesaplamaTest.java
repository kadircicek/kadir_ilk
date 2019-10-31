package kadir_yeni;

import org.junit.*;

public class HesaplamaTest {
	@Test
	public void testToplaHataliSayilar() {
		String sayi1 = "100x";
		String sayi2 = "42";
		String sonuc = Hesaplama.topla(sayi1, sayi2);
		Assert.assertEquals("undefined", sonuc);
	}
	@Test
	public void testToplaTamSayilar() {
		String sayi1 = "100";
		String sayi2 = "42";
		String sonuc = Hesaplama.topla(sayi1, sayi2);
		Assert.assertEquals("142", sonuc);
	}

	@Test
	public void testToplaOndalikSayilar() {
		String sayi1 = "100.50";
		String sayi2 = "42.3";
		String sonuc = Hesaplama.topla(sayi1, sayi2);
		Assert.assertEquals("142.80", sonuc);
	}
	@Test
	public void testToplaBuyukSayilar() {
		String sayi1 = "100000000000";
		String sayi2 = "100000000042";
		String sonuc = Hesaplama.topla(sayi1, sayi2);
		Assert.assertEquals("200000000042", sonuc);
	}

}
