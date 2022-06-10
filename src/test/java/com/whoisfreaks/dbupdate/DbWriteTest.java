//package com.whoisfreaks.dbupdate;
//
//
//import com.whoisfreaks.dbupdate.dao.DomainInfoDAO;
//import com.whoisfreaks.dbupdate.model.DomainInfo;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.security.SecurityProperties;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import java.util.List;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class DbWriteTest {
//
//    @Autowired
//    private DomainInfoDAO domainInfoDAO;
//
//    @Test
//    public void saveDomainInfo() {
//        DomainInfo domainInfo = new DomainInfo();
//        domainInfo.setId(10091L);
//        domainInfo.setDomainName("fahadishfaq.com");
//        domainInfoDAO.save(domainInfo);
//
//    }
//}
