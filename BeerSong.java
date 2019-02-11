
public class BeerSong {
	
	public static void main(String[] args) {
		ninetyNineBottlesOfBeer();
	}
	
	private static void ninetyNineBottlesOfBeer() {
		int bottles = 99;
		while (bottles > 2) {
			System.out.println("" + bottles + " bottles of beer on the wall, " + bottles + " bottles of beer\ntake one down, pass it around, " + --bottles + " bottles of beer on the wall.");
		}
		// Last two lines of the song (unique wording)
		System.out.println("2 bottles of beer on the wall, 2 bottles of beer\ntake one down, pass it around, 1 bottle of beer on the wall.\n1 bottle of beer on the wall, 1 bottle of beer\ntake one down, pass it around, no more bottles of beer on the wall.");
	}
	
}