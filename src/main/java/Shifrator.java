import java.nio.charset.StandardCharsets;

public class Shifrator {

    public String AsciiToBinary(String asciiString){
        byte[] bytes = asciiString.getBytes();
        StringBuilder binary = new StringBuilder();
        for (byte b : bytes)
        {
            int val = b;
            for (int i = 0; i < 8; i++)
            {
                binary.append((val & 128) == 0 ? 0 : 1);
                val <<= 1;
            }
        }
        return binary.toString();
    }

    public String transform(String binary) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < binary.length(); i++) {
            sb.append((binary.charAt(i) == 1 ? "0" : "00")+" ");
            for (int j = i; j < binary.length(); j++) {
                if(binary.charAt(j)!=binary.charAt(i)){
                    i=j;
                    sb.append(" ");
                    break;
                }else{
                    sb.append("0");
                }
            }
        }
        return sb.toString().trim();
    }
}
