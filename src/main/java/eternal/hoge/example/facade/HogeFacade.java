package eternal.hoge.example.facade;

import java.util.Collection;
import java.util.LinkedList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import eternal.hoge.example.entity.Hoge;
import eternal.hoge.example.model.Result;
import eternal.hoge.example.repository.HogeRepository;

@Component
public class HogeFacade {

    @Autowired
    HogeRepository hoges;
	
	public Collection<Result> findAllHoge() {
		Collection<Result> list = new LinkedList<Result>();
		Iterable<Hoge> results = hoges.findAll();
		results.forEach(result -> {
			Result response = new Result();
			response.setId(result.getId());
			response.setName(result.getName());	
			list.add(response);
		});

		return list;
	}
	
	public Result findHoge(String id) {
		Hoge hoge = (Hoge)hoges.findOne(Integer.parseInt(id));
		Result result = new Result();
		result.setId(hoge.getId());
		result.setName(hoge.getName());
		return result;
	}

	public void createHoge(Result hoge) {
		Hoge newEntity = new Hoge();
		newEntity.setName(hoge.getName());
		newEntity.setAge(99);
		hoges.save(newEntity);
	}
	
	// for HTTP PUT
	public void updateHoge(Result hoge) {
		Hoge newEntity = new Hoge();
		newEntity.setName(hoge.getName());
		hoges.save(newEntity);
	}
	
	// for HTTP DELETE
	public void deleteHoge(Result hoge) {
		hoges.delete(hoge.getId());
	}
}
