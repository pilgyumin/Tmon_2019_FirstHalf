package back_end;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		bw.write("----------------------식당 시뮬레이션 프로그램-------------------------\n");
		bw.write("측정 시간, 요리사 수, 청소 스텝 수, 테이블 갯수 순으로 입력해주세요 : ");
		bw.flush();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		// 시간은 분 기준
		int time = Integer.parseInt(st.nextToken()) * 60;
		int cooknum = Integer.parseInt(st.nextToken());
		int staffnum = Integer.parseInt(st.nextToken());
		int tablenum = Integer.parseInt(st.nextToken());
		
		Cook cook = new Cook(cooknum);
		Staff staff = new Staff(staffnum);
		Store store = new Store(tablenum,cook,staff);
		
		//손님의 식사하는 시간을 랜덤으로 설정
		Random random = new Random();
		
		//대기하고 있는 손님을 관리하기 위한 큐
		Queue<Customer> qu = store.getQu();
		int ordersuccess = 0;
		for(int t = 0; t < time; t++) {
			// 10분 마다 손님 7명 입장
			if(t % 10 == 0) {
				for(int i = 0; i < 7; i++) {
					qu.add(new Customer(t,random.nextInt(15)));
				}
			}
			int customernum = qu.size();
			for(int i = 0; i < customernum; i++) {
				Customer customer = qu.poll();
				
				// 손님 대기 시간이 1시간 지나면 손님은 주문을 못한다.
				if(customer.getStorearrivetime() + 60 < t) {
					continue;
				}
				
				boolean eatable = store.ableReceiveCustomer(customer,t);
				
				if(!eatable) {
					qu.add(customer);
				}
				else {
					ordersuccess++;
				}
			}
		}
		bw.write("output : " + ordersuccess+"\n");
		bw.flush();
	}
}
