public class output {
        public static void main(String[] args) {
            String str = "12345";
            int index = 2; // Index of the character to convert
            
            // Get the character at the specified index
            char ch = str.charAt(index);
            
            // Convert the character to its integer representation by casting
            int intValue = (int) ch - '0';
            
            System.out.println("Integer value at index " + index + ": " + intValue); // Output: Integer value at index 2: 3
        }
    }
    