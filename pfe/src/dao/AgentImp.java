package dao;

import java.util.List;

import model.Agent;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import util.HibernateUtil;

public class AgentImp implements IdaoAgent {

	@Override
	public List<Agent> getallAgent() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx  = session.beginTransaction();
		Query query  = session.createQuery("from Agent");		
		List<Agent> l = query.list();
		tx.commit();
		session.close();		
		return l;
	}

	@Override
	public Agent getAgentbyid(int id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx  = session.beginTransaction();
		Query query  = session.createQuery("from Agent where id=?");
		query.setParameter(0,id);
		List<Agent> l =  query.list();
		tx.commit();
		session.close();	
		return l.get(0);
	}

	@Override
	public void addAgent(Agent c) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx  = session.beginTransaction();
		session.save(c);
		tx.commit();
		session.close();	

	}
	
	public void deleteAgent(int id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx  = session.beginTransaction();
		Agent cl = (Agent) session.get(Agent.class, id);
		if (null != cl) {
			session.delete(cl);
			
		}
		tx.commit();
		session.close();	
			}
	
	public void updateAgent(Agent c) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx  = session.beginTransaction();
	    session.update(c);
		tx.commit();
		session.close();	
			}



}
