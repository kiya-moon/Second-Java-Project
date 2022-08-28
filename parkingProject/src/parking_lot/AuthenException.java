package parking_lot;

public class AuthenException extends Exception{
	// 데이터 직렬화
	// serialVersionUID값을 저장할 때 클래스 버전이 맞는지 확인하기 위한 용도.
	private static final long serialVersionUID = 1L;

	public AuthenException(String message){
		super(message);
	}
	

}
