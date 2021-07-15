package MyArrayList3;

public class MyArrayList3<T> {
	
	private Object [] 			arr;
	private int capacity	=	10;
	private int size		=	0;
	
	public MyArrayList3() {
		arr		=	new T[capacity];
	}
	
	private void increasdCapacity() {
		//���� �� �� ������  arr �迭�� ũ�⸦ �÷��� �Ѵ�.
		capacity = capacity + capacity/2;
		T[] tmp = new T[capacity] ; 
		// ���� ������ tmp�� ����
		for (int i=0;i<size; i++) {
			tmp[i]= arr[i];
		}
		// arr�� �뷮�� �þ �迭�� ����Ű���� �Ѵ�.
		arr = tmp;
	}
	
	
	public void add (T value) {
		// ���� �뷮���� �߰��Ǵ� ���� ���� �� �� ������
		if (size >= capacity) {
			increasdCapacity();
		}	
		arr[size++] = value;	
	}
	
	public void add(int idx, Integer value) {
		// �뷮�� �̹� ���������� �뷮�� 50�� �ø���
		// �Ʒ��ڵ带 �����Ѵ�
		if (size == capacity) {
			//�뷮�� �ø���.
			increasdCapacity();
		}
		
		
		// �ǵڿ��ִ� ���Һ��� ���������� �� ĭ�� �δ�.
		for (int i = size-1; i>=idx;i-- ) {
			arr[i+1] = arr[i];
		
		// idx �ڸ��� value�� �ִ´�
		arr[idx] = value;
		size++ ;
		}
	}
	
	
	public int size() {
		return size;
	}
	
	@Override
	public String toString() {
		if (size ==0) {
			return "[]";
			}
		
		String result = "[";
		for (int i=0; i<size-1; i++) {
			result += arr[i]+",";
			
			if((i+1)%10==0) result += "\n";
			
			
		}
		result += arr[size-1];
		result += "]";
		return result;
	}
	public void remove() {
		if (size > 0) {
		size--;
		}
	}
//	����
	public void remove(int idx) {
		int idxArray=idx-1;
		// �迭�� -1 
		for(int i=idxArray+1; i<arr.length; i++)  
		// ���� �� �κ��� �������� ���������� �ҷ���
		arr[i-1]=arr[i];
		// 
	}
	public T get(int idx) {
		return (T)arr[idx];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList<Integer> list = new ArrayList<>();
//		MyArrayList3 list = new MyArrayList3();
//		for (int i = 0; i < 11; i++) {
//			list.add(i);	
//		}
		
		
//		list.get(100);
		
//		for (int i = 0; i < list.size(); i++) {
//			System.out.print(list.get(i)+" ");
//		}

//		System.out.println(list);
//		System.out.println(list);
//		
//		list.add(3,100); // 3�ڸ��� 100�� �߰������� �ڿ��Ŵ� �з���
//		System.out.println(list);
////		list.remove(3); //3�ڸ��� �����ص� ������ �������� ���ڸ� ������ �и�
//		list.remove(Integer.valueOf(100)); //�Ȱ��� �����Ŷ�
//		System.out.println(list);
	
	
	
	MyArrayList3<Stinrg> List3 = new MyArrayList3<>();
	List3.add("ȫ�浿");
	List3.add("�ƽ���");
	
	List3.add(1,"������");
	
	
	System.out.println(List3);
	
	MyArrayList3<Student> List4 = new MyArrayList3<T>();
	List4.add(new Student("ȫ�浿"),123);
	List4.add(new Student("������",124));
	List4.add(new Student("�̸���",124));
	
	}
}
