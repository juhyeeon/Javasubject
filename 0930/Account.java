package java2;

class Account {
    private int balance;

    // 생성자
    public Account(int initialBalance) {
        this.balance = initialBalance;
    }

    // 입금 메서드
    public void deposit(int amount) {
        balance += amount;
    }

    // 여러 금액을 입금하는 메서드
    public void deposit(int[] amounts) {
        for (int amount : amounts) {
            balance += amount;
        }
    }

    // 출금 메서드
    public int withdraw(int amount) {
        if (balance < amount) {
            int all = balance;
            balance = 0;
            return all;
        } else {
            balance -= amount;
            return amount;
        }
    }

    // 잔액 조회 메서드
    public int getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        Account a = new Account(100); // 100원을 예금하면서 계좌 생성
        a.deposit(5000); // 5000원 예금
        System.out.println("잔액은 " + a.getBalance() + "원입니다.");

        int bulk[] = {100, 500, 200, 700};
        a.deposit(bulk); // bulk[] 배열에 있는 모든 돈 예금
        System.out.println("잔액은 " + a.getBalance() + "원입니다.");

        int money = 1000; // 인출하고자 하는 금액
        int wMoney = a.withdraw(money); // 1000원 인출 시도. wMoney는 실제 인출한 금액
        if (wMoney < money) {
            System.out.println("잔액이 부족하여 " + wMoney + "원만 인출했습니다.");
        } else {
            System.out.println(wMoney + "원을 인출했습니다.");
        }
        System.out.println("잔액은 " + a.getBalance() + "원입니다.");
    }
}
