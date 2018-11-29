package learn.epam.mlhh.repos;

import learn.epam.mlhh.domain.Zapros;

import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface Zaprosrepo extends CrudRepository<Zapros, Long> {

    List<Zapros> findByTag(String tag);

}