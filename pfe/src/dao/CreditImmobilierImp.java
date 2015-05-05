package dao;

import java.util.List;

import model.CreditImmobilier;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import util.HibernateUtil;

public class CreditImmobilierImp implements IdaoCreditImmobilier {

	@Override
	public List<CreditImmobilier> getallCreditImmobilier() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx  = session.beginTransaction();
		Query query  = session.createQuery("from CreditImmobilier");		
		List<CreditImmobilier> l = query.list();
		tx.commit();
		session.close();		
		return l;
	}

	@Override
	public CreditImmobilier getCreditImmobilierbyid(int id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx  = session.beginTransaction();
		Query query  = session.createQuery("from CreditImmobilier where id=?");
		query.setParameter(0,id);
		List<CreditImmobilier> l =  query.list();
		tx.commit();
		session.close();	
		return l.get(0);
	}

	@Override
	public void addCreditImmobilier(CreditImmobilier c) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx  = session.beginTransaction();
		session.save(c);
		tx.commit();
		session.close();	

	}
	
	public void deleteCreditImmobilier(int id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx  = session.beginTransaction();
		CreditImmobilier cl = (CreditImmobilier) session.get(CreditImmobilier.class, id);
		if (null != cl) {
			session.delete(cl);
			
		}
		tx.commit();
		session.close();	
			}
	
	public void updateCreditImmobilier(CreditImmobilier c) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx  = session.beginTransaction();
	    session.update(c);
		tx.commit();
		session.close();	
			}



}
