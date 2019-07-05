package com.jxlg.logistic.sys.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.elasticsearch.common.lucene.search.function.FunctionScoreQuery;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.index.query.functionscore.FunctionScoreQueryBuilder;
import org.elasticsearch.index.query.functionscore.ScoreFunctionBuilders;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.data.elasticsearch.core.query.SearchQuery;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.jxlg.logistic.repository.EmployeeEsRepository;
import com.jxlg.logistic.sys.entity.Employee;
import com.jxlg.logistic.sys.service.IEmployeeEsService;

@Service
public class EmployeeEsServiceImpl implements IEmployeeEsService{
	private static Logger LOGGER = LoggerFactory.getLogger(EmployeeEsServiceImpl.class);
	
	@Autowired
	private EmployeeEsRepository employeeEsRepository;

	@Override
	public void save(Employee employee) {
		employeeEsRepository.save(employee);
	}

	@Override
	public void deleteById(String empId) {
		employeeEsRepository.deleteById(empId);
	}

	@Override
	public List<Employee> search(Integer pageNumber, Integer pageSize, String searchContent) {
		if (StringUtils.isEmpty(pageNumber)) {
			pageNumber = 0;
		}
		if (StringUtils.isEmpty(pageSize)) {
			pageSize = 10;
		}
		Pageable pageable = new PageRequest(pageNumber, pageSize);
		// 权重查询
		List<FunctionScoreQueryBuilder.FilterFunctionBuilder> filterFunctionBuilders = new ArrayList<>();
		filterFunctionBuilders.add(new FunctionScoreQueryBuilder.FilterFunctionBuilder(
				QueryBuilders.matchQuery("empName", searchContent), ScoreFunctionBuilders.weightFactorFunction(1000)));
		filterFunctionBuilders.add(new FunctionScoreQueryBuilder.FilterFunctionBuilder(
				QueryBuilders.matchQuery("empSex", searchContent), ScoreFunctionBuilders.weightFactorFunction(100)));
		FunctionScoreQueryBuilder.FilterFunctionBuilder[] builders = new FunctionScoreQueryBuilder.FilterFunctionBuilder[filterFunctionBuilders
				.size()];
		filterFunctionBuilders.toArray(builders);
		FunctionScoreQueryBuilder functionScoreQueryBuilder = QueryBuilders.functionScoreQuery(builders)
				.scoreMode(FunctionScoreQuery.ScoreMode.SUM).setMinScore(2);
		// 创建搜索DSL查询
		SearchQuery searchQuery = new NativeSearchQueryBuilder().withPageable(pageable)
				.withQuery(functionScoreQueryBuilder).build();

		LOGGER.info(
				"\n search(): searchContent [" + searchContent + "] \n DSL  = \n " + searchQuery.getQuery().toString());

		// Page 1 of 0 containing UNKNOWN instances 权重问题
		Page<Employee> searchPageResults = employeeEsRepository.search(searchQuery);
		LOGGER.info(searchPageResults.getContent().toString());
		return searchPageResults.getContent();
	}

}
