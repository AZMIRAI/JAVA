package MyArrayList3;

public class MyArrayList3<T> {
	
	private Object [] 			arr;
	private int capacity	=	10;
	private int size		=	0;
	
	public MyArrayList3() {
		arr		=	new T[capacity];
	}
	
	private void increasdCapacity() {
		//수용 할 수 없으면  arr 배열의 크기를 늘려야 한다.
		capacity = capacity + capacity/2;
		T[] tmp = new T[capacity] ; 
		// 원래 값들을 tmp로 복사
		for (int i=0;i<size; i++) {
			tmp[i]= arr[i];
		}
		// arr이 용량이 늘어난 배열을 가르키도록 한다.
		arr = tmp;
	}
	
	
	public void add (T value) {
		// 현재 용량으로 추가되는 값을 수용 할 수 있으면
		if (size >= capacity) {
			increasdCapacity();
		}	
		arr[size++] = value;	
	}
	
	public void add(int idx, Integer value) {
		// 용량이 이미 꽉차있으면 용량을 50퍼 늘리고
		// 아래코드를 실행한다
		if (size == capacity) {
			//용량을 늘리자.
			increasdCapacity();
		}
		
		
		// 맨뒤에있는 원소부터 오른쪽으로 한 칸씩 민다.
		for (int i = size-1; i>=idx;i-- ) {
			arr[i+1] = arr[i];
		
		// idx 자리에 value를 넣는다
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
//	과제
	public void remove(int idx) {
		int idxArray=idx-1;
		// 배열에 -1 
		for(int i=idxArray+1; i<arr.length; i++)  
		// 삭제 한 부분의 다음부터 마지막까지 불러옴
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
//		list.add(3,100); // 3자리에 100을 추가하지만 뒤에거는 밀려남
//		System.out.println(list);
////		list.remove(3); //3자리를 삭제해도 구멍이 나지않음 한자리 앞으로 밀림
//		list.remove(Integer.valueOf(100)); //똑같음 위에거랑
//		System.out.println(list);
	
	
	
	MyArrayList3<Stinrg> List3 = new MyArrayList3<>();
	List3.add("홍길동");
	List3.add("아쉽네");
	
	List3.add(1,"성춘향");
	
	
	System.out.println(List3);
	
	MyArrayList3<Student> List4 = new MyArrayList3<T>();
	List4.add(new Student("홍길동"),123);
	List4.add(new Student("일지매",124));
	List4.add(new Student("이몽룡",124));
	
	}
}
