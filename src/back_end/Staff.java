package back_end;

import java.util.Random;

public class Staff {
	
	// 각 스태프 당 1분에 몇 개의 요리를 만들 수 있는지에 대한 정보를 담은 배열
	private int[] staff;
	// 스태프의 평균 청소 능력에 대한 변수
	private int stafftime;

	public Staff(int staffnum) {
		this.staff = new int[staffnum];
		// 스태프의 청소능력을 랜덤으로 설정
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
