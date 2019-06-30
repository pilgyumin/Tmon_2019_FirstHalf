package back_end;

import java.util.Queue;

public class Customer {
	
	private int storearrivetime;
	// 식사하는데 걸리는 시간
	private int eattingtime;
	// 식사를 시작한 시간
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
