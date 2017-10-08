package com.getgit;


import java.io.IOException;

import org.eclipse.egit.github.core.Repository;
import org.eclipse.egit.github.core.service.RepositoryService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetgitController {
	
	@RequestMapping("/getgit")
	public Repo repo(@RequestParam(value="username", required=false, defaultValue="defunkt") String username, @RequestParam(value="reponame", required=false, defaultValue="whitespace") String reponame) throws IOException
	{
		RepositoryService service = new RepositoryService();
		Repository repo = service.getRepository(username, reponame);
		return new Repo(repo.getName(),  repo.getCreatedAt(),  repo.getDescription(),  repo.getCloneUrl());
	}

}
