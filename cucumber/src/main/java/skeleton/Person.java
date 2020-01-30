package skeleton;

public class Person {
private String Message;
private int distance;
	public void setDistance(Integer int1) {
		// TODO Auto-generated method stub
		distance=int1;
		
	}

	public void setMessage(String string) {
		// TODO Auto-generated method stub
		if(distance>0&&distance<30)
		Message=string;
		else
			Message=null;
		
	}

	public String getMessage() {
		// TODO Auto-generated method stub
		return Message;
	}

}
