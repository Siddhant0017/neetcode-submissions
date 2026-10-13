class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;

        int[] arr = new int[n1 + n2];

        // Copy nums1
        for (int i = 0; i < n1; i++) {
            arr[i] = nums1[i];
        }

        // Copy nums2
        for (int i = 0; i < n2; i++) {
            arr[n1 + i] = nums2[i];
        }

        // Sort the combined array
        Arrays.sort(arr);

        int n = arr.length;

        // Odd number of elements
        if (n % 2 != 0) {
            return arr[n / 2];
        }

        // Even number of elements
        int mid1 = arr[n / 2 - 1];
        int mid2 = arr[n / 2];

        return ((double) mid1 + mid2) / 2.0;
        
    }
}