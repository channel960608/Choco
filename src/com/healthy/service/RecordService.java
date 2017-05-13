package com.healthy.service;

import java.util.List;

import com.healthy.bean.Record;

public interface RecordService {
	void saveRecord(Record record);
	void updateRecord(Record record);
	void deleteRecord(Record record);
	public List<Record> findRecordByUserId(String id);
	public List<Record> findRecordByProId(String id);
	public List<Record> findRecordBySerId(String id);
	public Record findRecordById(int id);
	public List<Record> getRecord();
	
}
