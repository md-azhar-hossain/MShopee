package com.cg.mobshop.service;

import java.util.HashMap;



import java.util.LinkedHashMap;
import java.util.TreeMap;

import com.cg.mobshop.dao.MobileDAO;
import com.cg.mobshop.dao.MobileDAOImpl;
import com.cg.mobshop.dto.Mobiles;
import com.cg.mobshop.exception.MobileException;


public class MobileServiceImpl implements MobileService{

	MobileDAO dao = new MobileDAOImpl();
		



	@Override
	public HashMap<Integer, Mobiles> showAllMobiles() throws MobileException {
		// TODO Auto-generated method stub
		return dao.showAllMobiles();	
		}

	@Override
	public boolean deleteRecord(int id) throws MobileException {
		// TODO Auto-generated method stub
		return dao.deleteRecord(id);
			}

	@Override
	public  LinkedHashMap<String,Mobiles> sorting(int n) {
		// TODO Auto-generated method stub
		
		switch(n){
		case 1:  return dao.sortusingName();
		case 2: return  dao.sortusingPrice();
		case 3: return  dao.sortusingID();
		}
		return null;
	}
	
}
	


