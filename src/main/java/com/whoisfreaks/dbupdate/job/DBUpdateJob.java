package com.whoisfreaks.dbupdate.job;

import com.whoisfreaks.dbupdate.mapper.DomainInfoMapper;
import com.whoisfreaks.dbupdate.model.DomainInfo;
import com.whoisfreaks.dbupdate.service.DomainDataService;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.DefaultBatchConfigurer;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.database.BeanPropertyItemSqlParameterSourceProvider;
import org.springframework.batch.item.database.JdbcBatchItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.PathResource;

import javax.sql.DataSource;

import static com.whoisfreaks.dbupdate.service.DomainDataService.sqlInsertQuery;

@Configuration
@EnableBatchProcessing
public class DBUpdateJob extends DefaultBatchConfigurer {

    @Autowired
    DataSource dataSource;

    @Autowired
    private JobBuilderFactory jobBuilderFactory;

    @Autowired
    private StepBuilderFactory stepBuilderFactory;

    @Autowired
    DomainDataService domainDataService;

    @Autowired
    @Qualifier("domainInfoProcessorService")
    ItemProcessor<DomainInfo, DomainInfo> itemProcessor;

    @Value("${csv.file.path.abs}")
    String csvFilePath;

    @Override
    public void setDataSource(DataSource dataSource) {
    }

    @Bean
    public JdbcBatchItemWriter<DomainInfo> domainInfoWriter() {
        JdbcBatchItemWriter<DomainInfo> itemWriter = new JdbcBatchItemWriter<DomainInfo>();
        itemWriter.setDataSource(dataSource);
        itemWriter.setSql(sqlInsertQuery);
        itemWriter.setItemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<DomainInfo>());
        return itemWriter;
    }

    @Bean
    public FlatFileItemReader<DomainInfo> dbFileReader() {
        PathResource filePath = new PathResource(csvFilePath);
        FlatFileItemReader<DomainInfo> reader = new FlatFileItemReader<>();
        reader.setResource(filePath);

        DefaultLineMapper<DomainInfo> mapper = new DefaultLineMapper<>();
        DelimitedLineTokenizer tokenizer = new DelimitedLineTokenizer();
        tokenizer.setNames("num", "domain_name", "query_time", "create_date", "update_date", "expiry_date",
                "domain_registrar_id", "domain_registrar_name", "domain_registrar_whois", "domain_registrar_url",
                "registrant_name", "registrant_company", "registrant_address", "registrant_city", "registrant_state",
                "registrant_zip", "registrant_country_code", "registrant_country", "registrant_email", "registrant_phone",
                "registrant_fax", "administrative_name", "administrative_company", "administrative_address",
                "administrative_city", "administrative_state", "administrative_zip", "administrative_country_code",
                "administrative_country", "administrative_email", "administrative_phone", "administrative_fax",
                "technical_name", "technical_company", "technical_address", "technical_city", "technical_state",
                "technical_zip", "technical_country_code", "technical_country", "technical_email", "technical_phone",
                "technical_fax", "billing_name", "billing_company", "billing_address", "billing_city", "billing_state",
                "billing_zip", "billing_country_code", "billing_country", "billing_email", "billing_phone", "billing_fax",
                "name_server_1", "name_server_2", "name_server_3", "name_server_4", "domain_status_1", "domain_status_2",
                "domain_status_3", "domain_status_4"
        );
        mapper.setLineTokenizer(tokenizer);
        mapper.setFieldSetMapper(new DomainInfoMapper());
        mapper.afterPropertiesSet();
        reader.setLinesToSkip(1);
        reader.setLineMapper(mapper);

        return reader;
    }

    @Bean
    public Step step1() {
        return this.stepBuilderFactory.get("ReadAndWrite").<DomainInfo, DomainInfo>chunk(50000)
                .reader(dbFileReader())
                .processor(itemProcessor)
                .writer(domainInfoWriter())
                .build();
    }

    @Bean
    public Job myDBUpdateJob() {
        return jobBuilderFactory.get("dbUpdateJob")
                .incrementer(new RunIdIncrementer())
                .start(step1())
                .build();
    }
}
