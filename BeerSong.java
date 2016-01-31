class BeerSong{

    public static void main(String[] args) {
        Ninety_Nine_Bottles_of_Beer;

    }

    private static string Ninety_Nine_Bottles_of_Beer(){
        int bottlesOfBeer = 99; //Initial Number of Bottles to begin with
 	    String word = "bottles";

	    while (bottlesOfBeer > 0)
	    {
            System.out.println(bottlesOfBeer + " " + word + "of beer on the wall, " + bottlesOfBeer + " " + word + "bttles of beer\n");
	        System.out.println("Take one down, pass it around, ");
            bottlesOfBeer - 1;
            System.out.println(bottlesOfBeer + " " + word + "of beer on the wall.\n");

            if (bottlesOfBeer == 1) {
                word = "bottle";
            }
            else {
            word = "bottles";
            }
        } //End of Song loop

    } // End of Ninety_Nine_Bottles_of_Beer


} // End of BeerSong


    
