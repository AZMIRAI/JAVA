package PriorityQueueTest;
import java.util.*;
public class PriorityQueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		test1();
		MyQueue queue = new MyQueue();
		queue.offer(new Task("�۾�1",1));
		queue.offer(new Task("�۾�2",2));
		queue.offer(new Task("�۾�3",3));
		queue.offer(new Task("�۾�4",4));
		queue.offer(new Task("�۾�5",5));
		// 4,2,1,5,3
		for (int i = 0; i<5;i++) {
			System.out.println(queue.poll());
		}
	}

	private static void test1 () {
		/*
		 * �켱 ����ť ��ü�� �����ϰ� 
		 * Task �ν��Ͻ��� ����, ���� �غ���
		 */
		// priority �켱����ť�� �⺻������ ������������ ����ȴ�
//		Queue<Task> queue = new PriorityQueue<>();
		Queue<Task> queue = new PriorityQueue<>(new TaskComparator());
		queue.offer(new Task("�۾�1",3));
		queue.offer(new Task("�۾�2",2));
		queue.offer(new Task("�۾�3",5));
		queue.offer(new Task("�۾�4",1));
		queue.offer(new Task("�۾�5",4));
		// �۾� 4,2,1,5,3
		while( queue.isEmpty() == false ) {
			Task task = queue.poll();
			
			System.out.println(task);
		}
	}
}

class Task implements Comparable<Task>{  //<<task
//	�� task �ν��Ͻ��� �񱳰����� ��ü�� �����ϱ�����
	
	String desc; 		// ����
	int priority = 5; 	// �� �۾��� �켱����
	
	@Override
	public String toString() {
		return "[desc:"+desc+", priority:"+priority+"]";
	}
	
	public Task(String desc, int priority) {
		this.desc = desc;
		this.priority = priority;
	}

	@Override
	public int compareTo(Task o) {
		// �� ��ü�� ���� ũ�� ���, ������ 0, ������ ������ ��ȯ.
		return this.priority - o.priority;
	}
}

//class MyQueue<T extends Comparable<T>>{
//	Object[]list = new Object[5];
//	int idx=0;
//	public boolean offer(T value) {
//		if (((T)list[0]).compareTo(value)==0){
//			
//		}else if (((T)list[0]).compareTo(value)>0){
//			
//		}else {
//		
//		}
//		return true;
//	}
//}

class MyQueue{
	Task[] tasks = new Task[10];
	int idx		= 0;
	int pidx	= 0;
	
	public void offer(Task value) {
		tasks[idx++] = value;
		// ���ο� ��ü�� ���ö����� �������ķ� sorting �Ѵ�.
		for (int i=idx-1 ; i>=0; i--) {
			int max = i; //���� ������ ���Ұ� �ִ밪�� ����.
			for (int j=0; j<i-1; j++) {
				if (tasks[j].compareTo(tasks[max])>0) {
					max = j;
				}
			}
			// max, i�� swap
			Task tmp = tasks[max];
			tasks[max] = tasks[i];
			tasks[i] = tmp;
		}
	}
	
	public Task poll() {
		return tasks[pidx];
	}
}


class TaskComparator implements Comparator<Task>{

	@Override
	public int compare(Task o1, Task o2) {
		// TODO Auto-generated method stub
		return o1.priority - o2.priority; // ��������
//		return o2.priority - o1.priority; // ��������
		
	}
	
}



