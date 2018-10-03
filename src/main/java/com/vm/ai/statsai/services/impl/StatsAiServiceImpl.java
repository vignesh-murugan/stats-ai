/**
 * 
 */
package com.vm.ai.statsai.services.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vm.ai.statsai.repo.StockRepository;
import com.vm.ai.statsai.repo.ro.Stock;
import com.vm.ai.statsai.services.StatsAiService;

/**
 * @author vignesh
 *
 */
@Service
public class StatsAiServiceImpl implements StatsAiService {

	@Autowired
	private StockRepository stockRepository;

	@Override
	public List<Stock> getAll() {
		List<Stock> stocks = new ArrayList<>();
		stockRepository.findAllStock().forEach(stock -> stocks.add(stock));
		return stocks;
	}

	@Override
	public Stock getStock(String name) {
		// TODO Auto-generated method stub
		return stockRepository.findByName(name);
	}

	@Override
	public Stock save(Stock stock) {
		return stockRepository.save(stock);
	}

}
