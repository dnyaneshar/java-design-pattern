package soliddesignpattern.SingleResponsibility.notification;

public class EmailNotificationImpl implements NotificationService {

	@Override
	public void sendOTP() {
		System.out.println("sending email notification");

	}

}
