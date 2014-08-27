package beginning.tdd.sample.tfd;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * <pre>
 * 500, 100, 50원 동전만 사용하고 동전은 최소 개수로 반환한다. (음료수는 한번에 하나만 구매 가능하다.)
 * 
 * 1. 자판기에 돈을 투입한다.
 * 2. 투입한 금액이 표시된다.
 * 3. 음료수를 선택한다. (음료수별 가격표가 붙어있다.)
 * 3.1. 투입한 금액이 음료수 값과 같거나 커야 구매 가능하며 잔액이 반환된다.
 * 3.2. 투입한 금액이 음료수 값보다 작은경우 구매 불가능하며 투입금액이 반환된다.
 * </pre>
 */
public class VendingMachineTest {
	VendingMachine sut = new VendingMachine();

	@Test
	public void testInputMoney() {
		sut.inputMoney(2000);
		assertEquals(2000, sut.showMoney());
	}

	@Test
	public void testChoiceProduct() {
		sut.inputMoney(2000);
		sut.choiceProduct(650);
		assertEquals(1350, sut.showMoney());
	}

	@Test
	public void test잔액중1000원짜리가있으면먼저반환() {
		sut.inputMoney(3000);
		sut.choiceProduct(650);
		assertEquals(2, sut.returnPaper());
		assertEquals(350, sut.showMoney());
	}

	@Test
	public void test잔액이500원보다큰경우반환() {
		sut.inputMoney(1000);
		sut.choiceProduct(350);

		assertEquals(0, sut.returnPaper());
		assertEquals(1, sut.return500());
		assertEquals(1, sut.return100());
		assertEquals(1, sut.return50());
	}

	@Test
	public void test잔액이100원보다큰경우반환() {
		sut.inputMoney(1000);
		sut.choiceProduct(750);

		assertEquals(0, sut.return500());
		assertEquals(2, sut.return100());
	}

	@Test
	public void test잔액이50원보다큰경우반환() {
		sut.inputMoney(1000);
		sut.choiceProduct(950);
		assertEquals(0, sut.return100());
		assertEquals(1, sut.return50());
	}

	@Test
	public void test잔액에따른반환() {
		sut.inputMoney(2000);
		sut.choiceProduct(350);
		sut.calculate();

		assertEquals("지폐의 갯수 : ", 1, sut.returnPaper());
		assertEquals("500원 동전 갯수 : ", 1, sut.return500());
		assertEquals("100원 동전 갯수 : ", 1, sut.return100());
		assertEquals("50원 동전 갯수 : ", 1, sut.return50());
	}

	@Test
	public void testPrintMoney() {
		sut.inputMoney(2000);
		sut.choiceProduct(1300);
		sut.calculate();
		sut.returnMoney();
	}
}
