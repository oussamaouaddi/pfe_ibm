package dao;

import java.util.List;

import model.Notification;



public interface IdaoNotification {
	
	public List<Notification> getallNotification();
	public Notification getNotificationbyid(int id);
	public void addNotification(Notification c);
	public void updateNotification(Notification c );
	public void deleteNotification(int i);

}
