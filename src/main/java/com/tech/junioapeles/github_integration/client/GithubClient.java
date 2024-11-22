package com.tech.junioapeles.github_integration.client;

import com.tech.junioapeles.github_integration.controllers.RepositoryResponse;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.GetExchange;

import java.util.List;

public interface GithubClient {

    @GetExchange("/user/repos")
    public List<RepositoryResponse> listRespos(@RequestHeader("Authorization") String token,
                                               @RequestHeader(value = "X-Github-Api-Version", defaultValue = "2022-11-28")
                                               String apiVersion,
                                               @RequestParam("visibility") String visibility);
}
