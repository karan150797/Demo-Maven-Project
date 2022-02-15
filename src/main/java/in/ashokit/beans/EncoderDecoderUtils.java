package in.ashokit.beans;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class EncoderDecoderUtils {
	
	public String encode(String text) {
		System.out.println("Updated");
		Encoder encoder = Base64.getEncoder();
		byte [] encode = encoder.encode(text.getBytes());
		return new String(encode);
	}
	
	public String decode(String encodedText) {
		Decoder decoder = Base64.getDecoder();
		byte [] decode = decoder.decode(encodedText);
		return new String(decode);
	}
	
}

