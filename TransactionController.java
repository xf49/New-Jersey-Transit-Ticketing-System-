package com.example.demo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.record.Record;
import com.example.demo.statistics.Statistics;

@RestController
@RequestMapping("/record")
public class TransactionController {

	@Autowired
	Statistics st;
	
	
	@PostMapping(path="/addrecord")
	public void addRecord(@RequestBody Record record) {
 
		st.addRecord(record);
				
	}
	
//	@PostMapping(path="/addsummary")
//	public void addSummary(@RequestBody Statistics st) {
// 
//		st.addSummary();
//				
//	}
	
	
	@RequestMapping(path="/all")
	@ResponseBody
	public ArrayList<Record> getAll(){
		return st.getAll();
	}
	
	
	@RequestMapping(path="/summary")
	@ResponseBody
	public List<Statistics> getSummary(){
		
		return st.getSummary();
	}
	
	
	//get SUM
	@RequestMapping(path="/sum")
	@ResponseBody
	public double getSum(){
		return st.getSum();
	}
	
	//get AVG
	@RequestMapping(path="/avg")
	@ResponseBody
	public double getAvg(){
		return st.getAvg();
	}
	
	
	//get MAX
	@RequestMapping(path="/max")
	@ResponseBody
	public double getMax(){
		return st.getMax();
	}
	
	
	//get MIN
	@RequestMapping(path="/min")
	@ResponseBody
	public double getMin(){
		return st.getMin();
	}
	
	
	//get COUNT
	@RequestMapping(path="/count")
	@ResponseBody
	public double getCount(){
		return st.getCount();
	}
	
	
	//GET record based on index
	@RequestMapping("{id}")
	@ResponseBody
	public Record getRecord(@PathVariable("id") Integer id) {
		return st.getRecord(id);
	}
	
	
	@DeleteMapping("{id}")
	@ResponseBody
	public void deleteRecord(@PathVariable("id") Integer id) {
		
		st.removeRecord(id);
		
		
	}
	
	
}
