package com.whoisfreaks.dbupdate.service;

import com.whoisfreaks.dbupdate.model.DomainInfo;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Service;

@Service
public class DomainInfoProcessorService implements ItemProcessor<DomainInfo, DomainInfo> {

    @Override
    public DomainInfo process(DomainInfo domainInfo) throws Exception {
        if (domainInfo.getDomainName().length() > 255) {
            domainInfo.setDomainName(domainInfo.getDomainName().substring(0, 255));
        }
        if (domainInfo.getQueryTime().length() > 255) {
            domainInfo.setQueryTime(domainInfo.getQueryTime().substring(0, 255));
        }
        if (domainInfo.getCreateDate().length() > 255) {
            domainInfo.setCreateDate(domainInfo.getCreateDate().substring(0, 255));
        }
        if (domainInfo.getUpdateDate().length() > 255) {
            domainInfo.setUpdateDate(domainInfo.getUpdateDate().substring(0, 255));
        }
        if (domainInfo.getExpiryDate().length() > 255) {
            domainInfo.setExpiryDate(domainInfo.getExpiryDate().substring(0, 255));
        }
        if (domainInfo.getDomainRegistrarId().length() > 255) {
            domainInfo.setDomainRegistrarId(domainInfo.getDomainRegistrarId().substring(0, 255));
        }
        if (domainInfo.getDomainRegistrarName().length() > 255) {
            domainInfo.setDomainRegistrarName(domainInfo.getDomainRegistrarName().substring(0, 255));
        }
        if (domainInfo.getDomainRegistrarWhois().length() > 255) {
            domainInfo.setDomainRegistrarWhois(domainInfo.getDomainRegistrarWhois().substring(0, 255));
        }
        if (domainInfo.getDomainRegistrarUrl().length() > 255) {
            domainInfo.setDomainRegistrarUrl(domainInfo.getDomainRegistrarUrl().substring(0, 255));
        }
        if (domainInfo.getRegistrantName().length() > 255) {
            domainInfo.setRegistrantName(domainInfo.getRegistrantName().substring(0, 255));
        }
        if (domainInfo.getRegistrantCompany().length() > 255) {
            domainInfo.setRegistrantCompany(domainInfo.getRegistrantCompany().substring(0, 255));
        }
        if (domainInfo.getRegistrantAddress().length() > 255) {
            domainInfo.setRegistrantAddress(domainInfo.getRegistrantAddress().substring(0, 255));
        }
        if (domainInfo.getRegistrantCity().length() > 255) {
            domainInfo.setRegistrantCity(domainInfo.getRegistrantCity().substring(0, 255));
        }
        if (domainInfo.getRegistrantState().length() > 255) {
            domainInfo.setRegistrantState(domainInfo.getRegistrantState().substring(0, 255));
        }
        if (domainInfo.getRegistrantZip().length() > 255) {
            domainInfo.setRegistrantZip(domainInfo.getRegistrantZip().substring(0, 255));
        }
        if (domainInfo.getRegistrantZip().length() > 255) {
            domainInfo.setRegistrantZip(domainInfo.getRegistrantZip().substring(0, 255));
        }
        if (domainInfo.getRegistrantCountryCode().length() > 255) {
            domainInfo.setRegistrantCountryCode(domainInfo.getRegistrantCountryCode().substring(0, 255));
        }
        if (domainInfo.getRegistrantCountry().length() > 255) {
            domainInfo.setRegistrantCountry(domainInfo.getRegistrantCountry().substring(0, 255));
        }
        if (domainInfo.getRegistrantEmail().length() > 255) {
            domainInfo.setRegistrantEmail(domainInfo.getRegistrantEmail().substring(0, 255));
        }
        if (domainInfo.getRegistrantPhone().length() > 255) {
            domainInfo.setRegistrantPhone(domainInfo.getRegistrantPhone().substring(0, 255));
        }
        if (domainInfo.getRegistrantFax().length() > 255) {
            domainInfo.setRegistrantFax(domainInfo.getRegistrantFax().substring(0, 255));
        }

        if (domainInfo.getAdministrativeName().length() > 255) {
            domainInfo.setAdministrativeName(domainInfo.getAdministrativeName().substring(0, 255));
        }
        if (domainInfo.getAdministrativeCompany().length() > 255) {
            domainInfo.setAdministrativeCompany(domainInfo.getAdministrativeCompany().substring(0, 255));
        }
        if (domainInfo.getAdministrativeAddress().length() > 255) {
            domainInfo.setAdministrativeAddress(domainInfo.getAdministrativeAddress().substring(0, 255));
        }
        if (domainInfo.getAdministrativeCity().length() > 255) {
            domainInfo.setAdministrativeCity(domainInfo.getAdministrativeCity().substring(0, 255));
        }
        if (domainInfo.getAdministrativeState().length() > 255) {
            domainInfo.setAdministrativeState(domainInfo.getAdministrativeState().substring(0, 255));
        }
        if (domainInfo.getAdministrativeZip().length() > 255) {
            domainInfo.setAdministrativeZip(domainInfo.getAdministrativeZip().substring(0, 255));
        }
        if (domainInfo.getAdministrativeZip().length() > 255) {
            domainInfo.setAdministrativeZip(domainInfo.getAdministrativeZip().substring(0, 255));
        }
        if (domainInfo.getAdministrativeCountryCode().length() > 255) {
            domainInfo.setAdministrativeCountryCode(domainInfo.getAdministrativeCountryCode().substring(0, 255));
        }
        if (domainInfo.getAdministrativeCountry().length() > 255) {
            domainInfo.setAdministrativeCountry(domainInfo.getAdministrativeCountry().substring(0, 255));
        }
        if (domainInfo.getAdministrativeEmail().length() > 255) {
            domainInfo.setAdministrativeEmail(domainInfo.getAdministrativeEmail().substring(0, 255));
        }
        if (domainInfo.getAdministrativePhone().length() > 255) {
            domainInfo.setAdministrativePhone(domainInfo.getAdministrativePhone().substring(0, 255));
        }
        if (domainInfo.getAdministrativeFax().length() > 255) {
            domainInfo.setAdministrativeFax(domainInfo.getAdministrativeFax().substring(0, 255));
        }


        if (domainInfo.getTechnicalName().length() > 255) {
            domainInfo.setTechnicalName(domainInfo.getTechnicalName().substring(0, 255));
        }
        if (domainInfo.getTechnicalCompany().length() > 255) {
            domainInfo.setTechnicalCompany(domainInfo.getTechnicalCompany().substring(0, 255));
        }
        if (domainInfo.getTechnicalAddress().length() > 255) {
            domainInfo.setTechnicalAddress(domainInfo.getTechnicalAddress().substring(0, 255));
        }
        if (domainInfo.getTechnicalCity().length() > 255) {
            domainInfo.setTechnicalCity(domainInfo.getTechnicalCity().substring(0, 255));
        }
        if (domainInfo.getTechnicalState().length() > 255) {
            domainInfo.setTechnicalState(domainInfo.getTechnicalState().substring(0, 255));
        }
        if (domainInfo.getTechnicalZip().length() > 255) {
            domainInfo.setTechnicalZip(domainInfo.getTechnicalZip().substring(0, 255));
        }
        if (domainInfo.getTechnicalZip().length() > 255) {
            domainInfo.setTechnicalZip(domainInfo.getTechnicalZip().substring(0, 255));
        }
        if (domainInfo.getTechnicalCountryCode().length() > 255) {
            domainInfo.setTechnicalCountryCode(domainInfo.getTechnicalCountryCode().substring(0, 255));
        }
        if (domainInfo.getTechnicalCountry().length() > 255) {
            domainInfo.setTechnicalCountry(domainInfo.getTechnicalCountry().substring(0, 255));
        }
        if (domainInfo.getTechnicalEmail().length() > 255) {
            domainInfo.setTechnicalEmail(domainInfo.getTechnicalEmail().substring(0, 255));
        }
        if (domainInfo.getTechnicalPhone().length() > 255) {
            domainInfo.setTechnicalPhone(domainInfo.getTechnicalPhone().substring(0, 255));
        }
        if (domainInfo.getTechnicalFax().length() > 255) {
            domainInfo.setTechnicalFax(domainInfo.getTechnicalFax().substring(0, 255));
        }


        if (domainInfo.getBillingName().length() > 255) {
            domainInfo.setBillingName(domainInfo.getBillingName().substring(0, 255));
        }
        if (domainInfo.getBillingCompany().length() > 255) {
            domainInfo.setBillingCompany(domainInfo.getBillingCompany().substring(0, 255));
        }
        if (domainInfo.getBillingAddress().length() > 255) {
            domainInfo.setBillingAddress(domainInfo.getBillingAddress().substring(0, 255));
        }
        if (domainInfo.getBillingCity().length() > 255) {
            domainInfo.setBillingCity(domainInfo.getBillingCity().substring(0, 255));
        }
        if (domainInfo.getBillingState().length() > 255) {
            domainInfo.setBillingState(domainInfo.getBillingState().substring(0, 255));
        }
        if (domainInfo.getBillingZip().length() > 255) {
            domainInfo.setBillingZip(domainInfo.getBillingZip().substring(0, 255));
        }
        if (domainInfo.getBillingZip().length() > 255) {
            domainInfo.setBillingZip(domainInfo.getBillingZip().substring(0, 255));
        }
        if (domainInfo.getBillingCountryCode().length() > 255) {
            domainInfo.setBillingCountryCode(domainInfo.getBillingCountryCode().substring(0, 255));
        }
        if (domainInfo.getBillingCountry().length() > 255) {
            domainInfo.setBillingCountry(domainInfo.getBillingCountry().substring(0, 255));
        }
        if (domainInfo.getBillingEmail().length() > 255) {
            domainInfo.setBillingEmail(domainInfo.getBillingEmail().substring(0, 255));
        }
        if (domainInfo.getBillingPhone().length() > 255) {
            domainInfo.setBillingPhone(domainInfo.getBillingPhone().substring(0, 255));
        }
        if (domainInfo.getBillingFax().length() > 255) {
            domainInfo.setBillingFax(domainInfo.getBillingFax().substring(0, 255));
        }

        if (domainInfo.getNameServer1().length() > 255) {
            domainInfo.setNameServer1(domainInfo.getNameServer1().substring(0, 255));
        }
        if (domainInfo.getNameServer2().length() > 255) {
            domainInfo.setNameServer2(domainInfo.getNameServer2().substring(0, 255));
        }
        if (domainInfo.getNameServer3().length() > 255) {
            domainInfo.setNameServer3(domainInfo.getNameServer3().substring(0, 255));
        }
        if (domainInfo.getNameServer4().length() > 255) {
            domainInfo.setNameServer4(domainInfo.getNameServer4().substring(0, 255));
        }

        if (domainInfo.getDomainStatus1().length() > 255) {
            domainInfo.setDomainStatus1(domainInfo.getDomainStatus1().substring(0, 255));
        }
        if (domainInfo.getDomainStatus2().length() > 255) {
            domainInfo.setDomainStatus2(domainInfo.getDomainStatus2().substring(0, 255));
        }
        if (domainInfo.getDomainStatus3().length() > 255) {
            domainInfo.setDomainStatus3(domainInfo.getDomainStatus3().substring(0, 255));
        }
        if (domainInfo.getDomainStatus4().length() > 255) {
            domainInfo.setDomainStatus4(domainInfo.getDomainStatus4().substring(0, 255));
        }
        return domainInfo;
    }
}
