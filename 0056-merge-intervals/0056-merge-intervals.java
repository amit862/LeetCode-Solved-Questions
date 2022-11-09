class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b)->Integer.compare(a[0], b[0]));
        List<int[]> result = new ArrayList();
        int start = intervals[0][0], end = intervals[0][0];
        for(int[] i : intervals) {
            if(i[0] > end) { //no overlap
                result.add(new int[]{start, end});
                start = i[0];
                end = i[1];
            } else { //overlap
                end = Math.max(end, i[1]);
            }
        }
        result.add(new int[]{start, end});
        return result.toArray(new int[result.size()][2]);
    }
}