package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.WhetherRepo;
import com.example.demo.entity.Whether;
@Service
public class WhetherServiceImpl implements WhetherService {
	@Autowired
	WhetherRepo wr;;

	@Override
	public void saveWhether(Whether w) {
		wr.save(w);
}

	@Override
	public Whether getWhetherDetails (int id) {
		// TODO Auto-geneWherated method stub
		return wr.findById(id).get();
	}

	@Override
	public List<Whether> getall() {
		// TODO Auto-generated method stub
		return wr.findAll();
	}

}
