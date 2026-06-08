
    /*System.out.println(arr[0]);
    for (int i = 0; i <= 4; i++) {
        System.out.println(arr[i]);
        int val = arr[i];

        if (val >= 40) {
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }
    }
}

     */void main() {
        int[] arr = {87, 32, 44, 89, 32};
        System.out.println(arr[0]);
        System.out.print("\npass mark");
        for (int i = 0; i <= 4; i++) {
            int val = arr[i];

            if (val >= 40) {
                System.out.print(val + ",");

            }
        }

        System.out.print("\nfail mark");
        for (int i = 0; i <= 4; i++) {
            int val = arr[i];

            if (val < 40) {
                System.out.print(val + ",");
            }
        }
    }




