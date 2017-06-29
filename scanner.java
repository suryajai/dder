package integer;
import java.io.*;
public class scanner
{
	 public static void main( int[] vals ) {
	        int mask = 0;
	        int show = 0;
	        for( int i : vals){
	            if( (( mask >> i ) & 1) == 1 &&
	                (( show >> i ) & 1) == 0 )
	            {
	                System.out.println( "\n\tfound: " + i );
	                show = show | (1 << i);
	            }

	            else
	            {
	                mask = mask | (1 << i);
	                System.out.println( "new: " + i );
	            }

	            System.out.println( "mask: " + mask );
	        }
	    }

}
