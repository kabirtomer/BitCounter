class AListNode{

	public int data;
	public AListNode next;

	AListNode(int i, AListNode next){
		data=i;
		this.next=next;
	}
}

class AList{

	private static int uses=0; // used to track number of Alist operations
	private AListNode head;

	public boolean isEmpty(){
		// checks for empty list
		uses++;
		if(head==null){
			return true;
		}
		return false;
	}

	public void insertFront(int i){
		//inserts integer as MSB
		uses++;
		AListNode newNode = new AListNode(i,head);
		head = newNode;
	}

	public int deleteFront() throws Exception{
		//removes MSB
		uses++;
		int temp=head.data;
		head=head.next;
		return temp;
	}

	public void insertRear(int i){
		//insert integer as LSB
		if(head==null){
			insertFront(i);
		}
		else{
			uses++;
			AListNode curr =head;
			AListNode newNode = new AListNode(i,null);
			while(curr.next!=null){
				curr=curr.next;
			}
			curr.next=newNode;
		}
	}
	public int deleteRear() throws Exception{
		//remove LSB
		uses++;
		AListNode curr =head;
		if(curr.next==null){
			head=null;
			return curr.data;
		}
		while(curr.next.next!=null){
			curr=curr.next;
		}
		int temp=curr.next.data;
		curr.next=null;
		return temp;
	}

	///////test functions, see BitCounterTest.java

	public void test_print(){
		AListNode tester = head;
		while(tester!=null){
			System.out.print(tester.data);
			tester=tester.next;
		}
	}

	public void test_uses(){
		System.out.println(" "+uses);
	}

	public void test_reset_uses(){
		uses=0;
	}

		

}


