class Solution {
    public String addStrings(String num1, String num2) {
        // 1. 출력용 변수
        StringBuilder result = new StringBuilder();
        // 2. 자리 올림 수
        int carry = 0;
        // 3. 일의 자리 ~ n의 자리까지 순서대로 연산하기 위한 idx
        int p1 = num1.length() - 1;
        int p2 = num2.length() - 1;

        // 4. idx가 0일 때까지 또는 자리 올림 수가 남아있을 때까지 연산
        while (p1 >= 0 || p2 >= 0 || carry != 0) { 
            // 5-1. 일의 자리부터 하나씩 수를 가져옴
            // 5-2. 이때, 자릿수가 차이나는 연산을 진행(ex. 10 + 1)하거나 0끼리 더해야할 경우, 0이 필요 
            int x1 = p1 >= 0 ? num1.charAt(p1) - '0' : 0; 
            int x2 = p2 >= 0 ? num2.charAt(p2) - '0' : 0;

            // 6. 각 자릿수의 합
            int value = (x1 + x2 + carry) % 10;
            // 7. 다음 자리로 넘겨주기 위한 자리 올림 수 갱신
            carry = (x1 + x2 + carry) / 10; // carry는 항상 1 또는 0.

            // 8. 출력용 변수에 합 저장
            result.append(value);
            // 9. 인덱스 --
            p1--;
            p2--;
        }

        // 10. reverse();
        return result.reverse().toString();
    }
}