


public class BitCounterTest{

	static final int TEST_NUM =64;

	public static void main(String[] args) throws Exception {

		AList counter = new AList();
		int[] store = {0,0,0,0,0,0};

		for (int i : store ) {
			//build the counter
			counter.insertRear(i);
		}

		AList helper = new AList();
		for (int k=0; k<TEST_NUM;k++ ) {
			//prints out one entire cycle of the counter

			int bit;

			//As close to exam pseudocode as possible {
			while (! counter.isEmpty()) {
				bit=counter.deleteRear();
				if(bit==1){
					helper.insertFront(0);
				}
				if(bit==0){
					helper.insertFront(1);
					break;
				}
			}
			while (! helper.isEmpty()) {
				counter.insertRear(helper.deleteFront());
			}
			/// }


			counter.test_print();  // prints current counter state
			counter.test_uses();   // prints number of AList operations needed to increment
			counter.test_reset_uses();  //resets the number of AList operations
		}
		

	}
}