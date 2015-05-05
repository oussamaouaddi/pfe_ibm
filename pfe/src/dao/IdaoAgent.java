package dao;

import java.util.List;

import model.Agent;



public interface IdaoAgent {
	
	public List<Agent> getallAgent();
	public Agent getAgentbyid(int id);
	public void addAgent(Agent c);
	public void updateAgent(Agent c );
	public void deleteAgent(int i);

}
