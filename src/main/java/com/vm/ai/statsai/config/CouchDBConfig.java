/**
 * 
 */
package com.vm.ai.statsai.config;

import java.util.Collections;
import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.couchbase.config.AbstractCouchbaseConfiguration;
import org.springframework.data.couchbase.repository.config.EnableCouchbaseRepositories;

/**
 * @author vignesh
 *
 */
@Configuration
@EnableCouchbaseRepositories(basePackages = {"com.vm.ai.statsai.repo"})
public class CouchDBConfig extends AbstractCouchbaseConfiguration {
	@Value("${couchbase.cluster.hosts}")
	private String hosts;
	
	@Value("${couchbase.bucket.name}")
	private String bucketName;
	
	@Value("${couchbase.bucket.password}")
	private String password;
	

	/* (non-Javadoc)
	 * @see org.springframework.data.couchbase.config.AbstractCouchbaseConfiguration#getBootstrapHosts()
	 */
	@Override
	protected List<String> getBootstrapHosts() {
		// TODO Auto-generated method stub
		return Collections.singletonList(this.hosts);
	}

	/* (non-Javadoc)
	 * @see org.springframework.data.couchbase.config.AbstractCouchbaseConfiguration#getBucketName()
	 */
	@Override
	protected String getBucketName() {
		// TODO Auto-generated method stub
		return this.bucketName;
	}

	/* (non-Javadoc)
	 * @see org.springframework.data.couchbase.config.AbstractCouchbaseConfiguration#getBucketPassword()
	 */
	@Override
	protected String getBucketPassword() {
		// TODO Auto-generated method stub
		return this.password;
	}

}
