package dao;

import java.util.List;

import model.Existence;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import util.HibernateUtil;

public class ExistenceImp implements IdaoExistence {

	@Override
	public List<Existence> getallExistence() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx  = session.beginTransaction();
		Query query  = session.createQuery("from Existence");		
		List<Existence> l = query.list();
		tx.commit();
		session.close();		
		return l;
	}

	@Override
	public Existence getExistencebyid(int id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx  = session.beginTransaction();
		Query query  = session.createQuery("from Existence where id=?");
		query.setParameter(0,id);
		List<Existence> l =  query.list();
		tx.commit();
		session.close();	
		return l.get(0);
	}

	@Override
	public void addExistence(Existence c) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx  = session.beginTransaction();
		session.save(c);
		tx.commit();
		session.close();	

	}
	
	public void deleteExistence(int id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx  = session.beginTransaction();
		Existence cl = (Existence) session.get(Existence.class, id);
		if (null != cl) {
			session.delete(cl);
			
		}
		tx.commit();
		session.close();	
			}
	
	public void updateExistence(Existence c) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx  = session.beginTransaction();
	    session.update(c);
		tx.commit();
		session.close();	
			}



}
