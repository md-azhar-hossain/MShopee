package com.cg.mobshop.ui;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

import com.cg.mobshop.dto.Mobiles;
import com.cg.mobshop.exception.MobileException;
import com.cg.mobshop.service.MobileService;
import com.cg.mobshop.service.MobileServiceImpl;



public class MainUI {

	public static void main(String[] args) throws MobileException {
		// TODO Auto-generated method stub
		MobileService service = new MobileServiceImpl();
		int choice = 0;
		System.out.println("=================Welcome to Mobile Shopee===============");
		HashMap<Integer,Mobiles>map = 
				service.showAllMobiles();
		if(map.size()!=0)
		{
			Set<Integer>keys = map.keySet();
			for(Integer key:keys)
			{
				System.out.println(map.get(key));
			}
		}
		//System.out.println(service.showAllMobiles());
		try(Scanner sc = new Scanner(System.in))
		{
			do
			{
				System.out.println("1-Sorting");
				System.out.println("2-Delete");
				System.out.println("4-Show");
				System.out.println("3-Exit");
				System.out.println("Enter your choice::");
				choice = sc.nextInt();
				switch(choice){
				case 1:System.out.println("Select Sorting Criteria \n 1. mobile Name\n 2. Mobile Price\n 3. Mobile ID\n Enter Option :");
					int n=sc.nextInt();
				    LinkedHashMap<String, Mobiles>map1=service.sorting(n);
				    Set<String>keys = map1.keySet();
					for(String key:keys)
					{
						System.out.println(map1.get(key));
					}
				
					break;
				
				case 2 : 
						System.out.println("Enter MobileId for Delete:");
						int id=sc.nextInt();
					    boolean b=service.deleteRecord(id);
						if(b==true){
					    System.out.println("Employee with empId = "+id+"is deleted successfully");
						Set<Integer>keys1 = map.keySet();
							for(Integer key:keys1)
							{
								System.out.println(map.get(key));
							}
						}
						else {
							System.out.println(new MobileException("ID not found"));}						
						break;							
				case 3 : System.exit(0);
				case 4 : Set<Integer>keys1 = map.keySet();
				for(Integer key:keys1)
				{
					System.out.println(map.get(key));
				}
				}
				System.out.println("do you want to continue 1-yes 2-no");
				choice = sc.nextInt();
			}while(choice==1);
			
		}
	}

}
