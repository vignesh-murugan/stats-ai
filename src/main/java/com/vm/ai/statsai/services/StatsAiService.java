/**
 * 
 */
package com.vm.ai.statsai.services;

import java.util.List;
import com.vm.ai.statsai.repo.ro.Stock;

/**
 * @author vignesh
 *
 */
public interface StatsAiService {
  /**
   *  To get all the stocks in DB
   * @return
   */
	List<Stock> getAll();

	/**
	 * Get specific stock with name
	 * @param name
	 * @return
	 */
	Stock getStock(String name);
	
	/**
	 * create new stock data in DB
	 * 
	 * @param stock
	 * @return
	 */
	Stock save(Stock stock);

}
