package com.example.demo.statistics;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.record.Record;

@Service
public class Statistics {

	private static final Long OneMinuteInMillisecond = (long) 60000.00;
	
	private double sum;
	private double avg;
	private double max;
	private double min;
	private long count;
	
	

	ArrayList<Record> arrlist = new ArrayList<Record>();
	ArrayList<Statistics> Sarrlist = new ArrayList<Statistics>();
	
	
	//constructor
    public Statistics(double sum, double avg, double max, double min, long count) {
		super();
		this.sum = sum;
		this.avg = avg;
		this.max = max;
		this.min = min;
		this.count = count;
	}


	public Statistics() {

	}


	//POST a new transaction
	public void addRecord(Record record) {
		ZonedDateTime utc = ZonedDateTime.now(ZoneOffset.UTC);
		long EpochInMillis = utc.toEpochSecond() * 1000;
		if(record.getTimestamp()>EpochInMillis-OneMinuteInMillisecond) {
		arrlist.add(record);
		}
	}
	
	
	
	
	//GET all transaction records 
	public ArrayList<Record> getAll(){
		return arrlist;
	}

	

	//GET a transaction record based on index
	public Record getRecord(Integer id) {

		return arrlist.get(id);
	}
	
	

	
	//DELETE a record based on index
	public void removeRecord(Integer id) {
		
		arrlist.remove(arrlist.get(id));
	}
	
	


	
	public double getSum() {
		
		for(int i=0;i<arrlist.size();i++) {
			sum+=arrlist.get(i).getAmount();
		}
		
		return sum;
		
	}
	

	
	public double getAvg() {
		for(int i=0;i<arrlist.size();i++) {
			sum+=arrlist.get(i).getAmount();
		}
		
		avg=sum/arrlist.size();
		return avg;
	}
	
	

	
	public double getMax() {
		
		double max=arrlist.get(0).getAmount();
		
		for(int i=1;i<arrlist.size();i++) {
			if(arrlist.get(i).getAmount()>max) {
				max=arrlist.get(i).getAmount();
			}
		}
		return max;
	}
	
	
	

	
	public double getMin() {
		
		double min=arrlist.get(0).getAmount();
		
		for(int i=1;i<arrlist.size();i++) {
			if(arrlist.get(i).getAmount()<min) {
				min=arrlist.get(i).getAmount();
			}
		}
		return min;
	}
	
	

	
	public long getCount() {
		count=arrlist.size();
		return count;
	}
	
	
	//Add transaction record summary
	public void AddSummary() {
		Statistics sta = new Statistics();
		
		sta.getSum();
		sta.getAvg();
		sta.getMax();
		sta.getMin();
		sta.getCount();
        Sarrlist.add(sta);
		
		
		
	}

	
	//GET transaction record summary
	public List<Statistics> getSummary(){

		return Sarrlist;

	}

}
