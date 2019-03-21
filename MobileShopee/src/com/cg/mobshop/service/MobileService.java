package com.cg.mobshop.service;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

import com.cg.mobshop.dto.Mobiles;
import com.cg.mobshop.exception.MobileException;


public interface MobileService {
	public HashMap<Integer,Mobiles> showAllMobiles()throws MobileException;
	public boolean deleteRecord(int id) throws MobileException;
	public LinkedHashMap<String,Mobiles>sorting(int n);
}
