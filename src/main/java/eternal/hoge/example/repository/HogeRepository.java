package eternal.hoge.example.repository;

import org.springframework.data.repository.CrudRepository;

import eternal.hoge.example.entity.Hoge;

public interface HogeRepository extends CrudRepository<Hoge, Integer> {

}
