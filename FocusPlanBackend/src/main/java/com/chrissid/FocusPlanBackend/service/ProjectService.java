package com.chrissid.FocusPlanBackend.service;

import com.chrissid.FocusPlanBackend.domain.Project;
import com.chrissid.FocusPlanBackend.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public Project saveOrUpdateProject(Project project){
        return projectRepository.save(project);
    }
}
