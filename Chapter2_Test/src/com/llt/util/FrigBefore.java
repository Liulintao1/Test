package com.llt.util;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
@Component
@Aspect
public class FrigBefore {
	@Pointcut("execution(* com.llt.daoImpl.*.* (..))")
	public void p1(){};
	@Before(value="p1()")
  private void before(JoinPoint jp) throws Throwable{
	  //ͨ��joinPoint��ȡĿ�귽������Ĳ���customerֵ
	  String customer=(String) jp.getArgs()[0];
	  //��ʾ��ӭ��Ϣ����byFrig����ǰ����
	  System.out.println("��ӭ���٣�"+customer+"!");
	  
  }
}
