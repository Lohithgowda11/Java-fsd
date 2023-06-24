package phase_1_project_assessment2;

class MyException extends Exception
{
	String msg;

   MyException(String msg) 
	{
		// TODO Auto-generated constructor stub
		this.msg=msg;
	}
  public String getMessage()
  {
	  return msg;
  }
	
}
public class ThrowAndThrows {
	static void submit() throws MyException
	{
		int age=14;
		if(age>21)
		{
			System.out.println("happy life");
		}
		else
		{
			throw new MyException("invalid age");
		}
	}
public static void main(String[] args) {
	try {
		submit();
	}
	catch(MyException e)
	{
		System.out.println(e.getMessage());
	}
finally {
		System.out.println("Hey...its a finally block");
	}

}
}
