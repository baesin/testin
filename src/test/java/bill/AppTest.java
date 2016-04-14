package bill;
import static org.junit.Assert.*;
import org.junit.Test;

public class AppTest {
	private Makebill bill;
	private double error = 0.01;
	@Test
	public void nullbill() {
		bill = new Makebill("sdf",0,0);
		assertTrue(bill.totalBill()==0);
	}
	@Test
	public void goldBillNoaddNooveruse1() {
		bill = new Makebill("Gold",1,0x2);
		assertEquals(bill.totalBill(),49.95,error);
	}
	@Test
	public void goldBillNoaddNooveruse2() {
		bill = new Makebill("gold",1,0x2);
		assertEquals(bill.totalBill(),49.95,error);
	}
	@Test
	public void goldBillNoaddoveruse1() {
		bill = new Makebill("Gold",1,3800);
		assertEquals(bill.totalBill(),1309.95,error);
	}
	@Test
	public void goldBillNoaddoveruse2() {
		bill = new Makebill("gold",1,3800);
		assertEquals(bill.totalBill(),1309.95,error);
	}
	@Test
	public void goldBilladdNooveruse1() {
		bill = new Makebill("Gold",3,2);
		assertEquals(bill.totalBill(),78.95,error);
	}
	@Test
	public void goldBilladdNooveruse2() {
		bill = new Makebill("gold",3,2);
		assertEquals(bill.totalBill(),78.95,error);
	}
	@Test
	public void goldBilladdoveruse1() {
		bill = new Makebill("Gold",3,3800);
		assertEquals(bill.totalBill(),1338.95,error);
	}
	@Test
	public void goldBilladdoveruse2() {
		bill = new Makebill("gold",3,3800);
		assertEquals(bill.totalBill(),1338.95,error);
	}
	@Test
	public void goldBillFaddNooveruse1() {
		bill = new Makebill("Gold",4,456);
		assertEquals(bill.totalBill(),83.95,error);
	}
	@Test
	public void goldBillFaddNooveruse2() {
		bill = new Makebill("gold",4,456);
		assertEquals(bill.totalBill(),83.95,error);
	}
	@Test
	public void goldBillFaddoveruse1() {
		bill = new Makebill("Gold",4,2000);
		assertEquals(bill.totalBill(),533.95,error);
	}
	@Test
	public void goldBillFaddoveruse2() {
		bill = new Makebill("gold",4,2000);
		assertEquals(bill.totalBill(),533.95,error);
	}
	@Test
	public void silverBillNoaddNooveruse1() {
		bill = new Makebill("Silver",1,300);
		assertEquals(bill.totalBill(),29.95,error);
	}
	@Test
	public void silverBillNoaddNooveruse2() {
		bill = new Makebill("silver",1,400);
		assertEquals(bill.totalBill(),29.95,error);
	}
	@Test
	public void silverBillNoaddoveruse1() {
		bill = new Makebill("Silver",1,800);
		assertEquals(bill.totalBill(),191.95,error);
	}
	@Test
	public void silverBillNoaddoveruse2() {
		bill = new Makebill("silver",1,900);
		assertEquals(bill.totalBill(),245.95,error);
	}
	@Test
	public void silverBilladdNooveruse1() {
		bill = new Makebill("Silver",3,450);
		assertEquals(bill.totalBill(),72.95,error);
	}
	@Test
	public void silverBilladdNooveruse2() {
		bill = new Makebill("silver",3,300);
		assertEquals(bill.totalBill(),72.95,error);
	}
	@Test
	public void silverBilladdoveruse1() {
		bill = new Makebill("Silver",3,800);
		assertEquals(bill.totalBill(),234.95,error);
	}
	@Test
	public void silverBilladdoveruse2() {
		bill = new Makebill("silver",3,1000);
		assertEquals(bill.totalBill(),342.95,error);
	}
	@Test
	public void silverBillFaddNooveruse1() {
		bill = new Makebill("Silver",4,256);
		assertEquals(bill.totalBill(),77.95,error);
	}
	@Test
	public void silverBillFaddNooveruse2() {
		bill = new Makebill("silver",8,100);
		assertEquals(bill.totalBill(),97.95,error);
	}
	@Test
	public void silverBillFaddoveruse1() {
		bill = new Makebill("Silver",4,2000);
		assertEquals(bill.totalBill(),887.95,error);
	}
	@Test
	public void silverBillFaddoveruse2() {
		bill = new Makebill("silver",10,2500);
		assertEquals(bill.totalBill(),1187.95,error);
	}
}
