package com.in28minutes.cloudDydko.webservices.restfulwebservice.user;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer > {
}
