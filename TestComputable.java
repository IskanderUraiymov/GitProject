package warmup1;

public class TestComputable implements Computable{
	
	
	public static void main(String[] args) {
		



	
	Computable ab =  (num1,num2)->{return num1%num2==0;};
			
	}

	@Override
	public boolean compute(int num1, int num2) {
		return num1%num2==0;
	};
	
}