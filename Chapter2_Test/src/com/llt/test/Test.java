package com.llt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.llt.dao.FrigBiz;
import com.llt.daoImpl.BuyFrigBizImpl;
import com.llt.util.NoThisFrigException;

public class Test {
 public static void main(String[] args) throws NoThisFrigException{
	ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
	FrigBiz frigBiz=(FrigBiz) ctx.getBean("frigBiz");
	frigBiz.buyFrig("���޼�", "lg");
	frigBiz.buyFrig("���޼�", "lg"); 
}
}