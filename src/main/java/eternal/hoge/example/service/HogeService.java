package eternal.hoge.example.service;

import eternal.hoge.example.facade.HogeFacade;

import eternal.hoge.example.model.Result;
import eternal.hoge.example.repository.HogeRepository;

import java.util.Collection;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;


import org.springframework.beans.factory.annotation.Autowired;

public class HogeService {

    @Autowired
    private HogeFacade facade;

    // HTTP GET
	public Collection<Result> findAllHoge() {
		return facade.findAllHoge();
	}
    
	 // HTTP GET
	public Result findHoge(String id) {
		return facade.findHoge(id);
	}

	// for HTTP POST
	public void createHoge(Result hoge) {
		facade.createHoge(hoge);
	}
	
	// for HTTP PUT
	public void updateHoge(Result hoge) {
		facade.updateHoge(hoge);
	}
	
	// for HTTP DELETE
	public void deleteHoge(Result hoge) {
		facade.deleteHoge(hoge);
	}
	
    
	/*
	private final Map<String, Result> hoges = new TreeMap<String, Result>();

	private Random ran = new Random();

	public HogeService() {
		hoges.put("123", new Result(123, "first hoge"));
		hoges.put("456", new Result(456, "second hoge"));
		hoges.put("789", new Result(789, "third hoge"));
	}

	public Collection<Result> findAllHoge() {
		return hoges.values();
	}
	
	public Result findHoge(String id) {
		if ("789".equals(id)) {

			int delay = 500 + ran.nextInt(1500);
			try {
				Thread.sleep(delay);
			} catch (Exception e) {
				// ignore
			}
		}
		return hoges.get(id);
	}

	// for HTTP POST
	public void createHoge(Result hoge) {
		hoges.put(String.valueOf(hoge.getId()), new Result(hoge.getId(), hoge.getName()));
	}
	
	// for HTTP PUT
	public void updateHoge(Result hoge) {
		hoges.put(String.valueOf(hoge.getId()), new Result(hoge.getId(), hoge.getName()));
	}
	
	// for HTTP DELETE
	public void deleteHoge(Result hoge) {
		hoges.remove(String.valueOf(hoge.getId()));
	}
	*/
}
