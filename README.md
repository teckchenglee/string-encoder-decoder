# String Encoder Decoder

An encoder that takes in a plaintext and encodes it to another obfuscated string.


Logic:
Set any character in the reference table as the offset. The first character of the encoded message will be the offset character. 
Any character not in the reference table will mapped back to the same character.


For example, if the offset character is B, the entire table will shift by 1 element down. 
Thus, given the plaintext HELLO WORLD, it will be encoded as **BGDKKN VNQKC**


Let’s take F as the offset character for another example. 
The entire table will shift 5 elements down. It will be encoded as **FC/GGJ RJMG.**

To decode it, you need to take the first character for 
offset and match it backward to get the original 
plaintext
