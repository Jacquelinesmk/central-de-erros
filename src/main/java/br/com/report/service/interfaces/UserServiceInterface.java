package br.com.report.service.interfaces;

import java.util.List;
import java.util.Optional;

import br.com.report.entity.User;

public interface UserServiceInterface {

    Optional<User> findById(Long id);
    List<User> findAll();
    void changeStatus(User user);

}
