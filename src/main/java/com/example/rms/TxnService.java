package com.example.rms;

import com.example.account.AccountService;
import com.example.util.BeanSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TxnService {

    @Autowired
    private AccountService accountService;

    public void bar( String param ){
        TxnController txnController = BeanSupport.getBean(TxnController.class);
        txnController.calledByMonoService(param);
    }
}
