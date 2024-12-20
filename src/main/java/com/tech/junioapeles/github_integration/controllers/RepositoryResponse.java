package com.tech.junioapeles.github_integration.controllers;

import com.fasterxml.jackson.annotation.JsonProperty;

public record RepositoryResponse(String id,
                                 @JsonProperty("html_url") String htmlUrl,
                                 @JsonProperty("private") boolean isPrivate) {

}
