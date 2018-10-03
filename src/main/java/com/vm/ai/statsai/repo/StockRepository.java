/**
 * 
 */
package com.vm.ai.statsai.repo;

import java.util.List;
import org.springframework.data.couchbase.core.query.N1qlPrimaryIndexed;
import org.springframework.data.couchbase.core.query.Query;
import org.springframework.data.repository.CrudRepository;
import com.vm.ai.statsai.repo.ro.Stock;

/**
 * @author vignesh
 *
 */

@N1qlPrimaryIndexed
public interface StockRepository extends CrudRepository<Stock, String> {
    
  /**
   * Using springboot-data-couchbase findBy<field>
   *  
   * @param name
   * @return
   */
	Stock findByName(String name);
	
	/**
	 * N1ql query to get all stocks
	 * @return
	 */
	@Query("#{#n1ql.selectEntity} WHERE #{#n1ql.filter}")
	List<Stock> findAllStock();

}
