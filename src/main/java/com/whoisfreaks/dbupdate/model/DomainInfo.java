package com.whoisfreaks.dbupdate.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "domain_info")
public class DomainInfo {

    public DomainInfo() {
    }

    public DomainInfo(String domainName, String queryTime, String createDate, String updateDate, String expiryDate,
                      String domainRegistrarId, String domainRegistrarName, String domainRegistrarWhois,
                      String domainRegistrarUrl, String registrantName, String registrantCompany,
                      String registrantAddress, String registrantCity, String registrantState, String registrantZip,
                      String registrantCountryCode, String registrantCountry, String registrantEmail,
                      String registrantPhone, String registrantFax, String administrativeName,
                      String administrativeCompany, String administrativeAddress, String administrativeCity,
                      String administrativeState, String administrativeZip, String administrativeCountryCode,
                      String administrativeCountry, String administrativeEmail, String administrativePhone,
                      String administrativeFax, String technicalName, String technicalCompany, String technicalAddress,
                      String technicalCity, String technicalState, String technicalZip, String technicalCountryCode,
                      String technicalCountry, String technicalEmail, String technicalPhone, String technicalFax,
                      String billingName, String billingCompany, String billingAddress, String billingCity,
                      String billingState, String billingZip, String billingCountryCode, String billingCountry,
                      String billingEmail, String billingPhone, String billingFax, String nameServer1, String nameServer2,
                      String nameServer3, String nameServer4, String domainStatus1, String domainStatus2,
                      String domainStatus3, String domainStatus4) {
        this.domainName = domainName;
        this.queryTime = queryTime;
        this.createDate = createDate;
        this.updateDate = updateDate;
        this.expiryDate = expiryDate;
        this.domainRegistrarId = domainRegistrarId;
        this.domainRegistrarName = domainRegistrarName;
        this.domainRegistrarWhois = domainRegistrarWhois;
        this.domainRegistrarUrl = domainRegistrarUrl;
        this.registrantName = registrantName;
        this.registrantCompany = registrantCompany;
        this.registrantAddress = registrantAddress;
        this.registrantCity = registrantCity;
        this.registrantState = registrantState;
        this.registrantZip = registrantZip;
        this.registrantCountryCode = registrantCountryCode;
        this.registrantCountry = registrantCountry;
        this.registrantEmail = registrantEmail;
        this.registrantPhone = registrantPhone;
        this.registrantFax = registrantFax;
        this.administrativeName = administrativeName;
        this.administrativeCompany = administrativeCompany;
        this.administrativeAddress = administrativeAddress;
        this.administrativeCity = administrativeCity;
        this.administrativeState = administrativeState;
        this.administrativeZip = administrativeZip;
        this.administrativeCountryCode = administrativeCountryCode;
        this.administrativeCountry = administrativeCountry;
        this.administrativeEmail = administrativeEmail;
        this.administrativePhone = administrativePhone;
        this.administrativeFax = administrativeFax;
        this.technicalName = technicalName;
        this.technicalCompany = technicalCompany;
        this.technicalAddress = technicalAddress;
        this.technicalCity = technicalCity;
        this.technicalState = technicalState;
        this.technicalZip = technicalZip;
        this.technicalCountryCode = technicalCountryCode;
        this.technicalCountry = technicalCountry;
        this.technicalEmail = technicalEmail;
        this.technicalPhone = technicalPhone;
        this.technicalFax = technicalFax;
        this.billingName = billingName;
        this.billingCompany = billingCompany;
        this.billingAddress = billingAddress;
        this.billingCity = billingCity;
        this.billingState = billingState;
        this.billingZip = billingZip;
        this.billingCountryCode = billingCountryCode;
        this.billingCountry = billingCountry;
        this.billingEmail = billingEmail;
        this.billingPhone = billingPhone;
        this.billingFax = billingFax;
        this.nameServer1 = nameServer1;
        this.nameServer2 = nameServer2;
        this.nameServer3 = nameServer3;
        this.nameServer4 = nameServer4;
        this.domainStatus1 = domainStatus1;
        this.domainStatus2 = domainStatus2;
        this.domainStatus3 = domainStatus3;
        this.domainStatus4 = domainStatus4;
    }

    private String domainName;
    private String queryTime;
    private String createDate;
    private String updateDate;
    private String expiryDate;
    private String domainRegistrarId;
    private String domainRegistrarName;
    private String domainRegistrarWhois;
    private String domainRegistrarUrl;
    private String registrantName;
    private String registrantCompany;
    private String registrantAddress;
    private String registrantCity;
    private String registrantState;
    private String registrantZip;
    private String registrantCountryCode;
    private String registrantCountry;
    private String registrantEmail;
    private String registrantPhone;
    private String registrantFax;
    private String administrativeName;
    private String administrativeCompany;
    private String administrativeAddress;
    private String administrativeCity;
    private String administrativeState;
    private String administrativeZip;
    private String administrativeCountryCode;
    private String administrativeCountry;
    private String administrativeEmail;
    private String administrativePhone;
    private String administrativeFax;
    private String technicalName;
    private String technicalCompany;
    private String technicalAddress;
    private String technicalCity;
    private String technicalState;
    private String technicalZip;
    private String technicalCountryCode;
    private String technicalCountry;
    private String technicalEmail;
    private String technicalPhone;
    private String technicalFax;
    private String billingName;
    private String billingCompany;
    private String billingAddress;
    private String billingCity;
    private String billingState;
    private String billingZip;
    private String billingCountryCode;
    private String billingCountry;
    private String billingEmail;
    private String billingPhone;
    private String billingFax;
    private String nameServer1;
    private String nameServer2;
    private String nameServer3;
    private String nameServer4;
    private String domainStatus1;
    private String domainStatus2;
    private String domainStatus3;
    private String domainStatus4;

    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public String getQueryTime() {
        return queryTime;
    }

    public void setQueryTime(String queryTime) {
        this.queryTime = queryTime;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getDomainRegistrarId() {
        return domainRegistrarId;
    }

    public void setDomainRegistrarId(String domainRegistrarId) {
        this.domainRegistrarId = domainRegistrarId;
    }

    public String getDomainRegistrarName() {
        return domainRegistrarName;
    }

    public void setDomainRegistrarName(String domainRegistrarName) {
        this.domainRegistrarName = domainRegistrarName;
    }

    public String getDomainRegistrarWhois() {
        return domainRegistrarWhois;
    }

    public void setDomainRegistrarWhois(String domainRegistrarWhois) {
        this.domainRegistrarWhois = domainRegistrarWhois;
    }

    public String getDomainRegistrarUrl() {
        return domainRegistrarUrl;
    }

    public void setDomainRegistrarUrl(String domainRegistrarUrl) {
        this.domainRegistrarUrl = domainRegistrarUrl;
    }

    public String getRegistrantName() {
        return registrantName;
    }

    public void setRegistrantName(String registrantName) {
        this.registrantName = registrantName;
    }

    public String getRegistrantCompany() {
        return registrantCompany;
    }

    public void setRegistrantCompany(String registrantCompany) {
        this.registrantCompany = registrantCompany;
    }

    public String getRegistrantAddress() {
        return registrantAddress;
    }

    public void setRegistrantAddress(String registrantAddress) {
        this.registrantAddress = registrantAddress;
    }

    public String getRegistrantCity() {
        return registrantCity;
    }

    public void setRegistrantCity(String registrantCity) {
        this.registrantCity = registrantCity;
    }

    public String getRegistrantState() {
        return registrantState;
    }

    public void setRegistrantState(String registrantState) {
        this.registrantState = registrantState;
    }

    public String getRegistrantZip() {
        return registrantZip;
    }

    public void setRegistrantZip(String registrantZip) {
        this.registrantZip = registrantZip;
    }

    public String getRegistrantCountryCode() {
        return registrantCountryCode;
    }

    public void setRegistrantCountryCode(String registrantCountryCode) {
        this.registrantCountryCode = registrantCountryCode;
    }

    public String getRegistrantCountry() {
        return registrantCountry;
    }

    public void setRegistrantCountry(String registrantCountry) {
        this.registrantCountry = registrantCountry;
    }

    public String getRegistrantEmail() {
        return registrantEmail;
    }

    public void setRegistrantEmail(String registrantEmail) {
        this.registrantEmail = registrantEmail;
    }

    public String getRegistrantPhone() {
        return registrantPhone;
    }

    public void setRegistrantPhone(String registrantPhone) {
        this.registrantPhone = registrantPhone;
    }

    public String getRegistrantFax() {
        return registrantFax;
    }

    public void setRegistrantFax(String registrantFax) {
        this.registrantFax = registrantFax;
    }

    public String getAdministrativeName() {
        return administrativeName;
    }

    public void setAdministrativeName(String administrativeName) {
        this.administrativeName = administrativeName;
    }

    public String getAdministrativeCompany() {
        return administrativeCompany;
    }

    public void setAdministrativeCompany(String administrativeCompany) {
        this.administrativeCompany = administrativeCompany;
    }

    public String getAdministrativeAddress() {
        return administrativeAddress;
    }

    public void setAdministrativeAddress(String administrativeAddress) {
        this.administrativeAddress = administrativeAddress;
    }

    public String getAdministrativeCity() {
        return administrativeCity;
    }

    public void setAdministrativeCity(String administrativeCity) {
        this.administrativeCity = administrativeCity;
    }

    public String getAdministrativeState() {
        return administrativeState;
    }

    public void setAdministrativeState(String administrativeState) {
        this.administrativeState = administrativeState;
    }

    public String getAdministrativeZip() {
        return administrativeZip;
    }

    public void setAdministrativeZip(String administrativeZip) {
        this.administrativeZip = administrativeZip;
    }

    public String getAdministrativeCountryCode() {
        return administrativeCountryCode;
    }

    public void setAdministrativeCountryCode(String administrativeCountryCode) {
        this.administrativeCountryCode = administrativeCountryCode;
    }

    public String getAdministrativeCountry() {
        return administrativeCountry;
    }

    public void setAdministrativeCountry(String administrativeCountry) {
        this.administrativeCountry = administrativeCountry;
    }

    public String getAdministrativeEmail() {
        return administrativeEmail;
    }

    public void setAdministrativeEmail(String administrativeEmail) {
        this.administrativeEmail = administrativeEmail;
    }

    public String getAdministrativePhone() {
        return administrativePhone;
    }

    public void setAdministrativePhone(String administrativePhone) {
        this.administrativePhone = administrativePhone;
    }

    public String getAdministrativeFax() {
        return administrativeFax;
    }

    public void setAdministrativeFax(String administrativeFax) {
        this.administrativeFax = administrativeFax;
    }

    public String getTechnicalName() {
        return technicalName;
    }

    public void setTechnicalName(String technicalName) {
        this.technicalName = technicalName;
    }

    public String getTechnicalCompany() {
        return technicalCompany;
    }

    public void setTechnicalCompany(String technicalCompany) {
        this.technicalCompany = technicalCompany;
    }

    public String getTechnicalAddress() {
        return technicalAddress;
    }

    public void setTechnicalAddress(String technicalAddress) {
        this.technicalAddress = technicalAddress;
    }

    public String getTechnicalCity() {
        return technicalCity;
    }

    public void setTechnicalCity(String technicalCity) {
        this.technicalCity = technicalCity;
    }

    public String getTechnicalState() {
        return technicalState;
    }

    public void setTechnicalState(String technicalState) {
        this.technicalState = technicalState;
    }

    public String getTechnicalZip() {
        return technicalZip;
    }

    public void setTechnicalZip(String technicalZip) {
        this.technicalZip = technicalZip;
    }

    public String getTechnicalCountryCode() {
        return technicalCountryCode;
    }

    public void setTechnicalCountryCode(String technicalCountryCode) {
        this.technicalCountryCode = technicalCountryCode;
    }

    public String getTechnicalCountry() {
        return technicalCountry;
    }

    public void setTechnicalCountry(String technicalCountry) {
        this.technicalCountry = technicalCountry;
    }

    public String getTechnicalEmail() {
        return technicalEmail;
    }

    public void setTechnicalEmail(String technicalEmail) {
        this.technicalEmail = technicalEmail;
    }

    public String getTechnicalPhone() {
        return technicalPhone;
    }

    public void setTechnicalPhone(String technicalPhone) {
        this.technicalPhone = technicalPhone;
    }

    public String getTechnicalFax() {
        return technicalFax;
    }

    public void setTechnicalFax(String technicalFax) {
        this.technicalFax = technicalFax;
    }

    public String getBillingName() {
        return billingName;
    }

    public void setBillingName(String billingName) {
        this.billingName = billingName;
    }

    public String getBillingCompany() {
        return billingCompany;
    }

    public void setBillingCompany(String billingCompany) {
        this.billingCompany = billingCompany;
    }

    public String getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }

    public String getBillingCity() {
        return billingCity;
    }

    public void setBillingCity(String billingCity) {
        this.billingCity = billingCity;
    }

    public String getBillingState() {
        return billingState;
    }

    public void setBillingState(String billingState) {
        this.billingState = billingState;
    }

    public String getBillingZip() {
        return billingZip;
    }

    public void setBillingZip(String billingZip) {
        this.billingZip = billingZip;
    }

    public String getBillingCountryCode() {
        return billingCountryCode;
    }

    public void setBillingCountryCode(String billingCountryCode) {
        this.billingCountryCode = billingCountryCode;
    }

    public String getBillingCountry() {
        return billingCountry;
    }

    public void setBillingCountry(String billingCountry) {
        this.billingCountry = billingCountry;
    }

    public String getBillingEmail() {
        return billingEmail;
    }

    public void setBillingEmail(String billingEmail) {
        this.billingEmail = billingEmail;
    }

    public String getBillingPhone() {
        return billingPhone;
    }

    public void setBillingPhone(String billingPhone) {
        this.billingPhone = billingPhone;
    }

    public String getBillingFax() {
        return billingFax;
    }

    public void setBillingFax(String billingFax) {
        this.billingFax = billingFax;
    }

    public String getNameServer1() {
        return nameServer1;
    }

    public void setNameServer1(String nameServer1) {
        this.nameServer1 = nameServer1;
    }

    public String getNameServer2() {
        return nameServer2;
    }

    public void setNameServer2(String nameServer2) {
        this.nameServer2 = nameServer2;
    }

    public String getNameServer3() {
        return nameServer3;
    }

    public void setNameServer3(String nameServer3) {
        this.nameServer3 = nameServer3;
    }

    public String getNameServer4() {
        return nameServer4;
    }

    public void setNameServer4(String nameServer4) {
        this.nameServer4 = nameServer4;
    }

    public String getDomainStatus1() {
        return domainStatus1;
    }

    public void setDomainStatus1(String domainStatus1) {
        this.domainStatus1 = domainStatus1;
    }

    public String getDomainStatus2() {
        return domainStatus2;
    }

    public void setDomainStatus2(String domainStatus2) {
        this.domainStatus2 = domainStatus2;
    }

    public String getDomainStatus3() {
        return domainStatus3;
    }

    public void setDomainStatus3(String domainStatus3) {
        this.domainStatus3 = domainStatus3;
    }

    public String getDomainStatus4() {
        return domainStatus4;
    }

    public void setDomainStatus4(String domainStatus4) {
        this.domainStatus4 = domainStatus4;
    }

}
