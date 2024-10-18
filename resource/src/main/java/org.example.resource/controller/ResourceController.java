package org.example.resource.controller;

import org.example.resource.entity.Resource;
import org.example.resource.service.ResourceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/resources")
public class ResourceController {

    private final ResourceService resourceService;

    public ResourceController(ResourceService resourceService) {
        this.resourceService = resourceService;
    }

    @PostMapping
    public Resource createResource(@RequestBody Resource resource) {
        return resourceService.createResource(resource);
    }

    @GetMapping
    public List<Resource> getAllResources(){
        return resourceService.getAllResources();
    }

    @GetMapping("/{id}")
    public Resource getResourceById(@PathVariable Long id) {
        return resourceService.getResourceById(id);
    }


    @PutMapping("/{id}")
    public Resource updateResource(@PathVariable Long id, @RequestBody Resource resource){
        resource.setId(id);
        return resourceService.updateResource(resource);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        resourceService.deleteResource(id);
    }
}
