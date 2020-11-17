package com.se.schedule.dao.hello;

import com.se.schedule.entity.Hello;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
//@Repository
public interface HelloDao extends CrudRepository<Hello, Long> {

    public Hello findById(long id);
    public Hello findByTitle(String title);
    public Hello findByText(String text);


}
