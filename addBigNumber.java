import java.math.BigInteger;
public class addBigNumber{
	public static void main( String... numbers ){
		try{
			BigInteger number = addBigNumber( numbers );
			System.out.print( number.toString( ) );
		}catch( Exception exception ){
			System.err.print( exception.getMessage( ) );
		}
	}

	/*
		This enables reflection to work on this method only.
	*/
	public static BigInteger addBigNumber( String... numbers ){
		BigInteger number = new BigInteger( numbers[ 0 ] );
		for( int index = 1; index < numbers.length; index++ ){
			number = number.add( new BigInteger( numbers[ index ] ) );	
		}
		return number;
	}
}