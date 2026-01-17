package Practice.Streams;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class SkippingBytesFromInputStream {
	public static void main(String[] args) throws IOException {
		byte[] inputData = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		System.out.println(inputData);
		InputStream inputStream = new ByteArrayInputStream(inputData);
		 long bytesToSkip = 3;
		    long skippedBytes = inputStream.skip(bytesToSkip);
		    System.out.println(inputStream.readAllBytes().toString());
		    
	}

}
