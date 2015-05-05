package dao;

import java.util.List;

import model.DirectionBq;



public interface IdaoDirectionBq {
	
	public List<DirectionBq> getallDirectionBq();
	public DirectionBq getDirectionBqbyid(int id);
	public void addDirectionBq(DirectionBq c);
	public void updateDirectionBq(DirectionBq c );
	public void deleteDirectionBq(int i);

}
