// 1. 기존 행렬의 넓이와 새 행렬의 넓이가 같지 않다면, 새 행렬을 리턴
// 2. 행과 열에 대해 두 개의 별도 포인터를 유지하며, (기존 행렬) 먼저 열을 살펴보고 (열 == c) 경우 다음 행으로 이동하고 열 포인터를 다시 0으로 설정

class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        // 1. 원소를 가져오기 위한 기존 행렬의 크기를 변수로 저장
        int rows = mat.length;
        int cols = mat[0].length;

        // 2. 기존 행렬과 새 행렬의 넓이(r * c)가 일치하지 않는다면, 기존 행렬을 리턴
        if ((rows * cols) != (r * c)) return mat;

        // 3. 새 행렬을 생성
        int[][] output = new int[r][c];
        // 3-1. 새 행렬의 r, c idx 정의
        int output_rows = 0;
        int output_cols = 0;

        // 4. 기존 행렬의 r, c만큼 순회하면서
        for (int i = 0; i < rows; i ++) {
            for (int j = 0; j < cols; j ++) {
                // 4-1. idx에 따라 기존 행렬의 원소를 저장
                output[output_rows][output_cols] = mat[i][j];
                // 4-2. 열이 끝날 때마다, 다음 행으로 넘어가야하므로, 열을 1씩 증가 
                output_cols++;

                // 5. 열 idx == 기존 배열의 열
                if (output_cols == c) {
                    output_cols = 0;
                    output_rows++;
                }
            }
        }

        return output;
    }
}