package example5_1;

public class UTsample {
	public static void main(String[] args) {

		String a = sample.Gacha(1);
		if (a == "★") {
			System.out.println("OK");
		} else {
			System.out.println("NG");
		}

		a = sample.Gacha(1);
		if (a == "★") {
			System.out.println("OK");
		} else {
			System.out.println("NG");
		}

		
		a = sample.Gacha(0);
		if (a == "★") {
			System.out.println("OK");
		} else {
			System.out.println("NG");
		}
		
		a = sample.Gacha(81);
		if (a == "★") {
			System.out.println("OK");
		} else {
			System.out.println("NG");
		}
		
		a = sample.Gacha(82);
		if (a == "★") {
			System.out.println("OK");
		} else {
			System.out.println("NG");
		}
	}
}