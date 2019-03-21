package com.cg.mobshop.dao;

import java.util.*;

import com.cg.mobshop.dto.Mobiles;
import com.cg.mobshop.exception.MobileException;


public interface MobileDAO {

	public HashMap<Integer,Mobiles> showAllMobiles()throws MobileException;
	public boolean deleteRecord(int id) throws MobileException;
	public  LinkedHashMap<String, Mobiles> sortusingID();
	public  LinkedHashMap<String, Mobiles> sortusingPrice();
	public  LinkedHashMap<String,Mobiles> sortusingName();
}
