package week3.day1.assignment;

public class Students {

	public void getStudentInfo(int id)
	{
		System.out.println("id "+id);
	}
	public void getStudentInfo(int id, String name)
	{
		System.out.println("id "+id);
		System.out.println("name "+name);
	}
	public void getStudentInfo(String email, long number)
	{
		System.out.println("email "+email);
		System.out.println("number "+number);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students s =new Students();
		s.getStudentInfo(1);
		s.getStudentInfo(1, "sangi");
		s.getStudentInfo("st@gmail.com", 9768889999L);

	}

}
