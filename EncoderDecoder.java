public class EncoderDecoder {
    private final String referenceTable = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789()*+,-./";
  /******************************************************************************/
  /*!
  
    \brief
      Encode the plaintext to an obfuscated string
    
    \param plainText
      Parameter passed into the functions will encode the string
    
    \return
      Return a string
    
   */
  /******************************************************************************/
    public String encode(String plainText) {
      StringBuilder encodedText = new StringBuilder();
      //Offset character to be set
      char offsetChar = 'B';
      int offset = referenceTable.indexOf(offsetChar);
      //Encode the string by the offset position
      for (char ch : plainText.toCharArray()) {
        int index = referenceTable.indexOf(ch);
        //Check if character in the referenceTable
        if (index != -1) {
          //Append the reference character by the offset position from the back
          index = (index - offset + referenceTable.length() ) % 
          referenceTable.length();
          encodedText.append(referenceTable.charAt(index));
        } else {
          encodedText.append(ch);
        }
      }
      return offsetChar + encodedText.toString();
    }
    
  /******************************************************************************/
  /*!
  
    \brief
      Decode an obfuscated string to plaintext
    
    \param encodedText
      Parameter passed into the functions will decode the string
    
    \return
      Return a string
    
   */
  /******************************************************************************/
    public String decode(String encodedText) {
      //Extract the offset character
      char offsetChar = encodedText.charAt(0);
      int offset = referenceTable.indexOf(offsetChar);
      StringBuilder decodedText = new StringBuilder();
      //Decode from the 2nd character in the string
      for (char ch : encodedText.substring(1).toCharArray()) {
        int index = referenceTable.indexOf(ch);
        //Check if character in the referenceTable
        if (index != -1) {
          //Append the reference character by the offset position from the back
          index = (index + offset + referenceTable.length()) % 
          referenceTable.length();
          decodedText.append(referenceTable.charAt(index));
        } else {
          decodedText.append(ch);
        }
      }
      return decodedText.toString();
    }
  
    public static void main(String[] args) {
      EncoderDecoder encoderDecoder = new EncoderDecoder();
  
      String plainText = "HELLO WORLD";
      String encodedText = encoderDecoder.encode(plainText);
      System.out.println("Encoded text: " + encodedText);
  
      String decodedText = encoderDecoder.decode(encodedText);
      System.out.println("Decoded text: " + decodedText);
    }
  }
  