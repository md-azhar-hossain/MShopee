package com.cg.mobshop.util;

import java.util.*;

import com.cg.mobshop.dto.Mobiles;

public class Util {
	
	private static HashMap<Integer,Mobiles>mobileEntries =
			 new HashMap<Integer,Mobiles>();
	
	static{
		mobileEntries.put(101,new Mobiles(101,"Sony xperia",12,12000));
		mobileEntries.put(102,new Mobiles(102,"Samsung",4,10000));
		mobileEntries.put(103,new Mobiles(103,"Iphone 3",2,23000));
		mobileEntries.put(104,new Mobiles(104,"Nokia Note 2322",8,10000));
	
	}
	public static Map<Integer,Mobiles> getMobileEntries() 
		{   
		return mobileEntries;
	}

}
