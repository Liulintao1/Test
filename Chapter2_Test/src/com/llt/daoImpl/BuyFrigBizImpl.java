package com.llt.daoImpl;


import org.springframework.stereotype.Service;

import com.llt.dao.FrigBiz;
import com.llt.util.NoThisFrigException;
@Service("frigBiz")
public class BuyFrigBizImpl implements FrigBiz {
	public void buyFrig(String customer, String frig) throws NoThisFrigException {		
       if ("����".equals(frig)) {
		throw new NoThisFrigException("�Բ���û��"+frig+"�Ļ���");
	}
       System.out.println("���ã����Ѿ�������һ̨"+frig);
	}

}
