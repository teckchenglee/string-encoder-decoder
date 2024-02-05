# String Encoder Decoder

An encoder that takes in a plaintext and encodes it to another obfuscated string.


Logic:
Set any character in the reference table as the offset. The first character of the encoded message will be the offset character. 
Any character not in the reference table will mapped back to the same character.


For example, if the offset character is B, the entire table will shift by 1 element down. 
Thus, given the plaintext HELLO WORLD, it will be encoded as **BGDKKN VNQKC**


![image](https://github.com/teckchenglee/string-encoder-decoder/assets/143769496/6a3a5465-d1af-47c7-ab20-08017f01a967)


Let’s take F as the offset character for another example. 
The entire table will shift 5 elements down. It will be encoded as **FC/GGJ RJMG.**


![image](https://github.com/teckchenglee/string-encoder-decoder/assets/143769496/3024852b-cf92-4c03-a3d9-ce4182b92684)


To decode it, take the first character for offset and match it backward to get the original plaintext

## Example 
Default Reference Table

| A | B | C | D | E | F | G | H | I | J | K | L | M | N | O | P | Q | R | S | T | U | V | W | X | Y | Z | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | ( | ) | * | + | , | - | . | / |

Offset Reference Table of "B" [Table will shift down by 1 position]

| / | A | B | C | D | E | F | G | H | I | J | K | L | M | N | O | P | Q | R | S | T | U | V | W | X | Y | Z | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | ( | ) | * | + | , | - | . |

Offset Reference Table of "F" [Table will shift down by 5 positions]

| + | , | - | . | / | A | B | C | D | E | F | G | H | I | J | K | L | M | N | O | P | Q | R | S | T | U | V | W | X | Y | Z | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | ( | ) | * |
