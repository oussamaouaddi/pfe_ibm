package dao;

import java.util.List;

import model.Clients;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import util.HibernateUtil;

public class ClientsImp implements IdaoClients {

	@Override
	public List<Clients> getallClients() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx  = session.beginTransaction();
		Query query  = session.createQuery("from Clients");		
		List<Clients> l = query.list();
		tx.commit();
		session.close();		
		return l;
	}

	@Override
	public Clients getClientsbyid(int id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx  = session.beginTransaction();
		Query query  = session.createQuery("from Clients where id=?");
		query.setParameter(0,id);
		List<Clients> l =  query.list();
		tx.commit();
		session.close();	
		return l.get(0);
	}

	@Override
	public void addClients(Clients c) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx  = session.beginTransaction();
		session.save(c);
		tx.commit();
		session.close();	

	}
	
	public void deleteClients(int id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx  = session.beginTransaction();
		Clients cl = (Clients) session.get(Clients.class, id);
		if (null != cl) {
			session.delete(cl);
			
		}
		tx.commit();
		session.close();	
			}
	
	public void updateClients(Clients c) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx  = session.beginTransaction();
	    session.update(c);
		tx.commit();
		session.close();	
			}



}
