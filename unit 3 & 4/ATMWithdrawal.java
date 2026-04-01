import java.util.Scanner;

class ATMWithdrawal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your account balance: ");
        int balance = sc.nextInt();

        System.out.print("Enter withdrawal amount: ");
        int withdraw = sc.nextInt();

        try {
            if (withdraw > balance) {
                throw new IllegalArgumentException("Insufficient Balance");
            } else if (withdraw <= 0) {
                throw new IllegalArgumentException("Withdrawal amount must be positive");
            }

            balance -= withdraw;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
