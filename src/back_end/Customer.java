package back_end;

import java.util.Queue;

public class Customer {
	
	private int storearrivetime;
	// �Ļ��ϴµ� �ɸ��� �ð�
	private int eattingtime;
	// �Ļ縦 ������ �ð�
	private int starteattingtime;
	
	public Customer(int storearrivetime, int eattingtime) {
		this.storearrivetime = storearrivetime;
		this.eattingtime = eattingtime;
	}

	public int getStorearrivetime() {
		return storearrivetime;
	}

	public void setStorearrivetime(int storearrivetime) {
		this.storearrivetime = storearrivetime;
	}

	public int getEattingtime() {
		return eattingtime;
	}

	public void setEattingtime(int eattingtime) {
		this.eattingtime = eattingtime;
	}

	public int getStarteattingtime() {
		return starteattingtime;
	}

	public void setStarteattingtime(int starteattingtime) {
		this.starteattingtime = starteattingtime;
	}
	
	
	
}
