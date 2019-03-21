package com.cg.mobshop.dao;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import com.cg.mobshop.dto.Mobiles;
import com.cg.mobshop.exception.MobileException;
import com.cg.mobshop.util.Util;


public class MobileDAOImpl implements MobileDAO{

	

	@Override
	public HashMap<Integer, Mobiles> showAllMobiles() throws MobileException {
		// TODO Auto-generated method stub
		HashMap<Integer,Mobiles> map=(HashMap<Integer, Mobiles>) Util.getMobileEntries();
		if(map.size()==0)
			throw new MobileException("No mobiles Data found");
		
		return map;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public boolean deleteRecord(int id) throws MobileException {
		// TODO Auto-generated method stub
		Map<Integer,Mobiles> hm=(HashMap<Integer, Mobiles>) Util.getMobileEntries();
		if(hm.size()==0)
			throw new MobileException("No mobiles Data found");
		else
		
			for(Map.Entry m:hm.entrySet()){
				if((int)m.getKey()==id){
					Util.getMobileEntries().remove(id);
					return true;
				}
			}
		return false;
		
	}

	@Override
	public LinkedHashMap<String, Mobiles> sortusingID() {
		// TODO Auto-generated method stub
		Map<Integer,Mobiles> hm=(HashMap<Integer, Mobiles>) Util.getMobileEntries();
		Map<Integer,Mobiles> tmap=(TreeMap<Integer, Mobiles>) (hm);
		
		Collection<Mobiles> cel=tmap.values();
		List<Mobiles> e=new ArrayList<>(cel);
		Comparator<Mobiles> namec=(e1,e2)->e1.getMobileId().compareTo(e2.getMobileId());
		Collections.sort(e,namec);
		LinkedHashMap<String, Mobiles> lhmap=new LinkedHashMap<String, Mobiles>();
		for(Mobiles m:e)
			lhmap.put(m.getMobileId(),m );
		
		return lhmap;
		
	}

	@Override
	public LinkedHashMap<String, Mobiles> sortusingPrice() {
		// TODO Auto-generated method stub
		Map<Integer,Mobiles> hm=(HashMap<Integer, Mobiles>) Util.getMobileEntries();
    
		
		Collection<Mobiles> cel=hm.values();
		List<Mobiles> e=new ArrayList<>(cel);
		Comparator<Mobiles> namec=(e1,e2)->e1.getPrice().compareTo(e2.getPrice());
		Collections.sort(e,namec);
		LinkedHashMap<String, Mobiles> lhmap=new LinkedHashMap<String, Mobiles>();
		for(Mobiles m:e)
			lhmap.put(m.getMobileId(),m );
		
		return lhmap;
	}

	@Override
	public LinkedHashMap<String, Mobiles> sortusingName() {
		// TODO Auto-generated method stub
		Map<Integer,Mobiles> hm=(HashMap<Integer, Mobiles>) Util.getMobileEntries();
      
		
		Collection<Mobiles> cel=hm.values();
		List<Mobiles> e1=new ArrayList<>(cel);
		Comparator<Mobiles> namec=(e2,e3)->e2.getName().compareTo(e3.getName());
		Collections.sort(e1,namec);
		LinkedHashMap<String, Mobiles> lhmap=new LinkedHashMap<String, Mobiles>();
		for(Mobiles m:e1)
			lhmap.put(m.getMobileId(),m );
		
		return lhmap;
	}

	
	
	
	

}
