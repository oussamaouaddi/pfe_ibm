package dao;

import java.util.List;

import model.Ville;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import util.HibernateUtil;

public class VilleImp implements IdaoVille {

	@Override
	public List<Ville> getallVille() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx  = session.beginTransaction();
		Query query  = session.createQuery("from Ville");		
		List<Ville> l = query.list();
		tx.commit();
		session.close();		
		return l;
	}

	@Override
	public Ville getVillebyid(int id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx  = session.beginTransaction();
		Query query  = session.createQuery("from Ville where id=?");
		query.setParameter(0,id);
		List<Ville> l =  query.list();
		tx.commit();
		session.close();	
		return l.get(0);
	}

	@Override
	public void addVille(Ville c) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx  = session.beginTransaction();
		session.save(c);
		tx.commit();
		session.close();	

	}
	
	public void deleteVille(int id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx  = session.beginTransaction();
		Ville cl = (Ville) session.get(Ville.class, id);
		if (null != cl) {
			session.delete(cl);
			
		}
		tx.commit();
		session.close();	
			}
	
	public void updateVille(Ville c) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx  = session.beginTransaction();
	    session.update(c);
		tx.commit();
		session.close();	
			}



}
