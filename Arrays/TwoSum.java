public class TwoSum{
    public static void main(String[] args) {
        int[] arr = {2, 6, 5, 8, 11};
        int target = 14;

        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    found = true;
                }
            }
        }
        System.out.println(found);  //if alsse lavaayach nasel tar direct as print karayach
    }
}

//         if (found)
//             System.out.println("YES");
//         else
//             System.out.println("NO");
//     }
// }