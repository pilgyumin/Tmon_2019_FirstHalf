package back_end;

import java.util.Random;

public class Cook {
	
	// 각 요리사 당 1분에 몇 개의 요리를 만들 수 있는지에 대한 정보를 담은 배열
	private int[] cook;
	// 요리사의 평균 요리 능력에 대한 변수
	private int cooktime;
	
	public Cook(int cooknum) {
		this.cook = new int[cooknum];
		// 요리사의 요리능력을 랜덤으로 설정
		Random random = new Random();
		int cookingtimesum = 0;
		for (int i = 0; i < cooknum; i++) {
			cook[i] = random.nextInt(3);
			cookingtimesum += cook[i];
		}
		cooktime = cookingtimesum / cooknum;
	}

	public int[] getCook() {
		return cook;
	}

	public void setCook(int[] cook) {
		this.cook = cook;
	}

	public int getCooktime() {
		return cooktime;
	}

	public void setCooktime(int cooktime) {
		this.cooktime = cooktime;
	}
	
}
