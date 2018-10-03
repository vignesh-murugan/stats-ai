/**
 * 
 */
package com.vm.ai.statsai.controllers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.vm.ai.statsai.repo.ro.Stock;
import com.vm.ai.statsai.services.StatsAiService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * Main Controller to get the stats results
 * 
 * @author vignesh
 *
 */
@RestController
@RequestMapping("/stats")
@Api("/stats")
public class StatsController {

  @Autowired
  private StatsAiService statsAiService;

  @RequestMapping(method = RequestMethod.GET, produces = "application/json")
  @ApiOperation(value = "Get all stock suggestions")
  @ApiResponses(
      value = {
          @ApiResponse(code = 200, message = "Success")
          })
  public Collection<Stock> getAll() {
    List<Stock> stocks = new ArrayList<Stock>();
    statsAiService.getAll().forEach(stock -> stocks.add(stock));
    return stocks;
  }

  @RequestMapping(method = RequestMethod.GET, value = "{name}")
  @ApiOperation(value = "Get stock suggestions by name")
  @ApiResponses(
      value = {
          @ApiResponse(code = 200, message = "Success"),
          @ApiResponse(code = 404, message = "Resource not found for tghe name")
          })
  public Stock getStock(
      @ApiParam(value = "name of the stock", required = true) @PathVariable String name) {
    return statsAiService.getStock(name);
  }

  @RequestMapping(method = RequestMethod.POST)
  @ResponseBody
  @ApiOperation(value = "Post new stock to API")
  @ApiResponses(
      value = {
           @ApiResponse(code = 201, message = "Created"),
           @ApiResponse(code = 500, message = "Internal server error"),
           @ApiResponse(code = 400, message = "Not valid inputs")
           })
  public Stock create(@ApiParam(value = "Stock Object", required = true,
      name = "Stock") @Valid @RequestBody Stock stock) {
    return statsAiService.save(stock);
  }

}
