package com.example.OrmDataBase.repository;

import com.example.OrmDataBase.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> { //birinci hansi tip melumatin cedvelden goturulmesin yaziriq, sonra ise hemin datanin id tipin

}
