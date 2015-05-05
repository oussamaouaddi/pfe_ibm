package dao;

import java.util.List;

import model.TypeImmeuble;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import util.HibernateUtil;

public class TypeImmeubleImp implements IdaoTypeImmeuble {

	@Override
	public List<TypeImmeuble> getallTypeImmeuble() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx  = session.beginTransaction();
		Query query  = session.createQuery("from TypeImmeuble");		
		List<TypeImmeuble> l = query.list();
		tx.commit();
		session.close();		
		return l;
	}

	@Override
	public TypeImmeuble getTypeImmeublebyid(int id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx  = session.beginTransaction();
		Query query  = session.createQuery("from TypeImmeuble where id=?");
		query.setParameter(0,id);
		List<TypeImmeuble> l =  query.list();
		tx.commit();
		session.close();	
		return l.get(0);
	}

	@Override
	public void addTypeImmeuble(TypeImmeuble c) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx  = session.beginTransaction();
		session.save(c);
		tx.commit();
		session.close();	

	}
	
	public void deleteTypeImmeuble(int id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx  = session.beginTransaction();
		TypeImmeuble cl = (TypeImmeuble) session.get(TypeImmeuble.class, id);
		if (null != cl) {
			session.delete(cl);
			
		}
		tx.commit();
		session.close();	
			}
	
	public void updateTypeImmeuble(TypeImmeuble c) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx  = session.beginTransaction();
	    session.update(c);
		tx.commit();
		session.close();	
			}



}
