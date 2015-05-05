package dao;

import java.util.List;

import model.TypeResidence;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import util.HibernateUtil;

public class TypeResidenceImp implements IdaoTypeResidence {

	@Override
	public List<TypeResidence> getallTypeResidence() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx  = session.beginTransaction();
		Query query  = session.createQuery("from TypeResidence");		
		List<TypeResidence> l = query.list();
		tx.commit();
		session.close();		
		return l;
	}

	@Override
	public TypeResidence getTypeResidencebyid(int id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx  = session.beginTransaction();
		Query query  = session.createQuery("from TypeResidence where id=?");
		query.setParameter(0,id);
		List<TypeResidence> l =  query.list();
		tx.commit();
		session.close();	
		return l.get(0);
	}

	@Override
	public void addTypeResidence(TypeResidence c) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx  = session.beginTransaction();
		session.save(c);
		tx.commit();
		session.close();	

	}
	
	public void deleteTypeResidence(int id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx  = session.beginTransaction();
		TypeResidence cl = (TypeResidence) session.get(TypeResidence.class, id);
		if (null != cl) {
			session.delete(cl);
			
		}
		tx.commit();
		session.close();	
			}
	
	public void updateTypeResidence(TypeResidence c) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx  = session.beginTransaction();
	    session.update(c);
		tx.commit();
		session.close();	
			}



}
