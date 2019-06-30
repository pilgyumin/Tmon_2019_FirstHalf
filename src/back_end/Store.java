package back_end;

import java.util.LinkedList;
import java.util.Queue;

public class Store {
	private Customer[] table;
	private int alreadytable = 0;
	private Queue<Customer> qu;
	private Cook cook;
	private Staff staff;

	public Store(int tablenum, Cook cook, Staff staff) {
		this.table = new Customer[tablenum];
		this.cook = cook;
		this.staff = staff;
		this.qu = new LinkedList<>();
	}

	public int getAlreadytable() {
		return alreadytable;
	}

	public void setAlreadytable(int alreadytable) {
		this.alreadytable = alreadytable;
	}

	public Queue<Customer> getQu() {
		return qu;
	}

	public void setQu(Queue<Customer> qu) {
		this.qu = qu;
	}

	public Customer[] getTable() {
		return table;
	}

	public void setTable(Customer[] table) {
		this.table = table;
	}

	// 손님을 테이블에 배치가 가능한지 확인
	public boolean ableReceiveCustomer(Customer customer, int currenttime) {
		if (alreadytable < table.length) {
			customer.setStarteattingtime(currenttime);
			tablePlacement(customer);
			alreadytable++;
			return true;
		}
		return false;
	}

	// 손님을 빈 자리에 배치
	public void tablePlacement(Customer customer) {
		for (int i = 0; i < table.length; i++) {
			if (table[i].equals(null)) {
				table[i] = customer;
				break;
			}
			if (table[i].getStarteattingtime() + table[i].getEattingtime() + cook.getCooktime()
					+ staff.getStafftime() >= customer.getStarteattingtime()) {
				table[i] = customer;
				alreadytable--;
			}
		}
	}
}
