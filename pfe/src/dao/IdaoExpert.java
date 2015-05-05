package dao;

import java.util.List;

import model.Expert;



public interface IdaoExpert {
	
	public List<Expert> getallExpert();
	public Expert getExpertbyid(int id);
	public void addExpert(Expert c);
	public void updateExpert(Expert c );
	public void deleteExpert(int i);

}
