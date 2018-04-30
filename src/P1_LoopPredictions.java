/*
	ISYS 320
	Name(s):
	Date: 
*/

/*
 How many times do you expect the loop to repeat? Remember that 
 Till it hits the max it was told to go.
 
 What do you expect the loop to output?
 
 (a)
 Repeats: till 100
 Expected output:increments of 10
 (b)
 Repeats:till 10
 Expected output:
 (c)
 Repeats: till 250
 Expected output:number to 250
 (d)
 Repeats:
 Expected output:no clue
   
 */

/*
 Was your prediction correct?
 
 (a)yes
 (b)no
 (c)yes and no. It keeps looping 250
 (d)no

*/
public class P1_LoopPredictions {

	public static void main(String[] args) {
		System.out.println("STARTING LOOP TEST");
		
		
		// copy and paste the loop to test between here, between the println statements
		// a
		
		String word = "a";
		while( word.length() < 10 ) {
		    word = "b" + word + "b";
		}
				
		System.out.println("ENDING LOOP TEST");
	}

}
