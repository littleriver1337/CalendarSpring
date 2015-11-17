package com.theironyard.services;

import com.theironyard.entities.Event;
import com.theironyard.entities.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by zach on 11/15/15.
 */
public interface EventRepository extends PagingAndSortingRepository<Event, Integer> {
    Page<Event> findbyUser(Pageable pageable, User user);
}
