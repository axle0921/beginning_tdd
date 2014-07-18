package beginning.tdd.exercise.tfd;

public class VendingMachine {
	private int account = 0;
	private int money1000 = 0;
	private int money500 = 0;
	private int money100 = 0;
	private int money50 = 0;

	public void inputMoney(int inputMoney) {
		this.account = inputMoney;
	}

	public int showMoney() {
		return this.account;
	}

	public void choiceProduct(int productPrice) {
		this.account -= productPrice;
	}

	public int returnPaper() {
		if (account >= 1000) {
			while (account >= 1000) {
				account -= 1000;
				money1000++;
			}
		}
		return money1000;
	}

	public int return500() {
		if (account >= 500) {
			while (account >= 500) {
				account -= 500;
				money500++;
			}
		}
		return money500;
	}

	public int return100() {
		if (account >= 100) {
			while (account >= 100) {
				account -= 100;
				money100++;
			}
		}
		return money100;
	}

	public int return50() {
		if (account >= 50) {
			while (account >= 50) {
				account -= 50;
				money50++;
			}
		}
		return money50;
	}

	public void calculate() {
		returnPaper();
		return500();
		return100();
		return50();
	}

	public void returnMoney() {
		System.out.println("1000원 짜리 갯수 : " + money1000);
		System.out.println("500원 짜리 갯수 : " + money500);
		System.out.println("100원 짜리 갯수 : " + money100);
		System.out.println("50원 짜리 갯수 : " + money50);
	}
}
