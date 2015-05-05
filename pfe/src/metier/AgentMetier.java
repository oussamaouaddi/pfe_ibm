package metier;

import java.util.List;

import model.Agent;
import dao.IdaoAgent;

public class AgentMetier {

	IdaoAgent daoAgent;

	public List<Agent> getallAgents() {
		return daoAgent.getallAgent();

	}

	public Agent getAgentbyid(int id) {

		return daoAgent.getAgentbyid(id);

	}

	public void addAgent(Agent b) {

		daoAgent.addAgent(b);

	}

	public void setdaoAgent(IdaoAgent daoAgent) {
		this.daoAgent = daoAgent;
	}

	public void deleteAgent(int i) {
		daoAgent.deleteAgent(i);
		;
	}

	public void updateAgent(Agent c) {
		daoAgent.updateAgent(c);
	}

}
