package com.bridgelabz.user_registration_jwt.repository;

import com.bridgelabz.user_registration_jwt.model.UserData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<UserData, Integer> {

}