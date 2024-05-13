class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder result = new StringBuilder();
        int carry = 0;
        int p1 = num1.length() - 1;
        int p2 = num2.length() - 1;
        // System.out.println("p1 = " + p1 + ", p2 = " + p2);

        while (p1 >= 0 || p2 >= 0 || carry != 0) {
            int x1 = p1 >= 0 ? num1.charAt(p1) - '0' : 0;
            int x2 = p2 >= 0 ? num2.charAt(p2) - '0' : 0;
            // System.out.println("x1 = " + x1 + ", x2 = " + x2);

            int value = (x1 + x2 + carry) % 10;
            carry = (x1 + x2 + carry) / 10;
            // System.out.println("value = " + value + ", carry = " + carry);
            // System.out.println();

            result.append(value);
            p1--;
            p2--;
        }

        return result.reverse().toString();
    }
}