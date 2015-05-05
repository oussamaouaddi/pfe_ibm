package dao;

import java.util.List;

import model.DirectionBq;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import util.HibernateUtil;

public class DirectionBqImp implements IdaoDirectionBq {

	@Override
	public List<DirectionBq> getallDirectionBq() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx  = session.beginTransaction();
		Query query  = session.createQuery("from DirectionBq");		
		List<DirectionBq> l = query.list();
		tx.commit();
		session.close();		
		return l;
	}

	@Override
	public DirectionBq getDirectionBqbyid(int id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx  = session.beginTransaction();
		Query query  = session.createQuery("from DirectionBq where id=?");
		query.setParameter(0,id);
		List<DirectionBq> l =  query.list();
		tx.commit();
		session.close();	
		return l.get(0);
	}

	@Override
	public void addDirectionBq(DirectionBq c) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx  = session.beginTransaction();
		session.save(c);
		tx.commit();
		session.close();	

	}
	
	public void deleteDirectionBq(int id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx  = session.beginTransaction();
		DirectionBq cl = (DirectionBq) session.get(DirectionBq.class, id);
		if (null != cl) {
			session.delete(cl);
			
		}
		tx.commit();
		session.close();	
			}
	
	public void updateDirectionBq(DirectionBq c) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx  = session.beginTransaction();
	    session.update(c);
		tx.commit();
		session.close();	
			}



}
