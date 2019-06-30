package back_end;

import java.util.Random;

public class Staff {
	
	// �� ������ �� 1�п� �� ���� �丮�� ���� �� �ִ����� ���� ������ ���� �迭
	private int[] staff;
	// �������� ��� û�� �ɷ¿� ���� ����
	private int stafftime;

	public Staff(int staffnum) {
		this.staff = new int[staffnum];
		// �������� û�Ҵɷ��� �������� ����
		Random random = new Random();
		int cleantimesum = 0;
		for (int i = 0; i < staffnum; i++) {
			staff[i] = random.nextInt(5);
			cleantimesum += staff[i];
		}
		stafftime = cleantimesum / staffnum;
	}

	public int[] getStaff() {
		return staff;
	}

	public void setStaff(int[] staff) {
		this.staff = staff;
	}

	public int getStafftime() {
		return stafftime;
	}

	public void setStafftime(int stafftime) {
		this.stafftime = stafftime;
	}
	
	
}
