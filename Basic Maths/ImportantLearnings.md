# 14 -03 - 2024

# 1. What is complexity for the search insert and delete operation in the HashMap in java
In Java, the HashMap data structure provides constant-time ie `O(1)` maverage-case complexity for `search` (get) and `insertion` (put) and `delete`(remove) operations, assuming a good hash function and load factor. However, in the worst case, when there are many hash collisions, the time complexity can degrade to `O(n)`, where n is the number of elements in the HashMap


# 2. How to convert primitive int to string say int num = 54
1. String str = String.valueOf(num);
2. String str = Integer.toString(num);
3. String str = num +""

# 3. Libarary function to reverse the string in java
String originalString = "hello";
StringBuilder reversedString = new StringBuilder(originalString).reverse();
String result = reversedString.toString();
System.out.println(result); // Output: "olleh"

# -----------------------------------------------------------------------------------------------------------------------------