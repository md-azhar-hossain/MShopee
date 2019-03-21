package com.cg.mobshop.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.cg.mobshop.dao.MobileDAOImpl;
import com.cg.mobshop.exception.MobileException;

public class TestMobileDAOImpl {
 MobileDAOImpl bd=new MobileDAOImpl();
	@Test
	public void testDeleteRecord() throws MobileException {
	         //		assertTrue( bd.());
			assertTrue(bd.deleteRecord(101));
			//fail("Not yet implemented");
		}
	

}
