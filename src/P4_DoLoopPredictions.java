/*
	ISYS 320
	Name(s):
	Date: 
*/

/*
 How many times do you expect the loop to repeat? Remember that 

 
 What do you expect the loop to output?
 
 (a)
 Repeats:numbers
 Expected output:increments of 10
 (b)
 Repeats: a countdown of number
 Expected output:countdown
 (c)
 Repeats:
 Expected output:no clue
 (d)
 Repeats:
 Expected output:no clue
   
 */

/*
 Was your prediction correct?
 
 (a)yes
 (b)yes
 (c)no
 (d)no 

*/
public class P4_DoLoopPredictions {

	public static void main(String[] args) {
		System.out.println("STARTING LOOP TEST");
		
		
		// copy and paste the loop to test between here, between the println statements
		String word = "a";
		do {
		    word = "b" + word + "b";
		} while( word.length() < 10 );
		System.out.println( word );
				
		System.out.println("ENDING LOOP TEST");

	}

}
