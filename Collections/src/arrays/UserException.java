package arrays;

public class UserException {
	public static void main(String[] args) {
		int phoneNo=10;
		if (phoneNo<10) {
			System.out.println("make a call");
			
		}else {
			try {
				throw new EnterTenDigitNumberException();
			}catch(EnterTenDigitNumberException e){
				e.printStackTrace();
			}
		}
	}

}
