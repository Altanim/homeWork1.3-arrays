import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) {
        StringJoiner join = new StringJoiner(",", "", "\r\n");

// Задача №1 и 2
        System.out.println("Задача №1 и 2");
        int [] nums = new int[3];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == nums.length) {
                System.out.print(nums[i] + "\n");
            } else { System.out.print(nums[i] + ", ");}
        }

        float [] f = { -1.57f, 7.654f, 9.986f};
        for (int i = 0; i < f.length; i++) {
            if (f[i] == f[2]) {
                System.out.print(f[i] + "\n");
            } else { System.out.print(f[i] + ", ");}
        }

        byte [] b = {1, 3, 12, 4};
        for (int i = 0; i < b.length; i++) {
                if (b[i] == b[3]) {
                    System.out.print(b[i]);
                } else { System.out.print(b[i] + ", ");}
        }

// Задача №3
        System.out.println("\n\nЗадача №3");
        for (int i = 2; i >= 0; i--) {
                if (nums[i] == nums[0]) {
                    System.out.print(nums[i] + "\n");
                } else { System.out.print(nums[i] + ", ");}
        }

        for (int i = f.length - 1; i >= 0; i--) {
            if (f[i] == f[0]) {
                System.out.print(f[i] + "\n");
            } else { System.out.print(f[i] + ", ");}
        }
        for (int i = b.length - 1; i >= 0; i--) {
            if (b[i] == b[0]) {
                System.out.print(b[i]);
            } else { System.out.print(b[i] + ", ");}
        }
        // Задача №4
        System.out.println("\nЗадача №4");
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]%2 !=0) {
                nums[i] += 1;

            }
            System.out.println(nums[i]);

        }
    }
}