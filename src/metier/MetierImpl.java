package metier;

import dao.IDao;

public class MetierImpl implements IMetier{

	private IDao iDao;
	
	@Override
	public Double getCalcul() {		
		return this.iDao.getValue()*12;
	}

	public void setiDao(IDao iDao) {
		this.iDao = iDao;
	}
	

}
