class Solution {
    public int largestRectangleArea(int[] heights) {
      int n = heights.length;
      int[] sL = new int[n];
      int[] sR = new int[n];
      sL[0] = -1;
      sR[n-1] = n;
      
      for(int i = 1; i < n; ++i){
        int idx = i-1;
        while(idx >= 0 && heights[idx] >= heights[i])
          idx = sL[idx];
        sL[i] = idx;
      }
      
      for(int i = n-2; i >= 0; --i){
        int idx = i+1;
        while(idx < n && heights[idx] >= heights[i])
          idx = sR[idx];
        sR[i] = idx;
      }
      int result = 0;
      for(int i = 0; i < n; ++i)
        result = Math.max(result, heights[i]*(sR[i] - sL[i]- 1));
      return result;
    }
}