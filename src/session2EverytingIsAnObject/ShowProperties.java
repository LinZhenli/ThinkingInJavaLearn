package session2EverytingIsAnObject;
/**
 * 
 * @author 75489
 *{@link session1IntroductionToObjects.Light}
 */
public class ShowProperties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.getProperties().list(System.out);
		System.out.println(System.getProperty("user.name"));
		System.out.println(System.getProperty("java.library.path"));
	}

}
