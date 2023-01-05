package methodReference;

public class Execution {
	public static void main(String[] args) {
		
		School school = new School();
		
		Noteable noteEample = school :: noteLecture;
		noteEample.note("lecture");

		Noteable noteEample1 = school :: noteObservation;
		noteEample1.note("the following");
		
		Noteable noteEample2 = school :: noteOnlineClass;
		noteEample2.note("the online");
	}
}
