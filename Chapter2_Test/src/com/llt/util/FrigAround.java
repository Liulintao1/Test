package com.llt.util;

import java.util.HashSet;
import java.util.Set;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
@Component
@Aspect
public class FrigAround {
  private Set<String> customers=new HashSet<String>();

  @Pointcut("execution(* com.llt.daoImpl.*.* (..))")
  public void p1(){}
  @Around("p1()")
  public Object around(ProceedingJoinPoint pjp) throws Throwable{
	  Object[] argsObjects=pjp.getArgs();//Ŀ�귽�����в���
	  String customer=(String) argsObjects[0];
	  String frig=(String) argsObjects[1];
	  if (customers.contains(customer)) {
		throw new BuyFrigException("һ���˿�ֻ�ܹ���һ̨���䣬���Ѿ������һ̨"+frig+"������");
		
	}
	  try {
			return pjp.proceed();
		} finally {
			// TODO: handle finally clause
			customers.add(customer);
		}
  }
}
