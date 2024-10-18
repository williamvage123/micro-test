package org.example.resource.service;

import org.example.resource.entity.Resource;
import org.example.resource.repository.ResourceRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResourceService {

    private final ResourceRepository resourceRepository;

    public ResourceService(ResourceRepository resourceRepository) {
        this.resourceRepository = resourceRepository;
    }

    public Resource createResource(Resource resource) {
        return resourceRepository.save(resource);
    }

    public Resource getResourceById(Long id) {
        return resourceRepository.findById(id).orElse(null);
    }

    public List<Resource> getAllResources(){
        return resourceRepository.findAll();
    }

    public Resource updateResource(Resource resource){
        return resourceRepository.save(resource);
    }

    public void deleteResource(Long id) {
        resourceRepository.deleteById(id);
    }
}
