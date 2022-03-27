package com.chrissid.FocusPlanBackend.repository;

import com.chrissid.FocusPlanBackend.domain.Project;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Long> {
}
