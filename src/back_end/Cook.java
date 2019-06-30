package back_end;

import java.util.Random;

public class Cook {
	
	// �� �丮�� �� 1�п� �� ���� �丮�� ���� �� �ִ����� ���� ������ ���� �迭
	private int[] cook;
	// �丮���� ��� �丮 �ɷ¿� ���� ����
	private int cooktime;
	
	public Cook(int cooknum) {
		this.cook = new int[cooknum];
		// �丮���� �丮�ɷ��� �������� ����
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
