package fr.hibernatecours.hibernatewild.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import fr.hibernatecours.hibernatewild.entities.User;

@Repository
public interface UserDao extends JpaRepository<User, Long> {
}