package addBigNumber;

import java.math.BigInteger;

public class addBigNumber{
	public static void main( String... numbers ){
		try{
			BigInteger sum = addBigNumber( numbers );
			System.out.print( sum.toString( ) );
		}catch( Exception exception ){
			System.err.print( exception.getMessage( ) );
		}
	}

	/*
		This enables reflection to work on this method only.
	*/
	public static final BigInteger addBigNumber( String... numbers ){
		BigInteger sum = new BigInteger( numbers[ 0 ] );
		for( int index = 1; index < numbers.length; index++ ){
			sum = sum.add( new BigInteger( numbers[ index ] ) );	
		}
		return sum;
	}
}