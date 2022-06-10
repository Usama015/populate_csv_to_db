package com.whoisfreaks.dbupdate.service;

import org.springframework.stereotype.Service;

@Service
public class DomainDataService {

    public static final String sqlInsertQuery = "INSERT INTO domain_info (" +
            "domain_name, query_time, create_date, update_date, expiry_date," +
            "domain_registrar_id, domain_registrar_name, domain_registrar_whois, domain_registrar_url," +
            "registrant_name, registrant_company, registrant_address, registrant_city, registrant_state, registrant_zip, " +
            "registrant_country_code, registrant_country, registrant_email, registrant_phone, registrant_fax," +
            "administrative_name, administrative_company, administrative_address, administrative_city, administrative_state, " +
            "administrative_zip, administrative_country_code, administrative_country, administrative_email, administrative_phone, " +
            "administrative_fax," +
            "technical_name, technical_company, technical_address, technical_city, technical_state, technical_zip, " +
            "technical_country_code, technical_country, technical_email, technical_phone, technical_fax," +
            "billing_name, billing_company, billing_address, billing_city, billing_state, billing_zip, billing_country_code, " +
            "billing_country, billing_email, billing_phone, billing_fax," +
            "name_server1, name_server2, name_server3, name_server4, domain_status1, domain_status2, domain_status3, domain_status4" +
            ") VALUES (" +
            ":domainName, :queryTime, :createDate, :updateDate, :expiryDate," +
            ":domainRegistrarId, :domainRegistrarName, :domainRegistrarWhois, :domainRegistrarUrl," +
            ":registrantName, :registrantCompany, :registrantAddress, :registrantCity, :registrantState, :registrantZip, " +
            ":registrantCountryCode, :registrantCountry, :registrantEmail, :registrantPhone, :registrantFax," +
            ":administrativeName, :administrativeCompany, :administrativeAddress, :administrativeCity, :administrativeState, " +
            ":administrativeZip, :administrativeCountryCode, :administrativeCountry, :administrativeEmail, " +
            ":administrativePhone, :administrativeFax," +
            ":technicalName, :technicalCompany, :technicalAddress, :technicalCity, :technicalState, :technicalZip, " +
            ":technicalCountryCode, :technicalCountry, :technicalEmail, :technicalPhone, :technicalFax," +
            ":billingName, :billingCompany, :billingAddress, :billingCity, :billingState, :billingZip, :billingCountryCode, " +
            ":billingCountry, :billingEmail, :billingPhone, :billingFax," +
            ":nameServer1, :nameServer2, :nameServer3, :nameServer4, :domainStatus1, :domainStatus2, :domainStatus3, :domainStatus4" +
            ")";
}
