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
		
		bw.write("----------------------�Ĵ� �ùķ��̼� ���α׷�-------------------------\n");
		bw.write("���� �ð�, �丮�� ��, û�� ���� ��, ���̺� ���� ������ �Է����ּ��� : ");
		bw.flush();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		// �ð��� �� ����
		int time = Integer.parseInt(st.nextToken()) * 60;
		int cooknum = Integer.parseInt(st.nextToken());
		int staffnum = Integer.parseInt(st.nextToken());
		int tablenum = Integer.parseInt(st.nextToken());
		
		Cook cook = new Cook(cooknum);
		Staff staff = new Staff(staffnum);
		Store store = new Store(tablenum,cook,staff);
		
		//�մ��� �Ļ��ϴ� �ð��� �������� ����
		Random random = new Random();
		
		//����ϰ� �ִ� �մ��� �����ϱ� ���� ť
		Queue<Customer> qu = store.getQu();
		int ordersuccess = 0;
		for(int t = 0; t < time; t++) {
			// 10�� ���� �մ� 7�� ����
			if(t % 10 == 0) {
				for(int i = 0; i < 7; i++) {
					qu.add(new Customer(t,random.nextInt(15)));
				}
			}
			int customernum = qu.size();
			for(int i = 0; i < customernum; i++) {
				Customer customer = qu.poll();
				
				// �մ� ��� �ð��� 1�ð� ������ �մ��� �ֹ��� ���Ѵ�.
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
