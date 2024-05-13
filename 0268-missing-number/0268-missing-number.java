import java.util.*;

class Solution {
    public int missingNumber(int[] nums) {
        // 0. 출력용 변수
        int answer = 0;
        // missing num을 찾기 위한 boolean 배열
        boolean[] check = new boolean[nums.length + 1];

        // 1. 주어진 배열을 정렬한다.
        Arrays.sort(nums);

        // 2. 존재하는 nums의 원소를 true로 체크한다.
        for (int i = 0; i < nums.length; i ++) {
            check[nums[i]] = true;
        }

        // 3. false = missing num
        for (int i = 0; i < check.length; i ++) {
            if (!check[i]) {
                answer = i;
                break;
            }
        }

        return answer;
    }
}