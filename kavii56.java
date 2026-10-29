1.import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[2][3];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(a[j][i] + " ");
            }
            System.out.println();
            
        }
    }
}
2.import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[3][3];
        int sum = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            sum = sum + a[i][i];
        }

        System.out.println("Diagonal sum: " + sum);
    }
}

3.  for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j && a[i][j] != 1) {
                    identity = false;
                } else if (i != j && a[i][j] != 0) {
                    identity = false;
                }
            }
        }

        if (identity) {
            System.out.println("Identity matrix");
        } else {
            System.out.println("Not an Identity matrix");
        }
    }
}
4.public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        int largest = a[0][0];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (a[i][j] > largest) {
                    largest = a[i][j];
                }
            }
        }

        System.out.println("Largest = " + largest);
    }
}
5.import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();

        System.out.println(name);
        int len = name.length();

        System.out.println(len);
    }
}
6.import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        String rev = "";

        for (int i = name.length() - 1; i >= 0; i--) {
            rev = rev + name.charAt(i);
        }

        if (rev.equalsIgnoreCase(name)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}
7.class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine().toLowerCase();
        int vowels = 0, consonants = 0;

        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i'
                        || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels = " + vowels);
        System.out.println("Consonants = " + consonants);
    }
}