package com.whoisfreaks.dbupdate.mapper;

import com.whoisfreaks.dbupdate.model.DomainInfo;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;

public class DomainInfoMapper implements FieldSetMapper<DomainInfo> {
    @Override
    public DomainInfo mapFieldSet(FieldSet fieldSet) {
        return new DomainInfo(fieldSet.readLong("num"),fieldSet.readString("domain_name"), fieldSet.readString("query_time"),
                fieldSet.readString("create_date"), fieldSet.readString("update_date"), fieldSet.readString("expiry_date"),
                fieldSet.readString("domain_registrar_id"), fieldSet.readString("domain_registrar_name"),
                fieldSet.readString("domain_registrar_whois"), fieldSet.readString("domain_registrar_url"),

                fieldSet.readString("registrant_name"), fieldSet.readString("registrant_company"),
                fieldSet.readString("registrant_address"), fieldSet.readString("registrant_city"),
                fieldSet.readString("registrant_state"), fieldSet.readString("registrant_zip"),
                fieldSet.readString("registrant_country_code"), fieldSet.readString("registrant_country"),
                fieldSet.readString("registrant_email"), fieldSet.readString("registrant_phone"),
                fieldSet.readString("registrant_fax"),

                fieldSet.readString("administrative_name"), fieldSet.readString("administrative_company"),
                fieldSet.readString("administrative_address"), fieldSet.readString("administrative_city"),
                fieldSet.readString("administrative_state"),
                fieldSet.readString("administrative_zip"), fieldSet.readString("administrative_country_code"),
                fieldSet.readString("administrative_country"), fieldSet.readString("administrative_email"),
                fieldSet.readString("administrative_phone"), fieldSet.readString("administrative_fax"),

                fieldSet.readString("technical_name"), fieldSet.readString("technical_company"),
                fieldSet.readString("technical_address"), fieldSet.readString("technical_city"),
                fieldSet.readString("technical_state"), fieldSet.readString("technical_zip"),
                fieldSet.readString("technical_country_code"), fieldSet.readString("technical_country"),
                fieldSet.readString("technical_email"), fieldSet.readString("technical_phone"),
                fieldSet.readString("technical_fax"),

                fieldSet.readString("billing_name"), fieldSet.readString("billing_company"),
                fieldSet.readString("billing_address"), fieldSet.readString("billing_city"),
                fieldSet.readString("billing_state"), fieldSet.readString("billing_zip"),
                fieldSet.readString("billing_country_code"), fieldSet.readString("billing_country"),
                fieldSet.readString("billing_email"), fieldSet.readString("billing_phone"),
                fieldSet.readString("billing_fax"),

                fieldSet.readString("name_server_1"), fieldSet.readString("name_server_2"),
                fieldSet.readString("name_server_3"), fieldSet.readString("name_server_4"),
                fieldSet.readString("domain_status_1"), fieldSet.readString("domain_status_2"),
                fieldSet.readString("domain_status_3"), fieldSet.readString("domain_status_4"));
    }
}