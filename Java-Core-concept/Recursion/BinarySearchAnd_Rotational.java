package JAVA;
public class BinarySearchAnd_Rotational {


        public static void main(String[] args) {
            int[] arr = new int[]{5,6,1,2,3,4};

            for(int i = 1; i < 11; ++i) {
                System.out.println(KnualSearch(arr,i,0,arr.length-1));
            }

        }

    private static int KnualSearch(int[] arr, int tar, int s, int e)
    {
        if(s > e)
        {
            return -1;
        }
        int m = s + (e-s)/2;
        if(arr[m]== tar)
        {
            return m;
        }
        if(arr[s] <= arr[m])                                     // (Sorted case) s to m value must be sorted first half check
        {
            if(tar <= arr[m] && tar >= arr[s])
            {
                return KnualSearch(arr, tar, s, m-1);

            }
            else
            {
                return KnualSearch(arr, tar, m+1, e);
            }
        }
        if(arr[s] >= arr[m])                                  // (Spical case) s if great then m  arr = (5,6,1,2,3)
        {
            if(tar <= arr[e])                                 //  tar = 2  and e = 3 if tar <= 3 means value must been within m to e
            {
                return KnualSearch(arr, tar, m+1, e);
            }
            else                                             // tar = 6
            {
                return KnualSearch(arr,tar,s,m-1);
            }
        }


       return KnualSearch(arr, tar, s, m-1);               // (Defualt case) tar = 2 arr =(1,2,5,6,7) soted but value not in the second off
    }

    static void search(int[] arr, int i) {
            assign(arr, i, 0, arr.length - 1);
        }

        private static int assign(int[] arr, int tar, int s, int e) {
            int m = s + (e - s) / 2;
            if (s < e && m - 1 != -1) {
                int ans = 0;
                if (arr[s + 1] == arr[s] + 1 && arr[m - 1] == arr[m] - 1 && tar >= arr[s] && tar <= arr[m] && arr[s] <= arr[m]) {
                    ans = binarySearch(arr, tar, s, m);
                    if (ans == tar) {
                        return ans;
                    } else {
                        ans = assign(arr, tar, m + 1, e);
                        return ans;
                    }
                } else if (arr[s + 1] == arr[s] - 1 && arr[m - 1] == arr[m] + 1 && tar <= arr[s] && tar >= arr[m] && arr[s] >= arr[m]) {
                    ans = binarySearch_revers(arr, tar, s, m);
                    if (ans == tar) {
                        return ans;
                    } else {
                        ans = assign(arr, tar, m + 1, e);
                        return ans;
                    }
                } else if (arr[e - 1] == arr[e] - 1 && arr[m + 1] == arr[m] + 1 && tar >= arr[m] && tar <= arr[e] && arr[m] <= arr[e]) {
                    ans = binarySearch(arr, tar, m, e);
                    if (ans == tar) {
                        return ans;
                    } else {
                        ans = assign(arr, tar, s, m - 1);
                        return ans;
                    }
                } else if (arr[e - 1] == arr[e] + 1 && arr[m + 1] == arr[m] - 1 && tar <= arr[m] && tar >= arr[e] && arr[m] >= arr[e]) {
                    ans = binarySearch_revers(arr, tar, m, e);
                    if (ans == tar) {
                        return ans;
                    } else {
                        ans = assign(arr, tar, s, m - 1);
                        return ans;
                    }
                } else if (ans == tar) {
                    return ans;
                } else {
                    ans = assign(arr, tar, s + 1, e);
                    if (ans == tar) {
                        return ans;
                    } else {
                        ans = assign(arr, tar, s, e - 1);
                        return ans == tar ? ans : 0;
                    }
                }
            } else {
                return 0;
            }
        }

        private static int binarySearch_revers(int[] arr, int tar, int s, int e) {
            if (s > e) {
                return 0;
            } else {
                int m = s + (e - s) / 2;
                if (tar == arr[m]) {
                    System.out.println("" + tar + " in the index number " + m);
                    return arr[m];
                } else if (tar > arr[m]) {
                    --m;
                    return binarySearch_revers(arr, tar, s, m);
                } else {
                    ++m;
                    return binarySearch_revers(arr, tar, m, e);
                }
            }
        }

        private static int binarySearch(int[] arr, int tar, int s, int e) {
            if (s > e) {
                return 0;
            } else {
                int m = s + (e - s) / 2;
                if (tar == arr[m]) {
                    System.out.println("" + tar + " in the index number " + m);
                    return arr[m];
                } else if (tar > arr[m]) {
                    ++m;
                    return binarySearch(arr, tar, m, e);
                } else {
                    --m;
                    return binarySearch(arr, tar, s, m);
                }
            }
        }
    }


