package metier;

import java.util.List;

import model.Notification;
import dao.IdaoNotification;

public class NotificationMetier {

	IdaoNotification daoNotification;

	public List<Notification> getallNotifications() {
		return daoNotification.getallNotification();

	}

	public Notification getNotificationbyid(int id) {

		return daoNotification.getNotificationbyid(id);

	}

	public void addNotification(Notification b) {

		daoNotification.addNotification(b);

	}

	public void setdaoNotification(IdaoNotification daoNotification) {
		this.daoNotification = daoNotification;
	}

	public void deleteNotification(int i) {
		daoNotification.deleteNotification(i);
		;
	}

	public void updateNotification(Notification c) {
		daoNotification.updateNotification(c);
	}

}
